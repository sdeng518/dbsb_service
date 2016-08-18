package com.sysnet.dbsb.model.plicc.compensation;

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
@XmlRootElement(name = "hospitalCompensationInfo")
public class HospitalCompensationInfo {
	@XmlElement
	private String medical_record_no="";// 医保号
	@XmlElement
	private String hospital_registration_sn="";// 住院登记流水号
	
	@XmlElement
	private String name=""; // 姓名
	@XmlElement
	private String sex=""; // 性别
	@XmlElement
	private String id_type=""; // 证件类型
	@XmlElement
	private String id_number=""; // 证件号码
	@XmlElement
	private String settlement_number="";// 医院结算单号
	@XmlElement
	private String in_hospital_style;//入院类型
	
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
	
	@XmlTransient
	private String clinicNum ="";//医院内部住院号
	@XmlTransient
	private String ding_hosp_code="";
	@XmlTransient
	private String uploadflag="";
	@XmlElement
	private String arg1="";//预留 1
	@XmlElement
	private String arg2="";//预留
	@XmlElement
	private String arg3="";//预留
	@XmlElement
	private String arg4="";//预留
	@XmlElement
	private String arg5="";//预留
	@XmlElement
	private String arg6="";//预留
	@XmlElement
	private String arg7="";//预留
	@XmlElement
	private String arg8="";//预留
	@XmlElement
	private String arg9="";//预留
	@XmlElement
	private String arg10="";//预留
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
	/**
	* @return name
	*/
	public String getName() {
		return name;
	}
	/**
	* @param name 要设置的 name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	* @return sex
	*/
	public String getSex() {
		return sex;
	}
	/**
	* @param sex 要设置的 sex
	*/
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	* @return id_type
	*/
	public String getId_type() {
		return id_type;
	}
	/**
	* @param id_type 要设置的 id_type
	*/
	public void setId_type(String id_type) {
		this.id_type = id_type;
	}
	/**
	* @return id_number
	*/
	public String getId_number() {
		return id_number;
	}
	/**
	* @param id_number 要设置的 id_number
	*/
	public void setId_number(String id_number) {
		this.id_number = id_number;
	}
	/**
	* @return settlement_number
	*/
	public String getSettlement_number() {
		return settlement_number;
	}
	/**
	* @param settlement_number 要设置的 settlement_number
	*/
	public void setSettlement_number(String settlement_number) {
		this.settlement_number = settlement_number;
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
	* @return leave_state
	*/
	public String getLeave_state() {
		return leave_state;
	}
	/**
	* @param leave_state 要设置的 leave_state
	*/
	public void setLeave_state(String leave_state) {
		this.leave_state = leave_state;
	}
	/**
	* @return referral_ratio
	*/
	public String getReferral_ratio() {
		return referral_ratio;
	}
	/**
	* @param referral_ratio 要设置的 referral_ratio
	*/
	public void setReferral_ratio(String referral_ratio) {
		this.referral_ratio = referral_ratio;
	}
	/**
	* @return leave_hospital_style
	*/
	public String getLeave_hospital_style() {
		return leave_hospital_style;
	}
	/**
	* @param leave_hospital_style 要设置的 leave_hospital_style
	*/
	public void setLeave_hospital_style(String leave_hospital_style) {
		this.leave_hospital_style = leave_hospital_style;
	}
	/**
	* @return leave_date
	*/
	public String getLeave_date() {
		return leave_date;
	}
	/**
	* @param leave_date 要设置的 leave_date
	*/
	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}
	/**
	* @return death_time
	*/
	public String getDeath_time() {
		return death_time;
	}
	/**
	* @param death_time 要设置的 death_time
	*/
	public void setDeath_time(String death_time) {
		this.death_time = death_time;
	}
	/**
	* @return leave_disease_code
	*/
	public String getLeave_disease_code() {
		return leave_disease_code;
	}
	/**
	* @param leave_disease_code 要设置的 leave_disease_code
	*/
	public void setLeave_disease_code(String leave_disease_code) {
		this.leave_disease_code = leave_disease_code;
	}
	/**
	* @return complication
	*/
	public String getComplication() {
		return complication;
	}
	/**
	* @param complication 要设置的 complication
	*/
	public void setComplication(String complication) {
		this.complication = complication;
	}
	/**
	* @return total_payment
	*/
	public String getTotal_payment() {
		return total_payment;
	}
	/**
	* @param total_payment 要设置的 total_payment
	*/
	public void setTotal_payment(String total_payment) {
		this.total_payment = total_payment;
	}
	/**
	* @return jialei_payment
	*/
	public String getJialei_payment() {
		return jialei_payment;
	}
	/**
	* @param jialei_payment 要设置的 jialei_payment
	*/
	public void setJialei_payment(String jialei_payment) {
		this.jialei_payment = jialei_payment;
	}
	/**
	* @return yilei_baoxiao
	*/
	public String getYilei_baoxiao() {
		return yilei_baoxiao;
	}
	/**
	* @param yilei_baoxiao 要设置的 yilei_baoxiao
	*/
	public void setYilei_baoxiao(String yilei_baoxiao) {
		this.yilei_baoxiao = yilei_baoxiao;
	}
	/**
	* @return yilei_payment
	*/
	public String getYilei_payment() {
		return yilei_payment;
	}
	/**
	* @param yilei_payment 要设置的 yilei_payment
	*/
	public void setYilei_payment(String yilei_payment) {
		this.yilei_payment = yilei_payment;
	}
	/**
	* @return binglei_yibao
	*/
	public String getBinglei_yibao() {
		return binglei_yibao;
	}
	/**
	* @param binglei_yibao 要设置的 binglei_yibao
	*/
	public void setBinglei_yibao(String binglei_yibao) {
		this.binglei_yibao = binglei_yibao;
	}
	/**
	* @return binglei_payment
	*/
	public String getBinglei_payment() {
		return binglei_payment;
	}
	/**
	* @param binglei_payment 要设置的 binglei_payment
	*/
	public void setBinglei_payment(String binglei_payment) {
		this.binglei_payment = binglei_payment;
	}
	/**
	* @return zy_payment
	*/
	public String getZy_payment() {
		return zy_payment;
	}
	/**
	* @param zy_payment 要设置的 zy_payment
	*/
	public void setZy_payment(String zy_payment) {
		this.zy_payment = zy_payment;
	}
	/**
	* @return xy_payment
	*/
	public String getXy_payment() {
		return xy_payment;
	}
	/**
	* @param xy_payment 要设置的 xy_payment
	*/
	public void setXy_payment(String xy_payment) {
		this.xy_payment = xy_payment;
	}
	/**
	* @return yb_start_pay_line
	*/
	public String getYb_start_pay_line() {
		return yb_start_pay_line;
	}
	/**
	* @param yb_start_pay_line 要设置的 yb_start_pay_line
	*/
	public void setYb_start_pay_line(String yb_start_pay_line) {
		this.yb_start_pay_line = yb_start_pay_line;
	}
	/**
	* @return fit_into_yb_amount
	*/
	public String getFit_into_yb_amount() {
		return fit_into_yb_amount;
	}
	/**
	* @param fit_into_yb_amount 要设置的 fit_into_yb_amount
	*/
	public void setFit_into_yb_amount(String fit_into_yb_amount) {
		this.fit_into_yb_amount = fit_into_yb_amount;
	}
	/**
	* @return yb_compensation
	*/
	public String getYb_compensation() {
		return yb_compensation;
	}
	/**
	* @param yb_compensation 要设置的 yb_compensation
	*/
	public void setYb_compensation(String yb_compensation) {
		this.yb_compensation = yb_compensation;
	}
	/**
	* @return yb_year_compensation
	*/
	public String getYb_year_compensation() {
		return yb_year_compensation;
	}
	/**
	* @param yb_year_compensation 要设置的 yb_year_compensation
	*/
	public void setYb_year_compensation(String yb_year_compensation) {
		this.yb_year_compensation = yb_year_compensation;
	}
	/**
	* @return third_party_compensation
	*/
	public String getThird_party_compensation() {
		return third_party_compensation;
	}
	/**
	* @param third_party_compensation 要设置的 third_party_compensation
	*/
	public void setThird_party_compensation(String third_party_compensation) {
		this.third_party_compensation = third_party_compensation;
	}
	/**
	* @return year_third_party_compensation
	*/
	public String getYear_third_party_compensation() {
		return year_third_party_compensation;
	}
	/**
	* @param year_third_party_compensation 要设置的 year_third_party_compensation
	*/
	public void setYear_third_party_compensation(String year_third_party_compensation) {
		this.year_third_party_compensation = year_third_party_compensation;
	}
	/**
	* @return db_compensation
	*/
	public String getDb_compensation() {
		return db_compensation;
	}
	/**
	* @param db_compensation 要设置的 db_compensation
	*/
	public void setDb_compensation(String db_compensation) {
		this.db_compensation = db_compensation;
	}
	/**
	* @return db_year_compensation
	*/
	public String getDb_year_compensation() {
		return db_year_compensation;
	}
	/**
	* @param db_year_compensation 要设置的 db_year_compensation
	*/
	public void setDb_year_compensation(String db_year_compensation) {
		this.db_year_compensation = db_year_compensation;
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
	* @return arg1
	*/
	public String getArg1() {
		return arg1;
	}
	/**
	* @param arg1 要设置的 arg1
	*/
	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}
	/**
	* @return arg2
	*/
	public String getArg2() {
		return arg2;
	}
	/**
	* @param arg2 要设置的 arg2
	*/
	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}
	/**
	* @return arg3
	*/
	public String getArg3() {
		return arg3;
	}
	/**
	* @param arg3 要设置的 arg3
	*/
	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}
	/**
	* @return arg4
	*/
	public String getArg4() {
		return arg4;
	}
	/**
	* @param arg4 要设置的 arg4
	*/
	public void setArg4(String arg4) {
		this.arg4 = arg4;
	}
	/**
	* @return arg5
	*/
	public String getArg5() {
		return arg5;
	}
	/**
	* @param arg5 要设置的 arg5
	*/
	public void setArg5(String arg5) {
		this.arg5 = arg5;
	}
	/**
	* @return arg6
	*/
	public String getArg6() {
		return arg6;
	}
	/**
	* @param arg6 要设置的 arg6
	*/
	public void setArg6(String arg6) {
		this.arg6 = arg6;
	}
	/**
	* @return arg7
	*/
	public String getArg7() {
		return arg7;
	}
	/**
	* @param arg7 要设置的 arg7
	*/
	public void setArg7(String arg7) {
		this.arg7 = arg7;
	}
	/**
	* @return arg8
	*/
	public String getArg8() {
		return arg8;
	}
	/**
	* @param arg8 要设置的 arg8
	*/
	public void setArg8(String arg8) {
		this.arg8 = arg8;
	}
	/**
	* @return arg9
	*/
	public String getArg9() {
		return arg9;
	}
	/**
	* @param arg9 要设置的 arg9
	*/
	public void setArg9(String arg9) {
		this.arg9 = arg9;
	}
	/**
	* @return arg10
	*/
	public String getArg10() {
		return arg10;
	}
	/**
	* @param arg10 要设置的 arg10
	*/
	public void setArg10(String arg10) {
		this.arg10 = arg10;
	}
	
}
