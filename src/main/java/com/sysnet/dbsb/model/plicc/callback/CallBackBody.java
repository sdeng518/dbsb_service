package com.sysnet.dbsb.model.plicc.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class CallBackBody {
	@XmlElement(name="hospitalCompensationCancelInfo")
	private HospitalCompensationCancelInfo hospitalCompensationCancelInfo;

	public HospitalCompensationCancelInfo getHospitalCompensationCancelInfo() {
		return hospitalCompensationCancelInfo;
	}

	public void setHospitalCompensationCancelInfo(HospitalCompensationCancelInfo hospitalCompensationCancelInfo) {
		this.hospitalCompensationCancelInfo = hospitalCompensationCancelInfo;
	}
	
}
