package com.sysnet.dbsb.model.plicc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "head")
public class Head {
	@XmlElement
	private String standard_version_code="V2.4.2";//
	@XmlElement
	private String group_id="";//
	@XmlElement
	private String bus_code="";// 交易号
	@XmlElement
	private String bus_sub_code="";// 子交易号
	@XmlElement
	private String bus_type="0";// 大病的付款对象(结算对象)， 0-个人 1-医院2-医保结算机构
	@XmlElement
	private String total_count="1";//
	@XmlElement
	private String total_packge="1";//
	@XmlElement
	private String package_id="1";//
	@XmlElement
	private String data_count="1";//
	@XmlElement
	private String area_code="610429";// 基本医保系统所在地区的国家行政地区代码
	@XmlElement
	private String outside_system_code="SXXNH_SYSNET";// 外接系统编号由大病系统统一发放，非空
	@XmlElement
	private String outside_system_type="2";// 1—城镇居民 2—新农合 3—城乡居民 4-城镇职工 5-城乡救助 6-其
	@XmlElement
	private String ding_hosp_code="";//
	@XmlElement
	private String option_person_code="admin";//
	@XmlElement
	private String insured_year="2016";// 参合年度

	public String getStandard_version_code() {
		return standard_version_code;
	}

	public void setStandard_version_code(String standard_version_code) {
		this.standard_version_code = standard_version_code;
	}

	public String getGroup_id() {
		return group_id;
	}

	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}

	public String getBus_code() {
		return bus_code;
	}

	public void setBus_code(String bus_code) {
		this.bus_code = bus_code;
	}

	public String getBus_sub_code() {
		return bus_sub_code;
	}

	public void setBus_sub_code(String bus_sub_code) {
		this.bus_sub_code = bus_sub_code;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	public String getTotal_count() {
		return total_count;
	}

	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}

	public String getTotal_packge() {
		return total_packge;
	}

	public void setTotal_packge(String total_packge) {
		this.total_packge = total_packge;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public String getData_count() {
		return data_count;
	}

	public void setData_count(String data_count) {
		this.data_count = data_count;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getOutside_system_code() {
		return outside_system_code;
	}

	public void setOutside_system_code(String outside_system_code) {
		this.outside_system_code = outside_system_code;
	}

	public String getOutside_system_type() {
		return outside_system_type;
	}

	public void setOutside_system_type(String outside_system_type) {
		this.outside_system_type = outside_system_type;
	}

	public String getDing_hosp_code() {
		return ding_hosp_code;
	}

	public void setDing_hosp_code(String ding_hosp_code) {
		this.ding_hosp_code = ding_hosp_code;
	}

	public String getOption_person_code() {
		return option_person_code;
	}

	public void setOption_person_code(String option_person_code) {
		this.option_person_code = option_person_code;
	}

	public String getInsured_year() {
		return insured_year;
	}

	public void setInsured_year(String insured_year) {
		this.insured_year = insured_year;
	}

}
