package com.sysnet.dbsb.model.plicc.settlement;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 费用结算反馈消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "outExportHospitalCompensation")
public class OutExportHospitalCompensation {
	@XmlElement
	private String status;//返回状态
	@XmlElement
	private String msg;//返回信息
	@XmlElement
	private String medical_record_no;//医保号
	@XmlElement
	private String hospital_registration_sn;//住院登记流水号
	@XmlElement
	private String name;//姓名
	@XmlElement
	private String sex;//性别
	@XmlElement
	private String id_type;//证件类别
	@XmlElement
	private String id_number;//证件号码
	@XmlElement
	private String contract_number;//合同号
	@XmlElement
	private String case_number;//赔案号
	@XmlElement
	private String mobilephone;//联系电话
	@XmlElement
	private String accident_reason;//出险原因
	@XmlElement
	private String leave_hospital_style;//离院方式
	@XmlElement
	private String in_date;//就诊时间
	@XmlElement
	private String section_office;//就诊科室
	@XmlElement
	private String leave_date;//出院时间
	@XmlElement
	private String leave_state;//离院状态
	@XmlElement
	private String leave_disease_code;//出院诊断疾病
	@XmlElement
	private String settlement_number;//医院结算单号
	@XmlElement
	private String total_payment;//医疗总费用
	@XmlElement
	private String total_self_payment;//总自费
	@XmlElement
	private String db_pay_line;//大病报销起付线
	@XmlElement
	private String fit_into_db_amount;//纳入大病统筹费用
	@XmlElement
	private String deduction_payment;//不合规费用
	@XmlElement
	private String yb_compensation;//基本医保补偿费用
	@XmlElement
	private String db_compensation;//大病补偿费用
	@XmlElement
	private String db_year_compensation;//年度大病报销累计金额
	@XmlElement
	private String db_year_hospital_compensation;//年度大病报销住院累计金额
	@XmlElement
	private String db_year_clinic_compensation;//年度大病报销门诊累计金额
	@XmlElement
	private String third_party_compensation;//第三方补助
	@XmlElement
	private String compensate_date;//补偿日期
	@XmlElement
	private String nonreal_time_reason;//转非实时结算原因
	@XmlElement
	private String whether_ignore;//是否责任免除
	@XmlElement
	private String compensation_way;//补偿方式
	@XmlElement
	private String compensate_information;//计算过程
	@XmlElement
	private String insurance_sort;//险种名称
	@XmlElement
	private String ding_hosp_code;//结算医院
	@XmlElement
	private String employee;//结算办理人
	@XmlElement
	private String uppercase_compensation;//补偿费用大写
	@XmlElement
	private String settlement_download_link;//结算单下载链接

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getMedical_record_no() {
		return medical_record_no;
	}

	public void setMedical_record_no(String medical_record_no) {
		this.medical_record_no = medical_record_no;
	}

	public String getHospital_registration_sn() {
		return hospital_registration_sn;
	}

	public void setHospital_registration_sn(String hospital_registration_sn) {
		this.hospital_registration_sn = hospital_registration_sn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getId_type() {
		return id_type;
	}

	public void setId_type(String id_type) {
		this.id_type = id_type;
	}

	public String getId_number() {
		return id_number;
	}

	public void setId_number(String id_number) {
		this.id_number = id_number;
	}

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

	public String getMobilephone() {
		return mobilephone;
	}

	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}

	public String getAccident_reason() {
		return accident_reason;
	}

	public void setAccident_reason(String accident_reason) {
		this.accident_reason = accident_reason;
	}

	public String getLeave_hospital_style() {
		return leave_hospital_style;
	}

	public void setLeave_hospital_style(String leave_hospital_style) {
		this.leave_hospital_style = leave_hospital_style;
	}

	public String getIn_date() {
		return in_date;
	}

	public void setIn_date(String in_date) {
		this.in_date = in_date;
	}

	public String getSection_office() {
		return section_office;
	}

	public void setSection_office(String section_office) {
		this.section_office = section_office;
	}

	public String getLeave_date() {
		return leave_date;
	}

	public void setLeave_date(String leave_date) {
		this.leave_date = leave_date;
	}

	public String getLeave_state() {
		return leave_state;
	}

	public void setLeave_state(String leave_state) {
		this.leave_state = leave_state;
	}

	public String getLeave_disease_code() {
		return leave_disease_code;
	}

	public void setLeave_disease_code(String leave_disease_code) {
		this.leave_disease_code = leave_disease_code;
	}

	public String getSettlement_number() {
		return settlement_number;
	}

	public void setSettlement_number(String settlement_number) {
		this.settlement_number = settlement_number;
	}

	public String getTotal_payment() {
		return total_payment;
	}

	public void setTotal_payment(String total_payment) {
		this.total_payment = total_payment;
	}

	public String getTotal_self_payment() {
		return total_self_payment;
	}

	public void setTotal_self_payment(String total_self_payment) {
		this.total_self_payment = total_self_payment;
	}

	public String getDb_pay_line() {
		return db_pay_line;
	}

	public void setDb_pay_line(String db_pay_line) {
		this.db_pay_line = db_pay_line;
	}

	public String getFit_into_db_amount() {
		return fit_into_db_amount;
	}

	public void setFit_into_db_amount(String fit_into_db_amount) {
		this.fit_into_db_amount = fit_into_db_amount;
	}

	public String getDeduction_payment() {
		return deduction_payment;
	}

	public void setDeduction_payment(String deduction_payment) {
		this.deduction_payment = deduction_payment;
	}

	public String getYb_compensation() {
		return yb_compensation;
	}

	public void setYb_compensation(String yb_compensation) {
		this.yb_compensation = yb_compensation;
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

	public String getDb_year_hospital_compensation() {
		return db_year_hospital_compensation;
	}

	public void setDb_year_hospital_compensation(
			String db_year_hospital_compensation) {
		this.db_year_hospital_compensation = db_year_hospital_compensation;
	}

	public String getDb_year_clinic_compensation() {
		return db_year_clinic_compensation;
	}

	public void setDb_year_clinic_compensation(
			String db_year_clinic_compensation) {
		this.db_year_clinic_compensation = db_year_clinic_compensation;
	}

	public String getThird_party_compensation() {
		return third_party_compensation;
	}

	public void setThird_party_compensation(String third_party_compensation) {
		this.third_party_compensation = third_party_compensation;
	}

	public String getCompensate_date() {
		return compensate_date;
	}

	public void setCompensate_date(String compensate_date) {
		this.compensate_date = compensate_date;
	}

	public String getNonreal_time_reason() {
		return nonreal_time_reason;
	}

	public void setNonreal_time_reason(String nonreal_time_reason) {
		this.nonreal_time_reason = nonreal_time_reason;
	}

	public String getWhether_ignore() {
		return whether_ignore;
	}

	public void setWhether_ignore(String whether_ignore) {
		this.whether_ignore = whether_ignore;
	}

	public String getCompensation_way() {
		return compensation_way;
	}

	public void setCompensation_way(String compensation_way) {
		this.compensation_way = compensation_way;
	}

	public String getCompensate_information() {
		return compensate_information;
	}

	public void setCompensate_information(String compensate_information) {
		this.compensate_information = compensate_information;
	}

	public String getInsurance_sort() {
		return insurance_sort;
	}

	public void setInsurance_sort(String insurance_sort) {
		this.insurance_sort = insurance_sort;
	}

	public String getDing_hosp_code() {
		return ding_hosp_code;
	}

	public void setDing_hosp_code(String ding_hosp_code) {
		this.ding_hosp_code = ding_hosp_code;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getUppercase_compensation() {
		return uppercase_compensation;
	}

	public void setUppercase_compensation(String uppercase_compensation) {
		this.uppercase_compensation = uppercase_compensation;
	}

	public String getSettlement_download_link() {
		return settlement_download_link;
	}

	public void setSettlement_download_link(String settlement_download_link) {
		this.settlement_download_link = settlement_download_link;
	}

}
