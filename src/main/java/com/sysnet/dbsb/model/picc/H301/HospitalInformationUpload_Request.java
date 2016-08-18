package com.sysnet.dbsb.model.picc.H301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.Head;

/**
 * 定点医疗机构信息上传
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "HospitalInformationUpload_Request")
public class HospitalInformationUpload_Request {
	@XmlElement(name="head")
	private Head head;
	@XmlElement(name="body")
	private Body_Request_H301 body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body_Request_H301 getBody() {
		return body;
	}
	public void setBody(Body_Request_H301 body) {
		this.body = body;
	}
	
}
