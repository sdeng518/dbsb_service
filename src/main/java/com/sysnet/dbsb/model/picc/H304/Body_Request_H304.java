package com.sysnet.dbsb.model.picc.H304;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body_Request_H304 {
	@XmlElement(name="StaffInformation")
	private StaffInformation staffInformation;

	public StaffInformation getStaffInformation() {
		return staffInformation;
	}

	public void setStaffInformation(StaffInformation staffInformation) {
		this.staffInformation = staffInformation;
	}
	
	
}
