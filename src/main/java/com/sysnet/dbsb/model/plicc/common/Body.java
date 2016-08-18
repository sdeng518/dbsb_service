/**
* @Title: Body.java
* @Package com.sysnet.dbsb.model.plicc.common
* @Description: 
* @author dengweihua
* @date 2016年3月22日 下午4:37:00
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
* @ClassName: Body
* @Description: 
* @author dengweihua
* @date 2016年3月22日 下午4:37:00
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body {
	@XmlElement
	private String status = "";
	@XmlElement
	private String msg = "";
	/**
	* @return status
	*/
	public String getStatus() {
		return status;
	}
	/**
	* @param status 要设置的 status
	*/
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	* @return msg
	*/
	public String getMsg() {
		return msg;
	}
	/**
	* @param msg 要设置的 msg
	*/
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
