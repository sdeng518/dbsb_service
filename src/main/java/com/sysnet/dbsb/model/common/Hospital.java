/**
* @Title: HospitalInformation.java
* @Package com.sysnet.dbsb.model.common
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:40:22
* @version V1.0
*/
package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* @ClassName: Hospital
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:40:22
*/
@XmlRootElement(name = "HospitalInformation")
@XmlAccessorType(XmlAccessType.FIELD)
public class Hospital {
	@XmlElement
	private String hospital_code="";// 医疗机构编号
	@XmlElement
	private String name="";// 医疗机构名称
	@XmlElement
	private String hospital_grade="";// 医疗机构等级
	@XmlElement
	private String current_level_start_time="";// 当前等级生效时间
	@XmlElement
	private String current_level_end_time="";// 当前等级失效时间
	@XmlElement
	private String contacts="";// 联系人
	@XmlElement
	private String phone="";// 联系电话
	@XmlElement
	private String mobilephone="";// 联系手机
	@XmlElement
	private String address="";// 通讯地址
	@XmlElement
	private String nature="";// 医疗机构性质
	@XmlElement
	private String whether_ding="";// 是否定点医疗机构
	@XmlElement
	private String profit_nature="";// 医疗机构盈利性质
	@XmlElement
	private String administrative_level="";// 医疗机构行政级别
	@XmlElement
	private String area_code="";// 医疗机构行政归属地
	/**
	* @return hospital_code
	*/
	public String getHospital_code() {
		return hospital_code;
	}
	/**
	* @param hospital_code 要设置的 hospital_code
	*/
	public void setHospital_code(String hospital_code) {
		this.hospital_code = hospital_code;
	}
	/**
	* @return name
	*/
	public String getName() {
		return name;
	}
	/**
	* @param name 要设置的 name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	* @return hospital_grade
	*/
	public String getHospital_grade() {
		return hospital_grade;
	}
	/**
	* @param hospital_grade 要设置的 hospital_grade
	*/
	public void setHospital_grade(String hospital_grade) {
		this.hospital_grade = hospital_grade;
	}
	/**
	* @return current_level_start_time
	*/
	public String getCurrent_level_start_time() {
		return current_level_start_time;
	}
	/**
	* @param current_level_start_time 要设置的 current_level_start_time
	*/
	public void setCurrent_level_start_time(String current_level_start_time) {
		this.current_level_start_time = current_level_start_time;
	}
	/**
	* @return current_level_end_time
	*/
	public String getCurrent_level_end_time() {
		return current_level_end_time;
	}
	/**
	* @param current_level_end_time 要设置的 current_level_end_time
	*/
	public void setCurrent_level_end_time(String current_level_end_time) {
		this.current_level_end_time = current_level_end_time;
	}
	/**
	* @return contacts
	*/
	public String getContacts() {
		return contacts;
	}
	/**
	* @param contacts 要设置的 contacts
	*/
	public void setContacts(String contacts) {
		this.contacts = contacts;
	}
	/**
	* @return phone
	*/
	public String getPhone() {
		return phone;
	}
	/**
	* @param phone 要设置的 phone
	*/
	public void setPhone(String phone) {
		this.phone = phone;
	}
	/**
	* @return mobilephone
	*/
	public String getMobilephone() {
		return mobilephone;
	}
	/**
	* @param mobilephone 要设置的 mobilephone
	*/
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	/**
	* @return address
	*/
	public String getAddress() {
		return address;
	}
	/**
	* @param address 要设置的 address
	*/
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	* @return nature
	*/
	public String getNature() {
		return nature;
	}
	/**
	* @param nature 要设置的 nature
	*/
	public void setNature(String nature) {
		this.nature = nature;
	}
	/**
	* @return whether_ding
	*/
	public String getWhether_ding() {
		return whether_ding;
	}
	/**
	* @param whether_ding 要设置的 whether_ding
	*/
	public void setWhether_ding(String whether_ding) {
		this.whether_ding = whether_ding;
	}
	/**
	* @return profit_nature
	*/
	public String getProfit_nature() {
		return profit_nature;
	}
	/**
	* @param profit_nature 要设置的 profit_nature
	*/
	public void setProfit_nature(String profit_nature) {
		this.profit_nature = profit_nature;
	}
	/**
	* @return administrative_level
	*/
	public String getAdministrative_level() {
		return administrative_level;
	}
	/**
	* @param administrative_level 要设置的 administrative_level
	*/
	public void setAdministrative_level(String administrative_level) {
		this.administrative_level = administrative_level;
	}
	/**
	* @return area_code
	*/
	public String getArea_code() {
		return area_code;
	}
	/**
	* @param area_code 要设置的 area_code
	*/
	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}
	
	
}
