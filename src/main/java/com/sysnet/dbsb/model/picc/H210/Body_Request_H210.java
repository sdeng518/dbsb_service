package com.sysnet.dbsb.model.picc.H210;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.PayeeInformation;

/**
 * 大病结果上传
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body_Request_H210 {
	@XmlElement(name="StaffInformation")
	private Staff staffInformation;
	@XmlElement(name="PayeeInformation")
	private PayeeInformation payeeInformation;
	@XmlElement(name="MedResultList")
	private MedResultList medResultList;
	public Staff getStaffInformation() {
		return staffInformation;
	}
	public void setStaffInformation(Staff staffInformation) {
		this.staffInformation = staffInformation;
	}
	public PayeeInformation getPayeeInformation() {
		return payeeInformation;
	}
	public void setPayeeInformation(PayeeInformation payeeInformation) {
		this.payeeInformation = payeeInformation;
	}
	public MedResultList getMedResultList() {
		return medResultList;
	}
	public void setMedResultList(MedResultList medResultList) {
		this.medResultList = medResultList;
	}
	
}
