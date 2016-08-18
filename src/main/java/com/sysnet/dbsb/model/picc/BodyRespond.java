package com.sysnet.dbsb.model.picc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 请求响应body
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class BodyRespond {
	@XmlElement
	private String SuccessFlag;//信息是否上传成功（1 成功 -1失败）
	@XmlElement
	private String Description;//如果失败，返回失败原因
	@XmlElement
	private String TotalNoCalculateDetail;
	@XmlElement
	private String CalculateDetailAmount;
	@XmlElement
	private String ReserveField1;//预留字段 1
	@XmlElement
	private String ReserveField2;//预留字段 2
	@XmlElement
	private String ReserveField3;//预留字段 3
	/**
	* @return calculateDetailAmount
	*/
	public String getCalculateDetailAmount() {
		return CalculateDetailAmount;
	}
	public String getDescription() {
		return Description;
	}
	public String getReserveField1() {
		return ReserveField1;
	}
	public String getReserveField2() {
		return ReserveField2;
	}
	public String getReserveField3() {
		return ReserveField3;
	}
	public String getSuccessFlag() {
		return SuccessFlag;
	}
	/**
	* @return totalNoCalculateDetail
	*/
	public String getTotalNoCalculateDetail() {
		return TotalNoCalculateDetail;
	}
	/**
	* @param calculateDetailAmount 要设置的 calculateDetailAmount
	*/
	public void setCalculateDetailAmount(String calculateDetailAmount) {
		CalculateDetailAmount = calculateDetailAmount;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public void setReserveField1(String reserveField1) {
		ReserveField1 = reserveField1;
	}
	public void setReserveField2(String reserveField2) {
		ReserveField2 = reserveField2;
	}
	public void setReserveField3(String reserveField3) {
		ReserveField3 = reserveField3;
	}
	public void setSuccessFlag(String successFlag) {
		SuccessFlag = successFlag;
	}
	/**
	* @param totalNoCalculateDetail 要设置的 totalNoCalculateDetail
	*/
	public void setTotalNoCalculateDetail(String totalNoCalculateDetail) {
		TotalNoCalculateDetail = totalNoCalculateDetail;
	}
		
}
