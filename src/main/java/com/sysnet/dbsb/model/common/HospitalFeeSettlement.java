package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * 住院费用结算
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "compensationInfo")
public class HospitalFeeSettlement {
	@XmlElement
	private String settlement_number="";// 医院结算单号
	@XmlElement
	private String leave_state="";// 离院状态
	@XmlElement
	private String referral_ratio="";// 转诊赔付比例
	@XmlElement
	private String leave_hospital_style="";// 出院方式
	@XmlElement
	private String leave_date="";// 出院时间
	@XmlElement
	private String death_time="";// 死亡时间
	@XmlElement
	private String leave_disease_code="";// 离院诊断疾病
	@XmlElement
	private String complication="";// 并发症
	@XmlElement
	private String total_payment="";// 医疗总费用
	@XmlElement
	private String jialei_payment="";// 甲类费用
	@XmlElement
	private String yilei_baoxiao="";// 乙类医保
	@XmlElement
	private String yilei_payment="";// 乙类自付
	@XmlElement
	private String binglei_yibao="";// 丙类医保
	@XmlElement
	private String binglei_payment="";// 丙类自费
	@XmlElement
	private String zy_payment="";// 中药费用
	@XmlElement
	private String xy_payment="";// 西药费用
	@XmlElement
	private String yb_start_pay_line="";// 基本医保起付线
	@XmlElement
	private String fit_into_yb_amount="";// 纳入基本医保统筹费用
	@XmlElement
	private String yb_compensation="";// 基本医保补偿费用
	@XmlElement
	private String yb_year_compensation="";// 年度基本医保 累计支付费用
	@XmlElement
	private String third_party_compensation="";// 第三方补助
	@XmlElement
	private String year_third_party_compensation="";// 年度第三方累计补助总额
	@XmlElement
	private String db_compensation="";// 大病补偿费用
	@XmlElement
	private String db_year_compensation="";// 年度大病补偿费用
	@XmlElement
	private String bank_code="";// 银行代码
	@XmlElement
	private String bank_name="";// 银行名称
	@XmlElement
	private String claim_payment_account="";// 银行账号
	@XmlElement
	private String account_holders="";// 开户人姓名
	@XmlElement
	private String in_hospital_style;//入院类型
	
	//以下无需提交到xml
	@XmlTransient
	private String medical_record_no="";// 医保号
	@XmlTransient
	private String hospital_registration_sn="";// 住院登记流水号
	@XmlTransient
	private String clinicNum ="";//医院内部住院号
	@XmlTransient
	private String ding_hosp_code="";
	@XmlTransient
	private String uploadflag="";
	
	/**
	* @return uploadflag
	*/
	public String getUploadflag() {
		return uploadflag;
	}

	/**
	* @param uploadflag 要设置的 uploadflag
	*/
	public void setUploadflag(String uploadflag) {
		this.uploadflag = uploadflag;
	}

	/**
	* @return ding_hosp_code
	*/
	public String getDing_hosp_code() {
		return ding_hosp_code;
	}

	/**
	* @param ding_hosp_code 要设置的 ding_hosp_code
	*/
	public void setDing_hosp_code(String ding_hosp_code) {
		this.ding_hosp_code = ding_hosp_code;
	}

	/**
	* @return clinicNum
	*/
	public String getClinicNum() {
		return clinicNum;
	}

	/**
	* @param clinicNum 要设置的 clinicNum
	*/
	public void setClinicNum(String clinicNum) {
		this.clinicNum = clinicNum;
	}

	/**
	* @return in_hospital_style
	*/
	public String getIn_hospital_style() {
		return in_hospital_style;
	}

	/**
	* @param in_hospital_style 要设置的 in_hospital_style
	*/
	public void setIn_hospital_style(String in_hospital_style) {
		this.in_hospital_style = in_hospital_style;
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

	public String getSettlement_number() {
		return settlement_number;
	}

	public void setSettlement_number(String settlement_number) {
		this.settlement_number = settlement_number;
	}

	public String getLeave_state() {
		return leave_state;
	}

	public void setLeave_state(String leave_state) {
		this.leave_state = leave_state;
	}

	public String getReferral_ratio() {
		return referral_ratio;
	}

	public void setReferral_ratio(String referral_ratio) {
		this.referral_ratio = referral_ratio;
	}

	public String getLeave_hospital_style() {
		return leave_hospital_style;
	}

	public void setLeave_hospital_style(String leave_hospital_style) {
		this.leave_hospital_style = leave_hospital_style;
	}

	public String getLeave_date() {
		return leave_date;
	}

	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}

	public String getDeath_time() {
		return death_time;
	}

	public void setDeath_time(String death_time) {
		this.death_time = death_time;
	}

	public String getLeave_disease_code() {
		return leave_disease_code;
	}

	public void setLeave_disease_code(String leave_disease_code) {
		this.leave_disease_code = leave_disease_code;
	}

	public String getComplication() {
		return complication;
	}

	public void setComplication(String complication) {
		this.complication = complication;
	}

	public String getTotal_payment() {
		return total_payment;
	}

	public void setTotal_payment(String total_payment) {
		this.total_payment = total_payment;
	}

	public String getJialei_payment() {
		return jialei_payment;
	}

	public void setJialei_payment(String jialei_payment) {
		this.jialei_payment = jialei_payment;
	}

	public String getYilei_baoxiao() {
		return yilei_baoxiao;
	}

	public void setYilei_baoxiao(String yilei_baoxiao) {
		this.yilei_baoxiao = yilei_baoxiao;
	}

	public String getYilei_payment() {
		return yilei_payment;
	}

	public void setYilei_payment(String yilei_payment) {
		this.yilei_payment = yilei_payment;
	}

	public String getBinglei_yibao() {
		return binglei_yibao;
	}

	public void setBinglei_yibao(String binglei_yibao) {
		this.binglei_yibao = binglei_yibao;
	}

	public String getBinglei_payment() {
		return binglei_payment;
	}

	public void setBinglei_payment(String binglei_payment) {
		this.binglei_payment = binglei_payment;
	}

	public String getZy_payment() {
		return zy_payment;
	}

	public void setZy_payment(String zy_payment) {
		this.zy_payment = zy_payment;
	}

	public String getXy_payment() {
		return xy_payment;
	}

	public void setXy_payment(String xy_payment) {
		this.xy_payment = xy_payment;
	}

	public String getYb_start_pay_line() {
		return yb_start_pay_line;
	}

	public void setYb_start_pay_line(String yb_start_pay_line) {
		this.yb_start_pay_line = yb_start_pay_line;
	}

	public String getFit_into_yb_amount() {
		return fit_into_yb_amount;
	}

	public void setFit_into_yb_amount(String fit_into_yb_amount) {
		this.fit_into_yb_amount = fit_into_yb_amount;
	}

	public String getYb_compensation() {
		return yb_compensation;
	}

	public void setYb_compensation(String yb_compensation) {
		this.yb_compensation = yb_compensation;
	}

	public String getYb_year_compensation() {
		return yb_year_compensation;
	}

	public void setYb_year_compensation(String yb_year_compensation) {
		this.yb_year_compensation = yb_year_compensation;
	}

	public String getThird_party_compensation() {
		return third_party_compensation;
	}

	public void setThird_party_compensation(String third_party_compensation) {
		this.third_party_compensation = third_party_compensation;
	}

	public String getYear_third_party_compensation() {
		return year_third_party_compensation;
	}

	public void setYear_third_party_compensation(
			String year_third_party_compensation) {
		this.year_third_party_compensation = year_third_party_compensation;
	}

	public String getDb_compensation() {
		return db_compensation;
	}

	public void setDb_compensation(String db_compensation) {
		this.db_compensation = db_compensation;
	}

	public String getDb_year_compensation() {
		return db_year_compensation;
	}

	public void setDb_year_compensation(String db_year_compensation) {
		this.db_year_compensation = db_year_compensation;
	}

	public String getBank_code() {
		return bank_code;
	}

	public void setBank_code(String bank_code) {
		this.bank_code = bank_code;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getClaim_payment_account() {
		return claim_payment_account;
	}

	public void setClaim_payment_account(String claim_payment_account) {
		this.claim_payment_account = claim_payment_account;
	}

	public String getAccount_holders() {
		return account_holders;
	}

	public void setAccount_holders(String account_holders) {
		this.account_holders = account_holders;
	}

}
