package com.sysnet.dbsb.model.picc.H304;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.Head;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 参合人员信息批量上传
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StaffUpload_Request")
public class StaffUpload_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private List<Body_Request_H304> body;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public List<Body_Request_H304> getBody() {
		return body;
	}

	public void setBody(List<Body_Request_H304> body) {
		this.body = body;
	}

	public static void main(String[] args) {
		Head headReuest = new Head();
		headReuest.setTransactionCode("H304");

		StaffInformation staffInformation = new StaffInformation();
		staffInformation.setAddress("西安");

		StaffUpload_Request staffUpload_Request = new StaffUpload_Request();
		staffUpload_Request.setHead(headReuest);
		List<Body_Request_H304> bodies = new ArrayList<Body_Request_H304>();
		Body_Request_H304 body_Request_H304 = new Body_Request_H304();
		body_Request_H304.setStaffInformation(staffInformation);

		bodies.add(body_Request_H304);
		staffUpload_Request.setBody(bodies);
		 System.out.println(JAXBUtil.convertToXml(staffUpload_Request));

		String xml;
//		try {
//			xml = FileUtil.readAsString(new File(
//					"E:\\新农合\\大病\\阳泉人保\\picc\\xml\\default_xnh_picc_H304.xml"));
//			StaffUpload_Request bean = JAXBUtil.converyToJavaBean(xml, StaffUpload_Request.class);
//			System.out.println(bean.getHead().getTransactionCode());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
