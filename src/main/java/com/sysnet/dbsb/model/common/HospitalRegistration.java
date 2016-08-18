package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 住院登记
 * 
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "hospitalRegistrationInfo")
public class HospitalRegistration {
	@XmlElement
	private String medical_record_no = "";// 医保号
	@XmlElement
	private String hospital_registration_sn = "";// 住院登记流水号
	@XmlElement
	private String name = "";// 姓名
	@XmlElement
	private String sex = "";// 性别
	@XmlElement
	private String id_type = "";// 证件类别
	@XmlElement
	private String id_number = "";// 证件号码
	@XmlElement
	private String in_date = "";// 就诊日期
	@XmlElement
	private String baby_name = "";// 新生儿姓名
	@XmlElement
	private String phone = "";// 电话
	@XmlElement
	private String mobilephone = "";// 手机
	@XmlElement
	private String accident_reason = "";// 出险原因
	@XmlElement
	private String in_hospital_style = "";// 入院类型
	@XmlElement
	private String basic_medical_type = "";// 基本医保类型
	@XmlElement
	private String bed_number = "";// 床位号
	@XmlElement
	private String section_office = "";// 就诊科室
	@XmlElement
	private String initial_diagnosis = "";// 初始诊断
	@XmlElement
	private String complication = "";// 并发症
	@XmlElement
	private String main_diagnosis_code = "";// 主诊断疾病
	@XmlElement
	private String other_diagnosis_code = "";// 其它诊断疾病
	@XmlElement
	private String master_doctor = "";// 主治医生
	@XmlElement
	private String memo = "";// 备注
//	@XmlElement
//	private String arg1 = "";// 预留 1
//	@XmlElement
//	private String arg2 = "";// 预留
//	@XmlElement
//	private String arg3 = "";// 预留
//	@XmlElement
//	private String arg4 = "";// 预留
//	@XmlElement
//	private String arg5 = "";// 预留
//	@XmlElement
//	private String arg6 = "";// 预留
//	@XmlElement
//	private String arg7 = "";// 预留
//	@XmlElement
//	private String arg8 = "";// 预留
//	@XmlElement
//	private String arg9 = "";// 预留
//	@XmlElement
//	private String arg10 = "";// 预留

	@XmlTransient
	private String ding_hosp_code = "";

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

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public String getBaby_name() {
		return baby_name;
	}

	public void setBaby_name(String baby_name) {
		this.baby_name = baby_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getAccident_reason() {
		return accident_reason;
	}

	public void setAccident_reason(String accident_reason) {
		this.accident_reason = accident_reason;
	}

	public String getIn_hospital_style() {
		return in_hospital_style;
	}

	public void setIn_hospital_style(String in_hospital_style) {
		this.in_hospital_style = in_hospital_style;
	}

	public String getBasic_medical_type() {
		return basic_medical_type;
	}

	public void setBasic_medical_type(String basic_medical_type) {
		this.basic_medical_type = basic_medical_type;
	}

	public String getBed_number() {
		return bed_number;
	}

	public void setBed_number(String bed_number) {
		this.bed_number = bed_number;
	}

	public String getSection_office() {
		return section_office;
	}

	public void setSection_office(String section_office) {
		this.section_office = section_office;
	}

	public String getInitial_diagnosis() {
		return initial_diagnosis;
	}

	public void setInitial_diagnosis(String initial_diagnosis) {
		this.initial_diagnosis = initial_diagnosis;
	}

	public String getComplication() {
		return complication;
	}

	public void setComplication(String complication) {
		this.complication = complication;
	}

	public String getMain_diagnosis_code() {
		return main_diagnosis_code;
	}

	public void setMain_diagnosis_code(String main_diagnosis_code) {
		this.main_diagnosis_code = main_diagnosis_code;
	}

	public String getOther_diagnosis_code() {
		return other_diagnosis_code;
	}

	public void setOther_diagnosis_code(String other_diagnosis_code) {
		this.other_diagnosis_code = other_diagnosis_code;
	}

	public String getMaster_doctor() {
		return master_doctor;
	}

	public void setMaster_doctor(String master_doctor) {
		this.master_doctor = master_doctor;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getDing_hosp_code() {
		return ding_hosp_code;
	}

	public void setDing_hosp_code(String ding_hosp_code) {
		this.ding_hosp_code = ding_hosp_code;
	}

	

}
