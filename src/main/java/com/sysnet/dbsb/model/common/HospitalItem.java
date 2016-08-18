package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 住院费用明细
 * @author dengweihua
 *
 */
@XmlRootElement(name = "hospitalFeeInfo")
@XmlAccessorType(XmlAccessType.FIELD)
public class HospitalItem {
	@XmlElement
	private String his_fee_detail_code="";// IS 费用明细唯一编码
	@XmlElement
	private String three_catalog_source="";// 三大目录来源
	@XmlElement
	private String yb_three_catalog_category="";// 医保三大目录类别
	@XmlElement
	private String yb_three_catalog_type="";// 医保三大目录类型
	@XmlElement
	private String yb_three_catalog_code="";// 医保三大目录编号
	@XmlElement
	private String yb_three_catalog_name="";// 医保三大目录名称
	@XmlElement
	private String self_expense_ratio="";// 自费比例
	@XmlElement
	private String yy_three_catalog_code="";// 医院三大目录编号
	@XmlElement
	private String yy_three_catalog_name="";// 医院三大目录名称
	@XmlElement
	private String zy_quantity="";// 中药副数
	@XmlElement
	private String quantity="";// 数量
	@XmlElement
	private String price="";// 单价
	@XmlElement
	private String total_amount="";// 总金额
	@XmlElement
	private String whether_compliant="";// 是否合规
	@XmlElement
	private String order_executed_date="";// 医嘱执行时间
	@XmlTransient
	private String ListSerialNum = "";//处方号
	
	@XmlTransient
	private String medical_record_no="";// 医保号

	@XmlTransient
	private String hospital_registration_sn="";// 住院登记流水号

//	private String arg1;
//	private String arg2;
//	private String arg3;
//	private String arg4;
//	private String arg5;
//	private String arg6;
//	private String arg7;
//	private String arg8;
//	private String arg9;
//	private String arg10;
	
	
	public String getHis_fee_detail_code() {
		return his_fee_detail_code;
	}
	/**
	* @return hospital_registration_sn
	*/
	public String getHospital_registration_sn() {
		return hospital_registration_sn;
	}
	
	
	/**
	* @return listSerialNum
	*/
	public String getListSerialNum() {
		return ListSerialNum;
	}

	/**
	* @return medical_record_no
	*/
	public String getMedical_record_no() {
		return medical_record_no;
	}

	public String getOrder_executed_date() {
		return order_executed_date;
	}

	public String getPrice() {
		return price;
	}

	public String getQuantity() {
		return quantity;
	}

	public String getSelf_expense_ratio() {
		return self_expense_ratio;
	}

	public String getThree_catalog_source() {
		return three_catalog_source;
	}

	public String getTotal_amount() {
		return total_amount;
	}

	public String getWhether_compliant() {
		return whether_compliant;
	}

	public String getYb_three_catalog_category() {
		return yb_three_catalog_category;
	}

	public String getYb_three_catalog_code() {
		return yb_three_catalog_code;
	}

	public String getYb_three_catalog_name() {
		return yb_three_catalog_name;
	}

	public String getYb_three_catalog_type() {
		return yb_three_catalog_type;
	}

	public String getYy_three_catalog_code() {
		return yy_three_catalog_code;
	}

	public String getYy_three_catalog_name() {
		return yy_three_catalog_name;
	}

	public String getZy_quantity() {
		return zy_quantity;
	}

	public void setHis_fee_detail_code(String his_fee_detail_code) {
		this.his_fee_detail_code = his_fee_detail_code;
	}

	/**
	* @param hospital_registration_sn 要设置的 hospital_registration_sn
	*/
	public void setHospital_registration_sn(String hospital_registration_sn) {
		this.hospital_registration_sn = hospital_registration_sn;
	}

	/**
	* @param listSerialNum 要设置的 listSerialNum
	*/
	public void setListSerialNum(String listSerialNum) {
		ListSerialNum = listSerialNum;
	}

	/**
	* @param medical_record_no 要设置的 medical_record_no
	*/
	public void setMedical_record_no(String medical_record_no) {
		this.medical_record_no = medical_record_no;
	}

	public void setOrder_executed_date(String order_executed_date) {
		this.order_executed_date = order_executed_date;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public void setSelf_expense_ratio(String self_expense_ratio) {
		this.self_expense_ratio = self_expense_ratio;
	}

	public void setThree_catalog_source(String three_catalog_source) {
		this.three_catalog_source = three_catalog_source;
	}

	public void setTotal_amount(String total_amount) {
		this.total_amount = total_amount;
	}

	public void setWhether_compliant(String whether_compliant) {
		this.whether_compliant = whether_compliant;
	}

	public void setYb_three_catalog_category(String yb_three_catalog_category) {
		this.yb_three_catalog_category = yb_three_catalog_category;
	}

	public void setYb_three_catalog_code(String yb_three_catalog_code) {
		this.yb_three_catalog_code = yb_three_catalog_code;
	}

	public void setYb_three_catalog_name(String yb_three_catalog_name) {
		this.yb_three_catalog_name = yb_three_catalog_name;
	}

	public void setYb_three_catalog_type(String yb_three_catalog_type) {
		this.yb_three_catalog_type = yb_three_catalog_type;
	}

	public void setYy_three_catalog_code(String yy_three_catalog_code) {
		this.yy_three_catalog_code = yy_three_catalog_code;
	}

	public void setYy_three_catalog_name(String yy_three_catalog_name) {
		this.yy_three_catalog_name = yy_three_catalog_name;
	}

	public void setZy_quantity(String zy_quantity) {
		this.zy_quantity = zy_quantity;
	}

	
}
