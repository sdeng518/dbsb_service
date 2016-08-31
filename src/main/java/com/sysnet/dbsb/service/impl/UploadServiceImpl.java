/**
* @Title: UploadServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:57:41
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.namespace.QName;

import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.rpc.client.RPCServiceClient;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.FeeSettlementMapper;
import com.sysnet.dbsb.dao.HospitalDao;
import com.sysnet.dbsb.dao.HospitalFeeSettlementDao;
import com.sysnet.dbsb.dao.HospitalItemDao;
import com.sysnet.dbsb.dao.HospitalRegistrationDao;
import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.dao.PayeeInformationDao;
import com.sysnet.dbsb.model.common.ConfigInfo;
import com.sysnet.dbsb.model.common.FeeSettlement;
import com.sysnet.dbsb.model.common.Hospital;
import com.sysnet.dbsb.model.common.HospitalFeeSettlement;
import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.common.InsuredPerson;
import com.sysnet.dbsb.model.common.PayeeInformation;
import com.sysnet.dbsb.model.picc.BodyRespond;
import com.sysnet.dbsb.model.picc.Head;
import com.sysnet.dbsb.model.picc.H210.Body_Request_H210;
import com.sysnet.dbsb.model.picc.H210.MedResult;
import com.sysnet.dbsb.model.picc.H210.MedResultList;
import com.sysnet.dbsb.model.picc.H210.Staff;
import com.sysnet.dbsb.model.picc.H210.UploadMedResult_Request;
import com.sysnet.dbsb.model.picc.H213.Body_Request_H213;
import com.sysnet.dbsb.model.picc.H213.FeeList;
import com.sysnet.dbsb.model.picc.H213.UploadFeeDetail_Request;
import com.sysnet.dbsb.model.picc.H213.UploadFeeDetail_Respond;
import com.sysnet.dbsb.model.picc.H214.Body_Request_H214;
import com.sysnet.dbsb.model.picc.H214.CancelUploadMedResult_Request;
import com.sysnet.dbsb.model.picc.H301.Body_Request_H301;
import com.sysnet.dbsb.model.picc.H301.HospitalInformation;
import com.sysnet.dbsb.model.picc.H301.HospitalInformationUpload_Request;
import com.sysnet.dbsb.model.picc.H304.Body_Request_H304;
import com.sysnet.dbsb.model.picc.H304.StaffInformation;
import com.sysnet.dbsb.model.picc.H304.StaffUpload_Request;
import com.sysnet.dbsb.service.UploadService;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * @ClassName: UploadServiceImpl
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午5:57:41
 */
@Service
public class UploadServiceImpl implements UploadService {
	@Resource
	private InsuredPersonDao insuredPersonDao;
	@Resource
	private HospitalRegistrationDao hospitalRegistrationDao;
	@Resource
	private PayeeInformationDao payeeInformationDao;
	@Resource
	private HospitalFeeSettlementDao hospitalFeeSettlementDao;
	@Resource
	private HospitalItemDao hospitalItemDao;
	@Resource
	private HospitalDao hospitalDao;
	@Resource
	private ConfigInfo configInfo;
	@Resource
	private FeeSettlementMapper feeSettlementMapper;
	
	private String areaCode = "610115";
	private String hospitalSeq;
	private String hospitalCode;
	private FeeSettlement record;
	/*
	 * (非 Javadoc) <p>Title: uploadPerson</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadPerson(java.lang.String)
	 */
	public boolean uploadPerson(String id) {
		InsuredPerson insuredPerson = insuredPersonDao.queryById(id);

		if (insuredPerson != null) {
			StaffInformation staffInformation = new StaffInformation();
			staffInformation.setPersonIDCard(insuredPerson.getId_number());
			staffInformation.setSex(insuredPerson.getSex());
			staffInformation.setNation(insuredPerson.getNation());
			staffInformation.setBirthDate(insuredPerson.getBirthday());
			staffInformation.setMarriageStatus(insuredPerson.getMarriage_state());
			staffInformation.setHeathStatus(insuredPerson.getPersonal_identity());
			staffInformation.setNrcID(insuredPerson.getMedical_record_no());
			staffInformation.setPersonCode(insuredPerson.getMedical_record_no());
			staffInformation.setMobileTel(insuredPerson.getPhone());
			staffInformation.setDistrictCode(areaCode);
			staffInformation.setName(insuredPerson.getName());

			Head head = buildHead("H304");
			StaffUpload_Request staffUpload_Request = new StaffUpload_Request();
			staffUpload_Request.setHead(head);
			List<Body_Request_H304> bodies = new ArrayList<Body_Request_H304>();
			Body_Request_H304 body_Request_H304 = new Body_Request_H304();
			body_Request_H304.setStaffInformation(staffInformation);

			bodies.add(body_Request_H304);
			staffUpload_Request.setBody(bodies);
			String xmlRequest = JAXBUtil.convertToXml(staffUpload_Request);
			
			request(xmlRequest);

		}
		return false;

	}

	/**
	 * @Title: request @Description: @param xmlRequest void @throws
	 */
	private String request(String xmlRequest) {
		String xmlResponse = null;
		
		System.out.println(xmlRequest);
		
		RPCServiceClient serviceClient;
		try {
			serviceClient = new RPCServiceClient();
			Options options = serviceClient.getOptions();
			// 指定访问的web service地址
			EndpointReference targetEPR = new EndpointReference(configInfo.getWs_url());
			options.setTo(targetEPR);

			// 指定方法，注意指定命名空间
			String method = "transBusinessForPICC";
			QName opPrint = new QName(configInfo.getWs_url(), method);
			// 确定参数类型和参数值
			Class[] returnTypes = new Class[] { String.class };
			Object obj[] = new Object[] { xmlRequest };
			// 得到返回结果，是一个数组
			Object[] order = serviceClient.invokeBlocking(opPrint, obj, returnTypes);

			if (!ArrayUtils.isEmpty(order)) {
				xmlResponse = String.valueOf(order[0]);
				
				//解析xml结果，将结果保持到数据库
				UploadFeeDetail_Respond respond = JAXBUtil.converyToJavaBean(xmlResponse, UploadFeeDetail_Respond.class);
				if (respond !=null) {
					Head head = respond.getHead();
					BodyRespond body = respond.getBody();
					record.setGROUP_ID(head.getTransRefGUID());
					record.setBUS_CODE(head.getTransactionCode());
					record.setBUS_SUB_CODE(head.getTransactionCode());
					record.setSTATUS(body.getSuccessFlag());
					record.setMSG(body.getDescription());
					
					feeSettlementMapper.insertSelective(record);
				}
			}

		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(xmlResponse);

		return xmlResponse;
	}

	/*
	 * (非 Javadoc) <p>Title: uploadAllPerson</p> <p>Description: </p>
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadAllPerson()
	 */
	@Override
	public void uploadAllPerson() {
		// TODO Auto-generated method stub

	}

	/*
	 * (非 Javadoc) <p>Title: uploadHospital</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#uploadHospital(java.lang.String)
	 */
	@Override
	public void uploadHospital(String id) {
		Hospital hospital = hospitalDao.queryById(id);
		if (hospital != null) {
			Head head = buildHead("H301");

			HospitalInformationUpload_Request hospitalInformationUpload_Request = new HospitalInformationUpload_Request();
			hospitalInformationUpload_Request.setHead(head);

			HospitalInformation hospitalInformation = new HospitalInformation();
			hospitalInformation.setHospitalCode(hospital.getHospital_code());
			hospitalInformation.setPiccHosOrgCode(hospital.getHospital_code());//140000001104
			hospitalInformation.setHospitalName(hospital.getName());
			hospitalInformation.setHospitalType(hospital.getNature());
			hospitalInformation.setHospitalGrade(hospital.getHospital_grade());
			hospitalInformation.setHospitalFlag(hospital.getNature());
			hospitalInformation.setLegalPersonName(hospital.getContacts());
			hospitalInformation.setLegalPersonTel(hospital.getPhone());
			hospitalInformation.setContractAddr(hospital.getAddress());
			hospitalInformation.setDistrictCode(areaCode);
			hospitalInformation.setApprovalDate(hospital.getCurrent_level_start_time());
			hospitalInformation.setEndDate(hospital.getCurrent_level_end_time());
			hospitalInformation.setHospitalSign(hospital.getWhether_ding());
			Body_Request_H301 body_Request_H301 = new Body_Request_H301();
			body_Request_H301.setHospitalInformation(hospitalInformation);

			hospitalInformationUpload_Request.setBody(body_Request_H301);
			String xmlRequest = JAXBUtil.convertToXml(hospitalInformationUpload_Request);
			
			request(xmlRequest);
		}
	}

	/**
	 * @param transactionCode
	 *            TODO @Title: buildHead @Description: @return Head @throws
	 */
	private Head buildHead(String transactionCode) {
		Head head = new Head();
		head.setTransactionCode(transactionCode);
		String transRefGUID = BusinessUtil.getTransRefGUID(areaCode, hospitalCode, hospitalSeq);
		head.setTransRefGUID(transRefGUID);
		String messageId = BusinessUtil.getMessageID();
		head.setMessageId(messageId);
		head.setCorrelationId(messageId);
		String messageDateTime = BusinessUtil.getCurrentTimeISO();
		head.setMessageDateTime(messageDateTime);

		return head;
	}

	/*
	 * (非 Javadoc) <p>Title: uploadAllHospital</p> <p>Description: </p>
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadAllHospital()
	 */
	@Override
	public void uploadAllHospital() {
		// TODO Auto-generated method stub

	}

	/*
	 * (非 Javadoc) <p>Title: uploadTreatment</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#uploadTreatment(java.lang.String)
	 */
	@Override
	public void uploadTreatment(String id) {

	}

	/*
	 * (非 Javadoc) <p>Title: uploadTreatment</p> <p>Description: </p>
	 * 
	 * @param registration
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#uploadTreatment(com.sysnet.dbsb.
	 * model.common.HospitalRegistration)
	 */
	@Override
	public boolean uploadTreatment(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				Head head = buildHead("H210");
				UploadMedResult_Request uploadMedResult_Request = new UploadMedResult_Request();
				uploadMedResult_Request.setHead(head);
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalFeeSettlement> settlements = hospitalFeeSettlementDao.queryByFilter(filter);
				// 结算信息
				MedResult medResult = new MedResult();
				medResult.setTransRefGUID(BusinessUtil.getTransRefGUID(areaCode, hospitalCode, hospitalSeq));
				if (settlements != null && !settlements.isEmpty()) {
					HospitalFeeSettlement settlement = settlements.get(0);
					medResult.setHospitalCode(registration.getDing_hosp_code());
					medResult.setClinicSerialNum(registration.getHospital_registration_sn());
					medResult.setSenderCode(areaCode);
					medResult.setReceiptNum(settlement.getSettlement_number());
					medResult.setInpatientDate(registration.getIn_date());
					medResult.setInpatientDiagnosisDiseaseCode(registration.getMain_diagnosis_code());
					medResult.setInpatientDiagnosisDiseaseName(registration.getMain_diagnosis_code());
					medResult.setDischarge_date(settlement.getLeave_date());
					medResult.setDischargeCheifDiagnosis(settlement.getLeave_disease_code());
					medResult.setDischargeCheifDiagnosisName(settlement.getLeave_disease_code());
					medResult.setDepartmentCode(registration.getSection_office());
					medResult.setSickbedNum(registration.getBed_number());
					medResult.setDoctorCode(registration.getMaster_doctor());
					medResult.setClinicNum(settlement.getSettlement_number());

					medResult.setMedicalPaymentTotalAmount(settlement.getTotal_payment());
					medResult.setPlanFundBySI(settlement.getYb_compensation());
					medResult.setBigDiseaseCompenFee(settlement.getDb_compensation());
					medResult.setBasicMedTotalFeeAdd(settlement.getTotal_payment());
					medResult.setPlanFundBySIAdd(settlement.getYb_year_compensation());
					medResult.setBigDiseaseCompenFeeAdd(settlement.getDb_year_compensation());
					medResult.setFeeField1(settlement.getFit_into_yb_amount());
					medResult.setDistrictCode(areaCode);
					medResult.setReserveField1(settlement.getLeave_date());
				}

				Body_Request_H210 body = new Body_Request_H210();
				// 参保人信息
				Staff staff = new Staff();
				InsuredPerson person = insuredPersonDao.queryById(registration.getMedical_record_no());
				if (person != null) {
					staff.setID(person.getId_number());
					staff.setGender(person.getSex());
					staff.setNation(person.getNation());
					staff.setBirthday(person.getBirthday());
					staff.setBirthplace(person.getHome_address());
					staff.setMaritalStatus(person.getMarriage_state());
					staff.setHealthState(person.getPersonal_identity());
					staff.setNrcID(person.getMedical_record_no());
					staff.setPersonalID(person.getMedical_record_no());
					staff.setTelephone(person.getPhone());
					staff.setDistrictCode(areaCode);
					staff.setHomeAddress(person.getHome_address());
					staff.setName(person.getName());
					
				}
				PayeeInformation payee = payeeInformationDao.queryById(registration.getMedical_record_no());
				payee.setPersonalID(payee.getIDNumber());
				
				body.setStaffInformation(staff);
				body.setPayeeInformation(payee);
				List<MedResult> medResultList = new ArrayList<MedResult>();
				medResultList.add(medResult);
				MedResultList list = new MedResultList();
				list.setMedResults(medResultList);
				body.setMedResultList(list);
				uploadMedResult_Request.setBody(body);
				buildRecord(registration);
				String xmlRequest = JAXBUtil.convertToXml(uploadMedResult_Request);
				
				request(xmlRequest);
			}

		}
		return false;

	}

	/*
	 * (非 Javadoc) <p>Title: uploadAllTreatment</p> <p>Description: </p>
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadAllTreatment()
	 */
	@Override
	public void uploadAllTreatment() {

	}

	/*
	 * (非 Javadoc) <p>Title: uploadTreatDetail</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#uploadTreatDetail(java.lang.String)
	 */
	@Override
	public boolean uploadTreatDetail(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				Head head = buildHead("H213");
				UploadFeeDetail_Request uploadFeeDetail_Request = new UploadFeeDetail_Request();
				uploadFeeDetail_Request.setHead(head);
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalItem> items = hospitalItemDao.queryByFilter(filter);
				// 就诊明细
				Body_Request_H213 body = new Body_Request_H213();
				List<FeeList> feeLists = new ArrayList<FeeList>();
				for (HospitalItem hospitalItem : items) {
					FeeList feeList = new FeeList();
					feeList.setHospitalCode(registration.getDing_hosp_code());
					feeList.setClinicSerialNum(hospital_registration_sn);
					feeList.setReceiptNum(hospital_registration_sn);
					feeList.setSenderCode(areaCode);
					feeList.setHisCode(hospitalItem.getYy_three_catalog_code());
					feeList.setHisName(hospitalItem.getYy_three_catalog_name());
					feeList.setNrcCode(hospitalItem.getYb_three_catalog_code());
					feeList.setNrcName(hospitalItem.getYb_three_catalog_name());
					feeList.setPiccCode(hospitalItem.getYb_three_catalog_code());
					feeList.setPiccName(hospitalItem.getYb_three_catalog_name());
					feeList.setCharge_date(hospitalItem.getOrder_executed_date());
					feeList.setCharge_Catalog_Type(hospitalItem.getYb_three_catalog_type());
					feeList.setFeeClassification(hospitalItem.getYb_three_catalog_category());
					feeList.setUnitPrice(hospitalItem.getPrice());
					feeList.setQuantity(hospitalItem.getQuantity());
					feeList.setAmount(hospitalItem.getTotal_amount());
					feeList.setListSerialNum(hospitalItem.getListSerialNum());

					feeLists.add(feeList);
				}

				body.setFeeLists(feeLists);
				uploadFeeDetail_Request.setBody(body);
				buildRecord(registration);
				
				String xmlRequest = JAXBUtil.convertToXml(uploadFeeDetail_Request);
				
				request(xmlRequest);
			}

		}
		return false;
	}

	/**
	* @Title: buildRecord
	* @Description: 
	* @param registration void
	* @throws
	*/
	private void buildRecord(HospitalRegistration registration) {
		record = new FeeSettlement();
		record.setMEDICAL_RECORD_NO(registration.getMedical_record_no());
		record.setHOSPITAL_REGISTRATION_SN(registration.getHospital_registration_sn());
		record.setNAME(registration.getName());
		record.setSEX(registration.getSex());
		record.setIN_HOSPITAL_STYLE(registration.getIn_hospital_style());
		record.setID_TYPE(registration.getId_type());
		record.setID_NUMBER(registration.getId_number());
		try {
			record.setIN_DATE(DateUtils.parseDate(registration.getIn_date(),"yyyy-mm-dd"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		record.setBABY_NAME(registration.getBaby_name());
		record.setPHONE(registration.getPhone());
		record.setMOBILEPHONE(registration.getMobilephone());
		record.setACCIDENT_REASON(registration.getAccident_reason());
		record.setBASIC_MEDICAL_TYPE(registration.getBasic_medical_type());
		record.setBED_NUMBER(registration.getBed_number());
		record.setSECTION_OFFICE(registration.getSection_office());
		record.setINITIAL_DIAGNOSIS(registration.getInitial_diagnosis());
		record.setCOMPLICATION(registration.getComplication());
		record.setMAIN_DIAGNOSIS_CODE(registration.getMain_diagnosis_code());
		record.setOTHER_DIAGNOSIS_CODE(registration.getOther_diagnosis_code());
		record.setMASTER_DOCTOR(registration.getMaster_doctor());
		record.setDING_HOSP_CODE(registration.getDing_hosp_code());
		record.setMEMO(registration.getMemo());
	}

	/*
	 * (非 Javadoc) <p>Title: uploadCancelTreatment</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#uploadCancelTreatment(java.lang.
	 * String)
	 */
	@Override
	public boolean uploadCancelTreatment(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				Head head = buildHead("H214");
				CancelUploadMedResult_Request cancelUploadMedResult_Request = new CancelUploadMedResult_Request();
				cancelUploadMedResult_Request.setHead(head);
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalFeeSettlement> settlements = hospitalFeeSettlementDao.queryByFilter(filter);
				// 结算信息
				Body_Request_H214 body = new Body_Request_H214();
				if (settlements != null && !settlements.isEmpty()) {
					HospitalFeeSettlement settlement = settlements.get(0);
					body.setHospitalCode(registration.getDing_hosp_code());
					body.setClinicSerialNum(registration.getHospital_registration_sn());
					body.setClinicNum(settlement.getSettlement_number());
					body.setReceiptNum(settlement.getSettlement_number());
					body.setSenderCode(areaCode);
				}
				cancelUploadMedResult_Request.setBody(body);
				buildRecord(registration);
				String xmlRequest = JAXBUtil.convertToXml(cancelUploadMedResult_Request);
				request(xmlRequest);
			}

		}
		return false;

	}

	/* (非 Javadoc)
	* <p>Title: searchTreatment</p>
	* <p>Description: </p>
	* @param medical_record_no
	* @param hospital_registration_sn
	* @see com.sysnet.dbsb.service.UploadService#searchTreatment(java.lang.String, java.lang.String)
	*/
	@Override
	public boolean searchTreatment(String medical_record_no, String hospital_registration_sn) {
		return false;
		// TODO Auto-generated method stub
		
	}

	/* (非 Javadoc)
	* <p>Title: uploadCompensation</p>
	* <p>Description: </p>
	* @param medical_record_no
	* @param hospital_registration_sn
	* @see com.sysnet.dbsb.service.UploadService#uploadCompensation(java.lang.String, java.lang.String)
	*/
	@Override
	public boolean uploadCompensation(String medical_record_no, String hospital_registration_sn) {
		return false;
		// TODO Auto-generated method stub
		
	}

	/* (非 Javadoc)
	* <p>Title: uploadRegistration</p>
	* <p>Description: </p>
	* @param medical_record_no
	* @see com.sysnet.dbsb.service.UploadService#uploadRegistration(java.lang.String)
	*/
	@Override
	public boolean uploadRegistration(String medical_record_no, String hospital_registration_sn) {
		return false;
		// TODO Auto-generated method stub
		
	}

}
