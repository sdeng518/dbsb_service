package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 参合人员
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="insurantInfo")
public class InsuredPerson {
	@XmlElement(required=true)
	private String medical_record_no=""; // 医保号
	@XmlElement
	private String name=""; // 姓名
	@XmlElement
	private String sex=""; // 性别
	@XmlElement
	private String id_type=""; // 证件类型
	@XmlElement
	private String id_number=""; // 证件号码
	@XmlElement
	private String birthday=""; // 出生日期
	@XmlElement
	private String nation=""; // 民族
	@XmlElement
	private String marriage_state=""; // 婚姻状况
	@XmlElement
	private String policy=""; // 政治面貌
	@XmlElement
	private String education=""; // 学历
	@XmlElement
	private String phone=""; // 电话
	@XmlElement
	private String mobilephone=""; // 手机
	@XmlElement
	private String home_address=""; // 家庭住址
	@XmlElement
	private String profession=""; // 职业
	@XmlElement
	private String company_name=""; // 工作单位
	@XmlElement
	private String industry=""; // 单位性质
	@XmlElement
	private String personal_attributes=""; // 人员属性
	@XmlElement
	private String personal_identity=""; // 健康状况
	@XmlElement
	private String insured_property="";// 参保性质
	@XmlElement
	private String insured_property_changetime="";// 参保性质变更时间
	@XmlElement
	private String bank_code="";// 银行代码
	@XmlElement
	private String bank_name="";// 银行名称
	@XmlElement
	private String claim_payment_account="";// 银行账号
	
	@XmlElement
	private String arg1="";// 
	@XmlElement
	private String arg2="";// 
	@XmlElement
	private String arg3="";// 
	@XmlElement
	private String arg4="";// 
	@XmlElement
	private String arg5="";// 
	@XmlElement
	private String arg6="";// 
	@XmlElement
	private String arg7="";// 
	@XmlElement
	private String arg8="";// 
	@XmlElement
	private String arg9="";// 
	@XmlElement
	private String arg10="";// 
	
	@XmlTransient
	private String area_code;//统筹区域
	@XmlTransient
	private String insured_year;//医保年度

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getInsured_year() {
		return insured_year;
	}

	public void setInsured_year(String insured_year) {
		this.insured_year = insured_year;
	}

	public String getMedical_record_no() {
		return medical_record_no;
	}

	public void setMedical_record_no(String medical_record_no) {
		this.medical_record_no = medical_record_no;
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

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getMarriage_state() {
		return marriage_state;
	}

	public void setMarriage_state(String marriage_state) {
		this.marriage_state = marriage_state;
	}

	public String getPolicy() {
		return policy;
	}

	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
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

	public String getHome_address() {
		return home_address;
	}

	public void setHome_address(String home_address) {
		this.home_address = home_address;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getPersonal_attributes() {
		return personal_attributes;
	}

	public void setPersonal_attributes(String personal_attributes) {
		this.personal_attributes = personal_attributes;
	}

	public String getPersonal_identity() {
		return personal_identity;
	}

	public void setPersonal_identity(String personal_identity) {
		this.personal_identity = personal_identity;
	}

	public String getInsured_property() {
		return insured_property;
	}

	public void setInsured_property(String insured_property) {
		this.insured_property = insured_property;
	}

	public String getInsured_property_changetime() {
		return insured_property_changetime;
	}

	public void setInsured_property_changetime(
			String insured_property_changetime) {
		this.insured_property_changetime = insured_property_changetime;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getClaim_payment_account() {
		return claim_payment_account;
	}

	public void setClaim_payment_account(String claim_payment_accout) {
		this.claim_payment_account = claim_payment_accout;
	}

}
