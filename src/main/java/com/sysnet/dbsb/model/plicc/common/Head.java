package com.sysnet.dbsb.model.plicc.common;

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
	private String group_id="";//
	@XmlElement
	private String bus_code="";// 交易号
	@XmlElement
	private String bus_sub_code="";// 子交易号
	@XmlElement
	private String package_id="1";//
	/**
	* @return group_id
	*/
	public String getGroup_id() {
		return group_id;
	}
	/**
	* @param group_id 要设置的 group_id
	*/
	public void setGroup_id(String group_id) {
		this.group_id = group_id;
	}
	/**
	* @return bus_code
	*/
	public String getBus_code() {
		return bus_code;
	}
	/**
	* @param bus_code 要设置的 bus_code
	*/
	public void setBus_code(String bus_code) {
		this.bus_code = bus_code;
	}
	/**
	* @return bus_sub_code
	*/
	public String getBus_sub_code() {
		return bus_sub_code;
	}
	/**
	* @param bus_sub_code 要设置的 bus_sub_code
	*/
	public void setBus_sub_code(String bus_sub_code) {
		this.bus_sub_code = bus_sub_code;
	}
	/**
	* @return package_id
	*/
	public String getPackage_id() {
		return package_id;
	}
	/**
	* @param package_id 要设置的 package_id
	*/
	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}
	
	
}
