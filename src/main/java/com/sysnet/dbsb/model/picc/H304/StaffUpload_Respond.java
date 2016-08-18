package com.sysnet.dbsb.model.picc.H304;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.BodyRespond;
import com.sysnet.dbsb.model.picc.Head;

/**
 * 参合人员信息批量上传交易响应消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StaffUpload_Respond")
public class StaffUpload_Respond {
	@XmlElement(name="head")
	private Head head;
	@XmlElement(name="body")
	private BodyRespond bodyRespond;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public BodyRespond getBodyRespond() {
		return bodyRespond;
	}
	public void setBodyRespond(BodyRespond bodyRespond) {
		this.bodyRespond = bodyRespond;
	}
	
}
