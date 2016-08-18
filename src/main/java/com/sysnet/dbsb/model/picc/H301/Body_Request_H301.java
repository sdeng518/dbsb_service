package com.sysnet.dbsb.model.picc.H301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 定点医疗机构信息上传 body
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body_Request_H301 {
	@XmlElement(name="HospitalInformation")
	private HospitalInformation hospitalInformation;

	public HospitalInformation getHospitalInformation() {
		return hospitalInformation;
	}

	public void setHospitalInformation(HospitalInformation hospitalInformation) {
		this.hospitalInformation = hospitalInformation;
	}
	
}
