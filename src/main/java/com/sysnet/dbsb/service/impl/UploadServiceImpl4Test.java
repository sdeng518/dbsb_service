/**
* @Title: UploadServiceImpl4ASIA.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午5:57:41
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.net.URL;
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
public class UploadServiceImpl4Test implements UploadService {
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

	/*
	 * (非 Javadoc) <p>Title: uploadPerson</p> <p>Description: </p>
	 * 
	 * @param id
	 * 
	 * @see com.sysnet.dbsb.service.UploadService#uploadPerson(java.lang.String)
	 */
	public void uploadPerson(String id) {
			System.out.println("=============测试1==========");
	}

	/**
	 * @Title: request @Description: @param xmlRequest void @throws
	 * @param bus_code
	 *            TODO
	 */
	@SystemServiceLog(description = "数据服务接口")
	private String request(String xmlRequest, String bus_code) {
		System.out.println("=============测试2==========");
		return "123456";
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
		System.out.println("=============测试3==========");
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
		System.out.println("=============测试3==========");
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
		System.out.println("=============测试4==========");

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
	public void uploadTreatDetail(String medical_record_no, String hospital_registration_sn) {
		System.out.println("=============测试5==========");
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
		System.out.println("=============测试6==========");
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
		System.out.println("=============测试7==========");

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
		System.out.println("=============测试8==========");

	}

	/**
	 * @Title: debug @Description: @param registration void @throws
	 */
	private void debug(HospitalRegistration registration) {
		System.out.println("=============测试9==========");
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
		System.out.println("=============测试10==========");

	}

}
