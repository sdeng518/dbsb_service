/**
* @Title: ConfigInfo.java
* @Package com.sysnet.dbsb.model.common
* @Description: 
* @author dengweihua
* @date 2016年1月22日 上午10:17:33
* @version V1.0
*/
package com.sysnet.dbsb.model.common;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ConfigInfo
 * @Description:
 * @author dengweihua
 * @date 2016年1月22日 上午10:17:33
 */
@Component
public class ConfigInfo {
	@Value("${provider_type}")
	private String provider_type;
	@Value("${ws_url}")
	private String ws_url;
	@Value("${medical_record_no}")
	private String medical_record_no;
	@Value("${hospital_registration_sn}")
	private String hospital_registration_sn;
	@Value("${hospitalId}")
	private String hospitalId;
	@Value("${ws_url_plicc}")
	private String ws_url_plicc;
	@Value("${contract_number}")
	private String contract_number;//合同号
	@Value("${case_number}")
	private String case_number;//赔案号
	@Value("${settlement_number}")
	private String settlement_number;//医院结算单号
	
	
	public String getContract_number() {
		return contract_number;
	}
	public void setContract_number(String contract_number) {
		this.contract_number = contract_number;
	}
	public String getCase_number() {
		return case_number;
	}
	public void setCase_number(String case_number) {
		this.case_number = case_number;
	}
	public String getSettlement_number() {
		return settlement_number;
	}
	public void setSettlement_number(String settlement_number) {
		this.settlement_number = settlement_number;
	}
	/**
	* @return ws_url_plicc
	*/
	public String getWs_url_plicc() {
		return ws_url_plicc;
	}
	/**
	* @param ws_url_plicc 要设置的 ws_url_plicc
	*/
	public void setWs_url_plicc(String ws_url_plicc) {
		this.ws_url_plicc = ws_url_plicc;
	}
	/**
	* @return hospitalId
	*/
	public String getHospitalId() {
		return hospitalId;
	}
	/**
	* @param hospitalId 要设置的 hospitalId
	*/
	public void setHospitalId(String hospitalId) {
		this.hospitalId = hospitalId;
	}
	private List<String> medical_record_nos;
	/**
	* @return medical_record_nos
	*/
	public List<String> getMedical_record_nos() {
		String[] records = StringUtils.split(medical_record_no, ",");
		if (records.length == 0) {
			records = new String[]{""};
		}
		
		return Arrays.asList(records);
	}
	/**
	* @param medical_record_nos 要设置的 medical_record_nos
	*/
	public void setMedical_record_nos(List<String> medical_record_nos) {
		this.medical_record_nos = medical_record_nos;
	}
	/**
	* @return provider_type
	*/
	public String getProvider_type() {
		return provider_type;
	}
	/**
	* @param provider_type 要设置的 provider_type
	*/
	public void setProvider_type(String provider_type) {
		this.provider_type = provider_type;
	}
	/**
	* @return ws_url
	*/
	public String getWs_url() {
		return ws_url;
	}
	/**
	* @param ws_url 要设置的 ws_url
	*/
	public void setWs_url(String ws_url) {
		this.ws_url = ws_url;
	}
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
		this.setMedical_record_nos(Arrays.asList(StringUtils.split(medical_record_no, ",")));
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

	

}
