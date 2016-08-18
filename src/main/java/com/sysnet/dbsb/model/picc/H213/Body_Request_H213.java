package com.sysnet.dbsb.model.picc.H213;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 大病结果上传
 * 
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class Body_Request_H213 {
	@XmlElement(name = "FeeList")
	private List<FeeList> feeLists;

	/**
	 * @return feeLists
	 */
	public List<FeeList> getFeeLists() {
		return feeLists;
	}

	/**
	 * @param feeLists
	 *            要设置的 feeLists
	 */
	public void setFeeLists(List<FeeList> feeLists) {
		this.feeLists = feeLists;
	}

}
