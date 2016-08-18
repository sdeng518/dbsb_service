package com.sysnet.dbsb.model.plicc.compensation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.plicc.Head;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 费用结算请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Compensation_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private CompensationBody body;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100013");
		head.setBus_sub_code("02");
		this.head = head;
	}

	public CompensationBody getBody() {
		return body;
	}

	public void setBody(CompensationBody body) {
		this.body = body;
	}

	public static void main(String[] args) {
		CompensationBody body = new CompensationBody();
		Compensation_Request request = new Compensation_Request();
		Head head = new Head();
		HospitalCompensationInfo hospitalCompensationInfo = new HospitalCompensationInfo();
		body.setHospitalCompensationInfo(hospitalCompensationInfo);
		request.setHead(head);
		request.setBody(body);

		System.out.println(JAXBUtil.convertToXml(request));
	}
}
