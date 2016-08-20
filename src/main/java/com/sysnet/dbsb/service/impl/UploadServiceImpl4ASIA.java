/**
* @Title: UploadServiceImpl4ASIA.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:57:41
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.sysnet.common.annotation.SystemServiceLog;
import com.sysnet.dbsb.dao.DBMessageMapper;
import com.sysnet.dbsb.dao.DBPaymentMapper;
import com.sysnet.dbsb.dao.DBUploadMsgMapper;
import com.sysnet.dbsb.dao.HospitalDao;
import com.sysnet.dbsb.dao.HospitalFeeSettlementDao;
import com.sysnet.dbsb.dao.HospitalItemDao;
import com.sysnet.dbsb.dao.HospitalRegistrationDao;
import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.dao.PayeeInformationDao;
import com.sysnet.dbsb.model.common.ConfigInfo;
import com.sysnet.dbsb.model.common.DBMessage;
import com.sysnet.dbsb.model.common.DBPayment;
import com.sysnet.dbsb.model.common.DBPaymentKey;
import com.sysnet.dbsb.model.common.DBUploadMsg;
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
import com.sysnet.dbsb.model.plicc.search.CompensationSearchInfo;
import com.sysnet.dbsb.model.plicc.search.SearchBody;
import com.sysnet.dbsb.model.plicc.search.Search_Request;
import com.sysnet.dbsb.model.plicc.settlement.HospitalFeeSettlementInfo;
import com.sysnet.dbsb.model.plicc.settlement.SettlementBody;
import com.sysnet.dbsb.model.plicc.settlement.Settlement_Request;
import com.sysnet.dbsb.service.UploadService;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;
import com.sysnet.dbsb.ws.asia.XnhService;
import com.sysnet.dbsb.ws.asia.XnhServiceService;
import com.sysnet.dbsb.ws.asia.XnhServiceServiceLocator;

/**
 * @ClassName: UploadServiceImpl4ASIA
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午5:57:41
 */
@Service
public class UploadServiceImpl4ASIA implements UploadService {
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
	private DBPaymentMapper paymentDao;
	@Resource
	private DBMessageMapper messageDao;
	@Resource
	private DBUploadMsgMapper uploadMsgDao;

	@Resource
	private ConfigInfo configInfo;
	private String areaCode = "610429";
	private String hospitalSeq;
	private String hospitalCode;
	private String section_office = "99";// 科室默认编码

	private static final Logger logger = LoggerFactory.getLogger(UploadService.class);
	private static final String Successful = "1";
	private static final String False = "0";

	/*
	 * (非 Javadoc) <p>Title: uploadPerson</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadPerson(java.lang.String)
	 */
	public void uploadPerson(String id) {
		InsuredPerson insuredPerson = insuredPersonDao.queryById(id);

		if (insuredPerson != null) {
			Person_Request request = new Person_Request();
			PersonBody body = new PersonBody();
			body.setInsuredPerson(insuredPerson);
			request.setBody(body);
			com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
			request.setHead(head);

			String xmlRequest = JAXBUtil.convertToXml(request);
			System.out.println(xmlRequest);
			request(xmlRequest, "100005");
		}
	}

	/**
	 * @Title: request @Description: @param xmlRequest void @throws
	 * @param bus_code
	 *            TODO
	 */
	@SystemServiceLog(description = "数据服务接口")
	private String request(String xmlRequest, String bus_code) {
		String xmlResponse = "";
		logger.info(xmlRequest);

		try {

			XnhServiceService xnhServiceService = new XnhServiceServiceLocator();
			URL portAddress = new URL(configInfo.getWs_url_plicc());
			XnhService xnhService = xnhServiceService.getXnhService(portAddress);

			if (bus_code.equalsIgnoreCase("100005")) {
				xmlResponse = xnhService.personUploadService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100018")) {
				xmlResponse = xnhService.feeCountService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100014")) {
				xmlResponse = xnhService.feeBackService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100020")) {
				xmlResponse = xnhService.feeUploadService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100015")) {
				xmlResponse = xnhService.feeQueryService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100007")) {
				xmlResponse = xnhService.hosRegInfoService(xmlRequest);
			} else if (bus_code.equalsIgnoreCase("100013")) {
				xmlResponse = xnhService.compensationInfoService(xmlRequest);
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		logger.info(xmlResponse);

		DBMessage message = new DBMessage();
		message.setREQUEST(xmlRequest);
		message.setRESPONSE(xmlResponse);
		message.setBUS_CODE(bus_code);
		messageDao.insertSelective(message);

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

	/**
	 * @Title: afterUploadTreat @Description: @param medical_record_no @param
	 *         hospital_registration_sn @param responseXml void @throws
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
	public void uploadTreatment(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				if (StringUtils.isEmpty(registration.getSection_office())) {
					registration.setSection_office(section_office);
				}
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
					// System.out.println(xmlRequest);
					String responseXml = request(xmlRequest, "100018");
					if (StringUtils.contains(responseXml, "<status>1")) {
						afterUploadTreat(medical_record_no, hospital_registration_sn, responseXml);

					} else {
						logger.error(responseXml);
					}
				}

			}

		}

	}

	/*
	 * (非 Javadoc) <p>Title: uploadAllTreatment</p> <p>Description: </p>
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadAllTreatment()
	 */
	@Override
	public void uploadAllTreatment() {
Map<String, Object> filter = new HashMap<String, Object>();
		
		List<DBUploadMsg> uploadMsgs = uploadMsgDao.queryByFilter(filter);
		for (DBUploadMsg dbUploadMsg : uploadMsgs) {
			String medical_record_no = dbUploadMsg.getMEDICAL_RECORD_NO();
			String hospital_registration_sn = dbUploadMsg.getHOSPITAL_REGISTRATION_SN();
			
				uploadRegistration(medical_record_no, hospital_registration_sn);
			try {
				uploadTreatDetail(medical_record_no, hospital_registration_sn);
			} catch (Exception e) {
				// TODO: handle exception
			}
			try {
				uploadCompensation(medical_record_no, hospital_registration_sn);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
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
	public void uploadTreatDetail(String medical_record_no, String hospital_registration_sn) {
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
					String responseXml = request(xmlRequest, "100020");
					if (StringUtils.contains(responseXml, "<status>1")) {

					} else {
						logger.error(responseXml);
					}
				}

			}

		}

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
	public void uploadCancelTreatment(String medical_record_no, String hospital_registration_sn) {
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
				System.out.println("=-=-=-=");
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
				System.out.println(xmlRequest);
				request(xmlRequest, "100014");
			}

		}

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
	public void searchTreatment(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);
		List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
		if (registrations != null && !registrations.isEmpty()) {
			for (HospitalRegistration registration : registrations) {
				CompensationSearchInfo compensationSearchInfo = new CompensationSearchInfo();
				compensationSearchInfo.setMedical_record_no(registration.getMedical_record_no());
				compensationSearchInfo.setHospital_registration_sn(registration.getHospital_registration_sn());
				compensationSearchInfo.setName(registration.getName());
				compensationSearchInfo.setSex(registration.getSex());
				compensationSearchInfo.setId_type(registration.getId_type());
				compensationSearchInfo.setId_number(registration.getId_number());
				String case_number = "999";
				compensationSearchInfo.setCase_number(case_number);

				SearchBody body = new SearchBody();
				Search_Request request = new Search_Request();
				com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
				head.setDing_hosp_code(registration.getDing_hosp_code());
				head.setArea_code(registration.getMedical_record_no().substring(0, 6));
				body.setCompensationSearchInfo(compensationSearchInfo);
				request.setHead(head);
				request.setBody(body);

				String xmlRequest = JAXBUtil.convertToXml(request);
				System.out.println(xmlRequest);
				request(xmlRequest, "100015");
			}

		}

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
	public void uploadCompensation(String medical_record_no, String hospital_registration_sn) {
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
					// System.out.println(xmlRequest);
					String responseXml = request(xmlRequest, "100013");
					if (StringUtils.contains(responseXml, "<status>1")) {
						afterUploadTreat(medical_record_no, hospital_registration_sn, responseXml);
					} else {
						logger.error(responseXml);
					}
				}

			}

		}

	}

	/**
	 * @Title: debug @Description: @param registration void @throws
	 */
	private void debug(HospitalRegistration registration) {
		registration.setMedical_record_no("6104021042330010210");
		registration.setId_number("61040219761230484X");
		registration.setHospital_registration_sn("61040219761230484X");
		registration.setName("张亚娟");
		registration.setIn_date("2016-02-01");
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
	public void uploadRegistration(String medical_record_no, String hospital_registration_sn) {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("medical_record_no", medical_record_no);
		filter.put("hospital_registration_sn", hospital_registration_sn);

		List<DBUploadMsg> uploadMsgs = uploadMsgDao.queryByFilter(filter);
		for (DBUploadMsg dbUploadMsg : uploadMsgs) {
			filter.clear();
			filter.put("medical_record_no", dbUploadMsg.getMEDICAL_RECORD_NO());
			filter.put("hospital_registration_sn", dbUploadMsg.getHOSPITAL_REGISTRATION_SN());
			List<HospitalRegistration> registrations = hospitalRegistrationDao.queryByFilter(filter);
			if (registrations != null && !registrations.isEmpty()) {
				for (HospitalRegistration registration : registrations) {
					Registration_Request request = new Registration_Request();

					RegistrationBody body = new RegistrationBody();

					registration.setInitial_diagnosis(registration.getMain_diagnosis_code());
					registration.setSection_office(section_office);
					body.setHospitalRegistration(registration);
					com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
					head.setDing_hosp_code(registration.getDing_hosp_code());
					head.setArea_code(registration.getMedical_record_no().substring(0, 6));
					request.setBody(body);
					request.setHead(head);

					String xmlRequest = JAXBUtil.convertToXml(request);
					String responseXml = request(xmlRequest, "100007");
					if (StringUtils.contains(responseXml, "<status>1")) {
						//更新成功，更新标志
						dbUploadMsg.setUPLOADFLAG(Successful);
					} else {
						dbUploadMsg.setUPLOADFLAG(False);
						logger.error(responseXml);
					}
					dbUploadMsg.setUPLOADDATE(Calendar.getInstance().getTime());
					if(dbUploadMsg.getUPLOADCOUNT()==null){
						dbUploadMsg.setUPLOADCOUNT(new BigDecimal(0));
					}
					dbUploadMsg.setUPLOADCOUNT(dbUploadMsg.getUPLOADCOUNT().add(new BigDecimal(1)));
					uploadMsgDao.updateByPrimaryKeySelective(dbUploadMsg);				

				}

			}
			
		}

	}

}
