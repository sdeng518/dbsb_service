package com.sysnet.dbsb.model.picc.H301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.BodyRespond;
import com.sysnet.dbsb.model.picc.Head;

/**
 * 定点医疗机构信息上传交易响应消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "HospitalInformationUpload_Respond")
public class HospitalInformationUpload_Respond {
	@XmlElement(name="head")
	private Head head;
	@XmlElement(name="body")
	private BodyRespond body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public BodyRespond getBody() {
		return body;
	}
	public void setBody(BodyRespond body) {
		this.body = body;
	}
	
}
