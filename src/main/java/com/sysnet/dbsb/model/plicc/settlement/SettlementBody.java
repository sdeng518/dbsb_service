package com.sysnet.dbsb.model.plicc.settlement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class SettlementBody {
	@XmlElement(name="hospitalFeeSettlementInfo")
	private HospitalFeeSettlementInfo hospitalFeeSettlementInfo;

	public HospitalFeeSettlementInfo getHospitalFeeSettlementInfo() {
		return hospitalFeeSettlementInfo;
	}

	public void setHospitalFeeSettlementInfo(
			HospitalFeeSettlementInfo hospitalFeeSettlementInfo) {
		this.hospitalFeeSettlementInfo = hospitalFeeSettlementInfo;
	}

	
	
}
