package com.sysnet.dbsb.model.picc.H210;

import java.util.List;

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
@XmlRootElement(name = "MedResultList")
public class MedResultList {
	@XmlElement(name="MedResult")
	private List<MedResult> MedResults;

	public List<MedResult> getMedResults() {
		return MedResults;
	}

	public void setMedResults(List<MedResult> medResults) {
		MedResults = medResults;
	}
	
}
