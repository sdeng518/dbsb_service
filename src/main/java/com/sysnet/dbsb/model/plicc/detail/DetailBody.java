package com.sysnet.dbsb.model.plicc.detail;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class DetailBody {
	@XmlElement(name="hospitalFeeDetailInfo")
	private HospitalFeeDetailInfo hospitalFeeDetailInfo;

	/**
	* @return hospitalFeeDetailInfo
	*/
	public HospitalFeeDetailInfo getHospitalFeeDetailInfo() {
		return hospitalFeeDetailInfo;
	}

	/**
	* @param hospitalFeeDetailInfo 要设置的 hospitalFeeDetailInfo
	*/
	public void setHospitalFeeDetailInfo(HospitalFeeDetailInfo hospitalFeeDetailInfo) {
		this.hospitalFeeDetailInfo = hospitalFeeDetailInfo;
	}

		
	
}
