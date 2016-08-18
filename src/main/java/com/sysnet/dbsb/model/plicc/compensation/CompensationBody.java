package com.sysnet.dbsb.model.plicc.compensation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class CompensationBody {
	@XmlElement(name="hospitalCompensationInfo")
	private HospitalCompensationInfo  hospitalCompensationInfo;

	/**
	* @return hospitalCompensationInfo
	*/
	public HospitalCompensationInfo getHospitalCompensationInfo() {
		return hospitalCompensationInfo;
	}

	/**
	* @param hospitalCompensationInfo 要设置的 hospitalCompensationInfo
	*/
	public void setHospitalCompensationInfo(HospitalCompensationInfo hospitalCompensationInfo) {
		this.hospitalCompensationInfo = hospitalCompensationInfo;
	}

	
	
}
