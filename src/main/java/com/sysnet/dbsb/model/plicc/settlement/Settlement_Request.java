package com.sysnet.dbsb.model.plicc.settlement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalFeeSettlement;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.plicc.Head;
import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 费用结算请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Settlement_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private SettlementBody body;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100018");
		head.setBus_sub_code("02");
		this.head = head;
	}

	public SettlementBody getBody() {
		return body;
	}

	public void setBody(SettlementBody body) {
		this.body = body;
	}

	public static void main(String[] args) {
		HospitalFeeSettlementInfo hospitalFeeSettlementInfo = new HospitalFeeSettlementInfo();
		SettlementBody body = new SettlementBody();
		Settlement_Request request = new Settlement_Request();
		Head head = new Head();
		HospitalRegistration hospitalRegistration = new HospitalRegistration();// 住院登记信息
		HospitalFeeSettlement hospitalFeeSettlement = new HospitalFeeSettlement();// 费用结算
		hospitalFeeSettlementInfo.setHospitalRegistration(hospitalRegistration);
		hospitalFeeSettlementInfo.setHospitalFeeSettlement(hospitalFeeSettlement);
		body.setHospitalFeeSettlementInfo(hospitalFeeSettlementInfo);
		request.setHead(head);
		request.setBody(body);

		System.out.println(JAXBUtil.convertToXml(request));
	}
}
