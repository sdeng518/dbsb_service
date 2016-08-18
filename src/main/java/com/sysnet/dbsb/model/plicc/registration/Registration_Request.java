/**
* @Title: Person_Request.java
* @Package com.sysnet.dbsb.model.plicc.person
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:37
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.registration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.plicc.Head;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
* @ClassName: Person_Request
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:37
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Registration_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private RegistrationBody body;
	/**
	* @return head
	*/
	public Head getHead() {
		return head;
	}
	/**
	* @param head 要设置的 head
	*/
	public void setHead(Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100007");
		head.setBus_sub_code("00");
		this.head = head;
	}
	/**
	* @return body
	*/
	public RegistrationBody getBody() {
		return body;
	}
	/**
	* @param body 要设置的 body
	*/
	public void setBody(RegistrationBody body) {
		this.body = body;
	}
	
	public static void main(String[] args) {
		Registration_Request request = new Registration_Request();
		Head head = new Head();
		RegistrationBody body = new RegistrationBody();
		HospitalRegistration registration = new HospitalRegistration();
		body.setHospitalRegistration(registration);
		request.setHead(head);
		request.setBody(body);
		System.out.println(JAXBUtil.convertToXml(request));
	}
}
