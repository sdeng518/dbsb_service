package com.sysnet.dbsb.model.picc.H210;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.PayeeInformation;
import com.sysnet.dbsb.model.picc.Head;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 大病结果上传交易请求消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "UploadMedResult_Request")
public class UploadMedResult_Request {
	@XmlElement(name="head")
	private Head head;
	@XmlElement(name="body")
	private Body_Request_H210 body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body_Request_H210 getBody() {
		return body;
	}
	public void setBody(Body_Request_H210 body) {
		this.body = body;
	}
	
	
	public static void main(String[] args) {
		UploadMedResult_Request uploadMedResult_Request = new UploadMedResult_Request();
		Head head = new Head();
		uploadMedResult_Request.setHead(head);
		
		Body_Request_H210 body = new Body_Request_H210();
		Staff staffInformation = new Staff();
		PayeeInformation payeeInformation = new PayeeInformation();
		MedResult medResult = new MedResult();
		body.setStaffInformation(staffInformation);
		body.setPayeeInformation(payeeInformation);
		List<MedResult> medResultList = new ArrayList<MedResult>();
		medResultList.add(medResult);
		MedResultList medResultList2 = new MedResultList();
		medResultList2.setMedResults(medResultList);
		body.setMedResultList(medResultList2);
		uploadMedResult_Request.setBody(body);
		
		System.err.println(JAXBUtil.convertToXml(uploadMedResult_Request));
	}
}
