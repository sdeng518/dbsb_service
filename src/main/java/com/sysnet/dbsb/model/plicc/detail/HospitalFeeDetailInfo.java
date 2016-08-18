/**
* @Title: HospitalFeeDetailInfo.java
* @Package com.sysnet.dbsb.model.plicc.detail
* @Description: 
* @author dengweihua
* @date 2016年3月28日 下午2:24:08
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.detail;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalItem;

/**
* @ClassName: HospitalFeeDetailInfo
* @Description: 
* @author dengweihua
* @date 2016年3月28日 下午2:24:08
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "hospitalFeeDetailInfo")
public class HospitalFeeDetailInfo {
	@XmlElement
	private String medical_record_no = "";
	@XmlElement
	private String hospital_registration_sn = "";
	@XmlElement
	private String name = "";
	@XmlElement
	private String sex = "";
	@XmlElement
	private String id_type = "";
	@XmlElement
	private String id_number = "";
	@XmlElement(name="hospitalFeeInfo")
	private List<HospitalItem> hospitalFees;// 诊疗项目
	/**
	* @return medical_record_no
	*/
	public String getMedical_record_no() {
		return medical_record_no;
	}
	/**
	* @param medical_record_no 要设置的 medical_record_no
	*/
	public void setMedical_record_no(String medical_record_no) {
		this.medical_record_no = medical_record_no;
	}
	/**
	* @return hospital_registration_sn
	*/
	public String getHospital_registration_sn() {
		return hospital_registration_sn;
	}
	/**
	* @param hospital_registration_sn 要设置的 hospital_registration_sn
	*/
	public void setHospital_registration_sn(String hospital_registration_sn) {
		this.hospital_registration_sn = hospital_registration_sn;
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
	* @return sex
	*/
	public String getSex() {
		return sex;
	}
	/**
	* @param sex 要设置的 sex
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	* @return id_type
	*/
	public String getId_type() {
		return id_type;
	}
	/**
	* @param id_type 要设置的 id_type
	*/
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	/**
	* @return id_number
	*/
	public String getId_number() {
		return id_number;
	}
	/**
	* @param id_number 要设置的 id_number
	*/
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	/**
	* @return hospitalFees
	*/
	public List<HospitalItem> getHospitalFees() {
		return hospitalFees;
	}
	/**
	* @param hospitalFees 要设置的 hospitalFees
	*/
	public void setHospitalFees(List<HospitalItem> hospitalFees) {
		this.hospitalFees = hospitalFees;
	}
	
}
