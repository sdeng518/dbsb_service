/**
* @Title: PersonBody.java
* @Package com.sysnet.dbsb.model.plicc.person
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:22
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.registration;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.HospitalRegistration;

/**
* @ClassName: PersonBody
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:22
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class RegistrationBody {
	@XmlElement(name="hospitalRegistrationInfo")
	private HospitalRegistration hospitalRegistration;

	/**
	* @return hospitalRegistration
	*/
	public HospitalRegistration getHospitalRegistration() {
		return hospitalRegistration;
	}

	/**
	* @param hospitalRegistration 要设置的 hospitalRegistration
	*/
	public void setHospitalRegistration(HospitalRegistration hospitalRegistration) {
		this.hospitalRegistration = hospitalRegistration;
	}
	
	

}
