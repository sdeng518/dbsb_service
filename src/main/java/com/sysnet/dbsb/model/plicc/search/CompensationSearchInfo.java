/**
* @Title: CompensationSearchInfo.java
* @Package com.sysnet.dbsb.model.plicc.search
* @Description: 
* @author dengweihua
* @date 2016年3月29日 下午3:03:24
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* @ClassName: CompensationSearchInfo
* @Description: 
* @author dengweihua
* @date 2016年3月29日 下午3:03:24
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compensationSearchInfo")
public class CompensationSearchInfo {
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
	private String case_number ="999";//赔案号
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
	* @return case_number
	*/
	public String getCase_number() {
		return case_number;
	}
	/**
	* @param case_number 要设置的 case_number
	*/
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	/**
	* @return arg1
	*/
	public String getArg1() {
		return arg1;
	}
	/**
	* @param arg1 要设置的 arg1
	*/
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	/**
	* @return arg2
	*/
	public String getArg2() {
		return arg2;
	}
	/**
	* @param arg2 要设置的 arg2
	*/
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	/**
	* @return arg3
	*/
	public String getArg3() {
		return arg3;
	}
	/**
	* @param arg3 要设置的 arg3
	*/
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
	/**
	* @return arg4
	*/
	public String getArg4() {
		return arg4;
	}
	/**
	* @param arg4 要设置的 arg4
	*/
	public void setArg4(String arg4) {
		this.arg4 = arg4;
	}
	/**
	* @return arg5
	*/
	public String getArg5() {
		return arg5;
	}
	/**
	* @param arg5 要设置的 arg5
	*/
	public void setArg5(String arg5) {
		this.arg5 = arg5;
	}
	/**
	* @return arg6
	*/
	public String getArg6() {
		return arg6;
	}
	/**
	* @param arg6 要设置的 arg6
	*/
	public void setArg6(String arg6) {
		this.arg6 = arg6;
	}
	/**
	* @return arg7
	*/
	public String getArg7() {
		return arg7;
	}
	/**
	* @param arg7 要设置的 arg7
	*/
	public void setArg7(String arg7) {
		this.arg7 = arg7;
	}
	/**
	* @return arg8
	*/
	public String getArg8() {
		return arg8;
	}
	/**
	* @param arg8 要设置的 arg8
	*/
	public void setArg8(String arg8) {
		this.arg8 = arg8;
	}
	/**
	* @return arg9
	*/
	public String getArg9() {
		return arg9;
	}
	/**
	* @param arg9 要设置的 arg9
	*/
	public void setArg9(String arg9) {
		this.arg9 = arg9;
	}
	/**
	* @return arg10
	*/
	public String getArg10() {
		return arg10;
	}
	/**
	* @param arg10 要设置的 arg10
	*/
	public void setArg10(String arg10) {
		this.arg10 = arg10;
	}
	
	
}
