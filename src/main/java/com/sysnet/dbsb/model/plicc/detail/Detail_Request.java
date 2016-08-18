package com.sysnet.dbsb.model.plicc.detail;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.plicc.Head;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 费用明细请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Detail_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private DetailBody body;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100020");
		head.setBus_sub_code("00");
		this.head = head;
	}

	public DetailBody getBody() {
		return body;
	}

	public void setBody(DetailBody body) {
		this.body = body;
	}

	public static void main(String[] args) {
		HospitalFeeDetailInfo hospitalFeeDetailInfo = new HospitalFeeDetailInfo();
		DetailBody body = new DetailBody();
		Detail_Request request = new Detail_Request();
		Head head = new Head();
		HospitalRegistration registration = new HospitalRegistration();// 住院登记信息
		HospitalItem item = new HospitalItem();
		hospitalFeeDetailInfo.setHospital_registration_sn(registration.getHospital_registration_sn());
		List<HospitalItem> items = new ArrayList<HospitalItem>();
		items.add(item);
		hospitalFeeDetailInfo.setHospitalFees(items);
		hospitalFeeDetailInfo.setId_number(registration.getId_number());
		hospitalFeeDetailInfo.setId_type(registration.getId_type());
		hospitalFeeDetailInfo.setMedical_record_no(registration.getMedical_record_no());
		hospitalFeeDetailInfo.setName(registration.getName());
		hospitalFeeDetailInfo.setSex(registration.getSex());
		body.setHospitalFeeDetailInfo(hospitalFeeDetailInfo);
		request.setHead(head);
		request.setBody(body);

		System.out.println(JAXBUtil.convertToXml(request));
	}
}
