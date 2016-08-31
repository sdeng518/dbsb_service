/**
 * @Title: UploadServiceImpl4PLICC.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:57:41
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessageAware;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sysnet.common.annotation.SystemServiceLog;
import com.sysnet.dbsb.dao.DBMessageMapper;
import com.sysnet.dbsb.dao.DBPaymentMapper;
import com.sysnet.dbsb.dao.HospitalDao;
import com.sysnet.dbsb.dao.HospitalFeeSettlementDao;
import com.sysnet.dbsb.dao.HospitalItemDao;
import com.sysnet.dbsb.dao.HospitalRegistrationDao;
import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.dao.PayeeInformationDao;
import com.sysnet.dbsb.dao.xnh.D506Mapper;
import com.sysnet.dbsb.model.common.ConfigInfo;
import com.sysnet.dbsb.model.common.DBMessage;
import com.sysnet.dbsb.model.common.DBPayment;
import com.sysnet.dbsb.model.common.DBPaymentKey;
import com.sysnet.dbsb.model.common.Hospital;
import com.sysnet.dbsb.model.common.HospitalFeeSettlement;
import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.common.InsuredPerson;
import com.sysnet.dbsb.model.picc.Head;
import com.sysnet.dbsb.model.plicc.callback.CallBackBody;
import com.sysnet.dbsb.model.plicc.callback.CallBack_Request;
import com.sysnet.dbsb.model.plicc.callback.HospitalCompensationCancelInfo;
import com.sysnet.dbsb.model.plicc.compensation.CompensationBody;
import com.sysnet.dbsb.model.plicc.compensation.Compensation_Request;
import com.sysnet.dbsb.model.plicc.compensation.HospitalCompensationInfo;
import com.sysnet.dbsb.model.plicc.detail.DetailBody;
import com.sysnet.dbsb.model.plicc.detail.Detail_Request;
import com.sysnet.dbsb.model.plicc.detail.HospitalFeeDetailInfo;
import com.sysnet.dbsb.model.plicc.person.PersonBody;
import com.sysnet.dbsb.model.plicc.person.Person_Request;
import com.sysnet.dbsb.model.plicc.registration.RegistrationBody;
import com.sysnet.dbsb.model.plicc.registration.Registration_Request;
import com.sysnet.dbsb.model.plicc.settlement.HospitalFeeSettlementInfo;
import com.sysnet.dbsb.model.plicc.settlement.SettlementBody;
import com.sysnet.dbsb.model.plicc.settlement.Settlement_Request;
import com.sysnet.dbsb.model.plicc.xnh.D506;
import com.sysnet.dbsb.service.UploadService;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;
import com.sysnet.dbsb.ws.plicc.WebServiceInterface;
import com.sysnet.dbsb.ws.plicc.WebServiceInterfaceService;

/**
 * @ClassName: UploadServiceImpl4PLICC
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午5:57:41
 */
@Service
public class UploadServiceImpl4PLICC implements UploadService {
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
	private String areaCode = "610115";
	private String hospitalSeq;
	private String hospitalCode;
	@Resource
	private DBMessageMapper messageDao;
	@Resource
	private DBPaymentMapper paymentDao;

	private static final Logger logger = LoggerFactory.getLogger(UploadService.class);
	private static final String Successful = "1";
	private DBMessage message = new DBMessage();

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
			Person_Request request = new Person_Request();
			PersonBody body = new PersonBody();
			body.setInsuredPerson(insuredPerson);
			request.setBody(body);
			com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
			request.setHead(head);

			String xmlRequest = JAXBUtil.convertToXml(request);
			request(xmlRequest, head);
		}
		return false;
	}

	/**
	 * @Title: request @Description: @param xmlRequest void @throws
	 * @param head
	 *            TODO
	 */
	@SystemServiceLog(description = "数据服务接口")
	private String request(String xmlRequest, com.sysnet.dbsb.model.plicc.Head head) {
		WebServiceInterfaceService service;
		String xmlResponse = null;
		logger.info(xmlRequest);

		try {

			service = new WebServiceInterfaceService(configInfo.getWs_url_plicc());
			WebServiceInterface portType = service.getWebServiceInterfacePort();

			xmlResponse = portType.excute(xmlRequest);

			if (head != null) {
				message.setBUS_CODE(head.getBus_code());
				message.setBUS_SUB_CODE(head.getBus_sub_code());
			} else {
				message.setBUS_CODE("99999");
			}
			message.setREQUEST(xmlRequest);
			message.setRESPONSE(xmlResponse);
			messageDao.insertSelective(message);

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.info(xmlResponse);

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
	@SystemServiceLog(description = "上传结算数据")
	public boolean uploadTreatment(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalFeeSettlement> settlements = hospitalFeeSettlementDao.queryByFilter(filter);
				// 结算信息
				if (settlements != null && !settlements.isEmpty()) {
					HospitalFeeSettlement settlement = settlements.get(0);

					Settlement_Request request = new Settlement_Request();

					SettlementBody body = new SettlementBody();

					HospitalFeeSettlementInfo hospitalFeeSettlementInfo = new HospitalFeeSettlementInfo();
					hospitalFeeSettlementInfo.setHospitalRegistration(registration);
					hospitalFeeSettlementInfo.setHospitalFeeSettlement(settlement);
					List<HospitalItem> hospitalFees = hospitalItemDao.queryByFilter(filter);
					hospitalFeeSettlementInfo.setHospitalFees(hospitalFees);

					body.setHospitalFeeSettlementInfo(hospitalFeeSettlementInfo);
					com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
					head.setDing_hosp_code(registration.getDing_hosp_code());
					head.setArea_code(registration.getMedical_record_no().substring(0, 6));
					request.setBody(body);
					request.setHead(head);

					String xmlRequest = JAXBUtil.convertToXml(request);
					String responseXml = request(xmlRequest, head);
					afterUploadTreat(medical_record_no, hospital_registration_sn, responseXml);
				}
			}
		}
		return false;

	}

	/**
	 * @Title: debug @Description: @param registration @param settlement
	 * void @throws
	 */
	private void debug(HospitalRegistration registration, HospitalFeeSettlement settlement) {
		registration.setMedical_record_no("6104020080040080009");
		registration.setId_number("610402194603106119");
		registration.setName("钟学兵");
		registration.setIn_date("2016-02-01");
		settlement.setLeave_date("2016-03-01");
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
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalItem> hospitalFees = hospitalItemDao.queryByFilter(filter);
				// 结算信息
				if (hospitalFees != null && !hospitalFees.isEmpty()) {
					Detail_Request request = new Detail_Request();
					DetailBody body = new DetailBody();
					HospitalFeeDetailInfo feeDetailInfo = new HospitalFeeDetailInfo();

					feeDetailInfo.setHospitalFees(hospitalFees);
					feeDetailInfo.setId_number(registration.getId_number());
					feeDetailInfo.setId_type(registration.getId_type());
					feeDetailInfo.setMedical_record_no(registration.getMedical_record_no());
					feeDetailInfo.setHospital_registration_sn(registration.getHospital_registration_sn());
					feeDetailInfo.setName(registration.getName());
					feeDetailInfo.setSex(registration.getSex());

					body.setHospitalFeeDetailInfo(feeDetailInfo);
					com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
					head.setDing_hosp_code(registration.getDing_hosp_code());
					head.setArea_code(registration.getMedical_record_no().substring(0, 6));
					request.setBody(body);
					request.setHead(head);

					String xmlRequest = JAXBUtil.convertToXml(request);
					// System.out.println(xmlRequest);
					String responseXml = request(xmlRequest, head);
					if (StringUtils.contains(responseXml, "<status>1")) {

					} else {
						logger.error(responseXml);
					}
				}

			}

		}
		return false;

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
				HospitalCompensationCancelInfo hospitalCompensationCancelInfo = new HospitalCompensationCancelInfo();
				hospitalCompensationCancelInfo.setMedical_record_no(registration.getMedical_record_no());
				hospitalCompensationCancelInfo.setHospital_registration_sn(registration.getHospital_registration_sn());
				hospitalCompensationCancelInfo.setName(registration.getName());
				hospitalCompensationCancelInfo.setSex(registration.getSex());
				hospitalCompensationCancelInfo.setId_type(registration.getId_type());
				hospitalCompensationCancelInfo.setId_number(registration.getId_number());
				System.out.println("======================"+configInfo.getWs_url_plicc()+"======================");
				System.out.println("===============getContract_number======================="+configInfo.getContract_number()+"======================================");
				System.out.println("======================getCase_number================"+configInfo.getCase_number()+"======================================");
				System.out.println("=====================getSettlement_number================="+configInfo.getSettlement_number()+"======================================");
				//String contract_number = "2016610400998965000017";
				hospitalCompensationCancelInfo.setContract_number(configInfo.getContract_number());
//				String case_number = "20166104009022909401";
				hospitalCompensationCancelInfo.setCase_number(configInfo.getCase_number());
//				String settlement_number = "1";
				hospitalCompensationCancelInfo.setSettlement_number(configInfo.getSettlement_number());

				CallBackBody body = new CallBackBody();
				CallBack_Request request = new CallBack_Request();
				com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
				head.setDing_hosp_code(registration.getDing_hosp_code());
				head.setArea_code(registration.getMedical_record_no().substring(0, 6));
				body.setHospitalCompensationCancelInfo(hospitalCompensationCancelInfo);
				request.setHead(head);
				request.setBody(body);

				String xmlRequest = JAXBUtil.convertToXml(request);
				request(xmlRequest, head);
			}

		}
		return false;

	}

	/*
	 * (非 Javadoc) <p>Title: searchTreatment</p> <p>Description: </p>
	 * 
	 * @param medical_record_no
	 * 
	 * @param hospital_registration_sn
	 * 
	 * @see
	 * com.sysnet.dbsb.service.UploadService#searchTreatment(java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public boolean searchTreatment(String medical_record_no, String hospital_registration_sn) {
		return false;
		// TODO Auto-generated method stub

	}

	/*
	 * (非 Javadoc) <p>Title: uploadCompensation</p> <p>Description: </p>
	 * 
	 * @param medical_record_no
	 * 
	 * @param hospital_registration_sn
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadCompensation(java.lang.
	 * String, java.lang.String)
	 */
	@Override
	public boolean uploadCompensation(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				List<HospitalFeeSettlement> settlements = hospitalFeeSettlementDao.queryByFilter(filter);
				// 结算信息
				if (settlements != null && !settlements.isEmpty()) {
					HospitalFeeSettlement settlement = settlements.get(0);

					Compensation_Request request = new Compensation_Request();

					CompensationBody body = new CompensationBody();

					HospitalCompensationInfo compensationInfo = new HospitalCompensationInfo();
					compensationInfo.setMedical_record_no(registration.getMedical_record_no());
					compensationInfo.setHospital_registration_sn(registration.getHospital_registration_sn());
					compensationInfo.setName(registration.getName());
					compensationInfo.setSex(registration.getSex());
					compensationInfo.setId_type(registration.getId_type());
					compensationInfo.setId_number(registration.getId_number());

					compensationInfo.setSettlement_number(settlement.getSettlement_number());
					compensationInfo.setIn_hospital_style(registration.getIn_hospital_style());
					compensationInfo.setLeave_state(settlement.getLeave_state());
					compensationInfo.setReferral_ratio(settlement.getReferral_ratio());
					compensationInfo.setLeave_hospital_style(settlement.getLeave_hospital_style());
					compensationInfo.setLeave_date(settlement.getLeave_date());

					compensationInfo.setDeath_time(settlement.getDeath_time());
					compensationInfo.setLeave_disease_code(settlement.getLeave_disease_code());
					compensationInfo.setComplication(settlement.getComplication());
					compensationInfo.setTotal_payment(settlement.getTotal_payment());
					compensationInfo.setJialei_payment(settlement.getJialei_payment());
					compensationInfo.setYilei_baoxiao(settlement.getYilei_baoxiao());
					compensationInfo.setYilei_payment(settlement.getYilei_payment());
					compensationInfo.setBinglei_payment(settlement.getBinglei_payment());
					compensationInfo.setBinglei_yibao(settlement.getBinglei_yibao());
					compensationInfo.setZy_payment(settlement.getZy_payment());
					compensationInfo.setXy_payment(settlement.getXy_payment());
					compensationInfo.setYb_start_pay_line(settlement.getYb_start_pay_line());
					compensationInfo.setFit_into_yb_amount(settlement.getFit_into_yb_amount());
					compensationInfo.setYb_compensation(settlement.getYb_compensation());
					compensationInfo.setYb_year_compensation(settlement.getYb_year_compensation());
					compensationInfo.setThird_party_compensation(settlement.getThird_party_compensation());
					compensationInfo.setYear_third_party_compensation(settlement.getYear_third_party_compensation());
					compensationInfo.setDb_compensation(settlement.getDb_compensation());
					compensationInfo.setDb_year_compensation(settlement.getDb_year_compensation());

					body.setHospitalCompensationInfo(compensationInfo);
					com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
					head.setDing_hosp_code(registration.getDing_hosp_code());
					head.setArea_code(registration.getMedical_record_no().substring(0, 6));

					request.setBody(body);
					request.setHead(head);

					String xmlRequest = JAXBUtil.convertToXml(request);
					String responseXml = request(xmlRequest, head);
					afterUploadTreat(medical_record_no, hospital_registration_sn, responseXml);
				}
			}
		}
		return false;
	}

	/**
	 * @Title: afterUploadTreat @Description: @param medical_record_no @param
	 * hospital_registration_sn @param responseXml void @throws
	 */
	public void afterUploadTreat(String medical_record_no, String hospital_registration_sn, String responseXml) {
		if (StringUtils.contains(responseXml, "<status>1")) {
			// Settlement_Response bean =
			// JAXBUtil.converyToJavaBean(responseXml,
			// Settlement_Response.class);
			// if
			// (bean.getOutExportHospitalCompensations().get(0).getStatus().equals("1"))
			// {
			// 上传成功，更新标志位

			// }
			DBPaymentKey key = new DBPaymentKey();
			key.setMEDICAL_RECORD_NO(medical_record_no);
			key.setHOSPITAL_REGISTRATION_SN(hospital_registration_sn);
			DBPayment payment = paymentDao.selectByPrimaryKey(key);
			if (payment != null) {
				payment.setUPLOADFLAG(Successful);
				payment.setUPLOADDATE(new Date());
				paymentDao.updateByPrimaryKeySelective(payment);
			}

		} else {
			logger.error(responseXml);
		}
	}

	/*
	 * (非 Javadoc) <p>Title: uploadRegistration</p> <p>Description: </p>
	 * 
	 * @param medical_record_no
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadRegistration(java.lang.
	 * String)
	 */
	@Override
	public boolean uploadRegistration(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				filter.clear();
				filter.put("medical_record_no", registration.getMedical_record_no());
				filter.put("hospital_registration_sn", registration.getHospital_registration_sn());
				Registration_Request request = new Registration_Request();

				RegistrationBody body = new RegistrationBody();

				body.setHospitalRegistration(registration);
				com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
				head.setDing_hosp_code(registration.getDing_hosp_code());
				head.setArea_code(registration.getMedical_record_no().substring(0, 6));
				request.setBody(body);
				request.setHead(head);

				String xmlRequest = JAXBUtil.convertToXml(request);
				String responseXml = request(xmlRequest, head);
				if (StringUtils.contains(responseXml, "<status>1")) {
				} else {
					logger.error(responseXml);
				}
			}
		}
		return false;
	}
}
