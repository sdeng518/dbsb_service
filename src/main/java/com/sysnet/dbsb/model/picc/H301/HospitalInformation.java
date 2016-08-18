package com.sysnet.dbsb.model.picc.H301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 定点医疗机构信息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "HospitalInformation")
public class HospitalInformation {
	@XmlElement
	private String HospitalCode="";//定点医疗机构编码
	@XmlElement
	private String PiccHosOrgCode="";//PICC 医疗机构编码
	@XmlElement
	private String HospitalName="";//医疗服务机构名称
	@XmlElement
	private String HospitalType="";//医疗服务机构类型
	@XmlElement
	private String OrganizationCode="";//组织机构代码
	@XmlElement
	private String HospitalGrade="";//医疗机构等级，参见二级代
		//码
	@XmlElement
	private String HospitalFlag="";//医疗机构类别
	@XmlElement
	private String LegalPersonName="";//法定代表人姓名
	@XmlElement
	private String LegalPersonID="";//法定代表人公民身份号码
	@XmlElement
	private String LegalPersonTel="";//法定代表人电话
	@XmlElement
	private String HighHospitalCode="";//上级主管医疗机构编号
	@XmlElement
	private String ValidFlag="1";//有效标志
	@XmlElement
	private String PracticeLicense="";//执业许可证号
	@XmlElement
	private String HospitalSign="";//医疗定点标志
	@XmlElement
	private String ApprovalDate="";//批准日期
	@XmlElement
	private String EndDate="";//有效截至日期
	@XmlElement
	private String AffiliateDistrictCode="";//所属地行政区代码
	@XmlElement
	private String ExpectPayDate="";//医院期望支付日期
	@XmlElement
	private String DistrictCode="";//统筹区号
	@XmlElement
	private String ServiceRange="";//医疗服务范围
	@XmlElement
	private String ServiceContext="";//医疗服务内容
	@XmlElement
	private String ServicePeople="";//医疗服务人群
	@XmlElement
	private String ContractTel="";//联系电话
	@XmlElement
	private String ContractAddr="";//地址
	@XmlElement
	private String PostalCode="";//邮政编码
	@XmlElement
	private String AffirmBankAccoutName="";//确认银行户名
	@XmlElement
	private String OpenBankType="";//开户银行类别
	@XmlElement
	private String OpenBankName="";//开户银行名称
	@XmlElement
	private String UnionPayNO="";//联行号(支行代码)
	@XmlElement
	private String BankName="";//银行户名
	@XmlElement
	private String BankAccout="";//银行帐号
	@XmlElement
	private String AffirmBankAccout="";//确认银行帐号
	@XmlElement
	private String BankArea="";//银行区域
	@XmlElement
	private String BankAreaName="";//银行区域名称
	@XmlElement
	private String OpenBankBranchName="";//开户银行支行名称
	@XmlElement
	private String EditorPayCode="";//编辑人理赔代码
	@XmlElement
	private String Note="";//备注
	@XmlElement
	private String ReserveField1="";//预留字段 1
	@XmlElement
	private String ReserveField2="";//预留字段 2
	@XmlElement
	private String ReserveField3="";//预留字段 3
	public String getHospitalCode() {
		return HospitalCode;
	}
	public void setHospitalCode(String hospitalCode) {
		HospitalCode = hospitalCode;
	}
	public String getPiccHosOrgCode() {
		return PiccHosOrgCode;
	}
	public void setPiccHosOrgCode(String piccHosOrgCode) {
		PiccHosOrgCode = piccHosOrgCode;
	}
	public String getHospitalName() {
		return HospitalName;
	}
	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}
	public String getHospitalType() {
		return HospitalType;
	}
	public void setHospitalType(String hospitalType) {
		HospitalType = hospitalType;
	}
	public String getOrganizationCode() {
		return OrganizationCode;
	}
	public void setOrganizationCode(String organizationCode) {
		OrganizationCode = organizationCode;
	}
	public String getHospitalGrade() {
		return HospitalGrade;
	}
	public void setHospitalGrade(String hospitalGrade) {
		HospitalGrade = hospitalGrade;
	}
	public String getHospitalFlag() {
		return HospitalFlag;
	}
	public void setHospitalFlag(String hospitalFlag) {
		HospitalFlag = hospitalFlag;
	}
	public String getLegalPersonName() {
		return LegalPersonName;
	}
	public void setLegalPersonName(String legalPersonName) {
		LegalPersonName = legalPersonName;
	}
	public String getLegalPersonID() {
		return LegalPersonID;
	}
	public void setLegalPersonID(String legalPersonID) {
		LegalPersonID = legalPersonID;
	}
	public String getLegalPersonTel() {
		return LegalPersonTel;
	}
	public void setLegalPersonTel(String legalPersonTel) {
		LegalPersonTel = legalPersonTel;
	}
	public String getHighHospitalCode() {
		return HighHospitalCode;
	}
	public void setHighHospitalCode(String highHospitalCode) {
		HighHospitalCode = highHospitalCode;
	}
	public String getValidFlag() {
		return ValidFlag;
	}
	public void setValidFlag(String validFlag) {
		ValidFlag = validFlag;
	}
	public String getPracticeLicense() {
		return PracticeLicense;
	}
	public void setPracticeLicense(String practiceLicense) {
		PracticeLicense = practiceLicense;
	}
	public String getHospitalSign() {
		return HospitalSign;
	}
	public void setHospitalSign(String hospitalSign) {
		HospitalSign = hospitalSign;
	}
	public String getApprovalDate() {
		return ApprovalDate;
	}
	public void setApprovalDate(String approvalDate) {
		ApprovalDate = approvalDate;
	}
	public String getEndDate() {
		return EndDate;
	}
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	public String getAffiliateDistrictCode() {
		return AffiliateDistrictCode;
	}
	public void setAffiliateDistrictCode(String affiliateDistrictCode) {
		AffiliateDistrictCode = affiliateDistrictCode;
	}
	public String getExpectPayDate() {
		return ExpectPayDate;
	}
	public void setExpectPayDate(String expectPayDate) {
		ExpectPayDate = expectPayDate;
	}
	public String getDistrictCode() {
		return DistrictCode;
	}
	public void setDistrictCode(String districtCode) {
		DistrictCode = districtCode;
	}
	public String getServiceRange() {
		return ServiceRange;
	}
	public void setServiceRange(String serviceRange) {
		ServiceRange = serviceRange;
	}
	public String getServiceContext() {
		return ServiceContext;
	}
	public void setServiceContext(String serviceContext) {
		ServiceContext = serviceContext;
	}
	public String getServicePeople() {
		return ServicePeople;
	}
	public void setServicePeople(String servicePeople) {
		ServicePeople = servicePeople;
	}
	public String getContractTel() {
		return ContractTel;
	}
	public void setContractTel(String contractTel) {
		ContractTel = contractTel;
	}
	public String getContractAddr() {
		return ContractAddr;
	}
	public void setContractAddr(String contractAddr) {
		ContractAddr = contractAddr;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getAffirmBankAccoutName() {
		return AffirmBankAccoutName;
	}
	public void setAffirmBankAccoutName(String affirmBankAccoutName) {
		AffirmBankAccoutName = affirmBankAccoutName;
	}
	public String getOpenBankType() {
		return OpenBankType;
	}
	public void setOpenBankType(String openBankType) {
		OpenBankType = openBankType;
	}
	public String getOpenBankName() {
		return OpenBankName;
	}
	public void setOpenBankName(String openBankName) {
		OpenBankName = openBankName;
	}
	public String getUnionPayNO() {
		return UnionPayNO;
	}
	public void setUnionPayNO(String unionPayNO) {
		UnionPayNO = unionPayNO;
	}
	public String getBankName() {
		return BankName;
	}
	public void setBankName(String bankName) {
		BankName = bankName;
	}
	public String getBankAccout() {
		return BankAccout;
	}
	public void setBankAccout(String bankAccout) {
		BankAccout = bankAccout;
	}
	public String getAffirmBankAccout() {
		return AffirmBankAccout;
	}
	public void setAffirmBankAccout(String affirmBankAccout) {
		AffirmBankAccout = affirmBankAccout;
	}
	public String getBankArea() {
		return BankArea;
	}
	public void setBankArea(String bankArea) {
		BankArea = bankArea;
	}
	public String getBankAreaName() {
		return BankAreaName;
	}
	public void setBankAreaName(String bankAreaName) {
		BankAreaName = bankAreaName;
	}
	public String getOpenBankBranchName() {
		return OpenBankBranchName;
	}
	public void setOpenBankBranchName(String openBankBranchName) {
		OpenBankBranchName = openBankBranchName;
	}
	public String getEditorPayCode() {
		return EditorPayCode;
	}
	public void setEditorPayCode(String editorPayCode) {
		EditorPayCode = editorPayCode;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public String getReserveField1() {
		return ReserveField1;
	}
	public void setReserveField1(String reserveField1) {
		ReserveField1 = reserveField1;
	}
	public String getReserveField2() {
		return ReserveField2;
	}
	public void setReserveField2(String reserveField2) {
		ReserveField2 = reserveField2;
	}
	public String getReserveField3() {
		return ReserveField3;
	}
	public void setReserveField3(String reserveField3) {
		ReserveField3 = reserveField3;
	}
	
	
}
