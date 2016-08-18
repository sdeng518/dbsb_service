package com.sysnet.dbsb.model.plicc.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "body")
public class SearchBody {
	@XmlElement(name="compensationSearchInfo")
	private  CompensationSearchInfo compensationSearchInfo;

	/**
	* @return compensationSearchInfo
	*/
	public CompensationSearchInfo getCompensationSearchInfo() {
		return compensationSearchInfo;
	}

	/**
	* @param compensationSearchInfo 要设置的 compensationSearchInfo
	*/
	public void setCompensationSearchInfo(CompensationSearchInfo compensationSearchInfo) {
		this.compensationSearchInfo = compensationSearchInfo;
	}

	
}
