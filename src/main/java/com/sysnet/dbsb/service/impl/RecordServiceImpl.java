/**
* @Title: RecordServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午3:55:50
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.util.Calendar;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.DBPaymentMapper;
import com.sysnet.dbsb.model.common.DBPayment;
import com.sysnet.dbsb.model.common.DBPaymentKey;
import com.sysnet.dbsb.service.RecordService;

/**
* @ClassName: RecordServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午3:55:50
*/
@Service
public class RecordServiceImpl implements RecordService {
	private static final String Successful = "1";
	@Resource
	private DBPaymentMapper paymentDao;

	/**
	 * 
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
				payment.setUPLOADDATE(Calendar.getInstance().getTime());
				paymentDao.updateByPrimaryKeySelective(payment);
			}

		} else {
			
		}
}}
