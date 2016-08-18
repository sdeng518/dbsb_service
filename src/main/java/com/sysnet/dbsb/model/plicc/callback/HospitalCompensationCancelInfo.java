package com.sysnet.dbsb.model.plicc.callback;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 住院补偿回退请求消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "hospitalCompensationCancelInfo")
public class HospitalCompensationCancelInfo {
	@XmlElement
	private String medical_record_no="";//医保号
	@XmlElement
	private String hospital_registration_sn="";//住院登记流水号
	@XmlElement
	private String name="";//姓名
	@XmlElement
	private String sex="";//性别
	@XmlElement
	private String id_type="I";//证件类别
	@XmlElement
	private String id_number="";//证件号码
	@XmlElement
	private String contract_number="2016610400998965000017";//合同号
	@XmlElement
	private String case_number ="20166104009022909401";//赔案号
	@XmlElement
	private String settlement_number="1";//医院结算单号
	@XmlElement
	private String arg1="";//预留 1
	@XmlElement
	private String arg2="";//预留
	@XmlElement
	private String arg3="";//预留
	@XmlElement
	private String arg4="";//预留
	@XmlElement
	private String arg5="";//预留
	@XmlElement
	private String arg6="";//预留
	@XmlElement
	private String arg7="";//预留
	@XmlElement
	private String arg8="";//预留
	@XmlElement
	private String arg9="";//预留
	@XmlElement
	private String arg10="";//预留
	public String getMedical_record_no() {
		return medical_record_no;
	}
	public void setMedical_record_no(String medical_record_no) {
		this.medical_record_no = medical_record_no;
	}
	public String getHospital_registration_sn() {
		return hospital_registration_sn;
	}
	public void setHospital_registration_sn(String hospital_registration_sn) {
		this.hospital_registration_sn = hospital_registration_sn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId_type() {
		return id_type;
	}
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	public String getId_number() {
		return id_number;
	}
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	public String getContract_number() {
		return contract_number;
	}
	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}
	public String getCase_number() {
		return case_number;
	}
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	public String getSettlement_number() {
		return settlement_number;
	}
	public void setSettlement_number(String settlement_number) {
		this.settlement_number = settlement_number;
	}
	public String getArg1() {
		return arg1;
	}
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	public String getArg2() {
		return arg2;
	}
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	public String getArg3() {
		return arg3;
	}
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
	public String getArg4() {
		return arg4;
	}
	public void setArg4(String arg4) {
		this.arg4 = arg4;
	}
	public String getArg5() {
		return arg5;
	}
	public void setArg5(String arg5) {
		this.arg5 = arg5;
	}
	public String getArg6() {
		return arg6;
	}
	public void setArg6(String arg6) {
		this.arg6 = arg6;
	}
	public String getArg7() {
		return arg7;
	}
	public void setArg7(String arg7) {
		this.arg7 = arg7;
	}
	public String getArg8() {
		return arg8;
	}
	public void setArg8(String arg8) {
		this.arg8 = arg8;
	}
	public String getArg9() {
		return arg9;
	}
	public void setArg9(String arg9) {
		this.arg9 = arg9;
	}
	public String getArg10() {
		return arg10;
	}
	public void setArg10(String arg10) {
		this.arg10 = arg10;
	}
	
}
