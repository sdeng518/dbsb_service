package com.sysnet.dbsb.model.plicc.settlement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalFeeSettlement;
import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.model.common.HospitalRegistration;

@XmlRootElement(name = "hospitalFeeSettlementInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class HospitalFeeSettlementInfo {
	@XmlElement(name="hospitalRegistrationInfo")
	private HospitalRegistration hospitalRegistration;// 住院登记信息
	@XmlElement(name="hospitalFeeInfo")
	private List<HospitalItem> hospitalFees;// 诊疗项目
	@XmlElement(name="compensationInfo")
	private HospitalFeeSettlement hospitalFeeSettlement;// 费用结算

	public HospitalRegistration getHospitalRegistration() {
		return hospitalRegistration;
	}

	public void setHospitalRegistration(
			HospitalRegistration hospitalRegistration) {
		this.hospitalRegistration = hospitalRegistration;
	}

	
	public HospitalFeeSettlement getHospitalFeeSettlement() {
		return hospitalFeeSettlement;
	}

	public void setHospitalFeeSettlement(
			HospitalFeeSettlement hospitalFeeSettlement) {
		this.hospitalFeeSettlement = hospitalFeeSettlement;
	}

	public List<HospitalItem> getHospitalFees() {
		return hospitalFees;
	}

	public void setHospitalFees(List<HospitalItem> hospitalFees) {
		this.hospitalFees = hospitalFees;
	}

}
