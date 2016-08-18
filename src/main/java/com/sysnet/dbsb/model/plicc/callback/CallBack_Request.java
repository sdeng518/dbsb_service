package com.sysnet.dbsb.model.plicc.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 住院补偿回退请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class CallBack_Request {
	@XmlElement(name = "head")
	private com.sysnet.dbsb.model.plicc.Head head;
	@XmlElement(name = "body")
	private CallBackBody body;

	public com.sysnet.dbsb.model.plicc.Head getHead() {
		return head;
	}

	public void setHead(com.sysnet.dbsb.model.plicc.Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100014");
		head.setBus_sub_code("02");
		this.head = head;
	}

	public CallBackBody getBody() {
		return body;
	}

	public void setBody(CallBackBody body) {
		this.body = body;
	}

	public static void main(String[] args) {
		HospitalCompensationCancelInfo hospitalCompensationCancelInfo = new HospitalCompensationCancelInfo();
		CallBackBody body = new CallBackBody();
		CallBack_Request request = new CallBack_Request();
		com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
		body.setHospitalCompensationCancelInfo(hospitalCompensationCancelInfo);
		request.setHead(head);
		request.setBody(body);

		System.out.println(JAXBUtil.convertToXml(request));
	}
}
