/**
* @Title: PersonBody.java
* @Package com.sysnet.dbsb.model.plicc.person
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:22
* @version V1.0
*/
package com.sysnet.dbsb.model.plicc.person;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.common.InsuredPerson;

/**
* @ClassName: PersonBody
* @Description: 
* @author dengweihua
* @date 2016年2月24日 上午9:57:22
*/
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class PersonBody {
	@XmlElement(name="insurantInfo")
	private InsuredPerson insuredPerson;

	/**
	* @return insuredPerson
	*/
	public InsuredPerson getInsuredPerson() {
		return insuredPerson;
	}

	/**
	* @param insuredPerson 要设置的 insuredPerson
	*/
	public void setInsuredPerson(InsuredPerson insuredPerson) {
		this.insuredPerson = insuredPerson;
	}

}
