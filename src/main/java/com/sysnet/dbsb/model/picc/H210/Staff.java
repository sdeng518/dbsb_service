package com.sysnet.dbsb.model.picc.H210;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 参合人员信息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StaffInformation")
public class Staff {
	@XmlElement
	private String ID = "";// 身份证号
	@XmlElement
	private String Name = "";// 姓名(本次就医人的姓名
	@XmlElement
	private String Nation = "";// 民族(就医人的民族)，参见代码说明
	@XmlElement
	private String Gender = "";// 性别(就医人的性别,不是户主的)，参见代码说明
	@XmlElement
	private String Birthday = "";// 出生日期(就医人的出生日期)，格式2013-01-01 10:30:30
	@XmlElement
	private String HouseholdAttribute = "";// 备用
	@XmlElement
	private String HHouseholdID = "";// 备用
	@XmlElement
	private String Town_or_Village_Num = "";// 备用
	@XmlElement
	private String HHouseholdName = "";// 户主姓名（新农合）/单位名称
	@XmlElement
	private String Birthplace = "";// 出生地（户口所在地详细地址）
	@XmlElement
	private String MaritalStatus = "";// 婚姻状况，参见代码说明
	@XmlElement
	private String HealthState = "";// 健康状况，参见代码说明
	@XmlElement
	private String NewBorn_Flag = "";// 新生儿标志，参见代码说明
	@XmlElement
	private String NrcID = "";// 参合证号
	@XmlElement
	private String PersonalID = "";// 身份唯一标识（能够确保农合/社保系统中的唯一性） 如果新农合没有的话，请传空
	@XmlElement
	private String DistrictCode = "140310";// 统筹区划编码
	@XmlElement
	private String DistrictName = "阳泉市医保";// 统筹区划名称
	@XmlElement
	private String InsuranceType = "32";// 险种，参见代码说明
	@XmlElement
	private String MedPersonType = "11";// 医疗人员类别，参见代码说明
	@XmlElement
	private String InsurancePolicy = "PWBR201414030000000001";// 保单号
	@XmlElement
	private String InsurPo_BeginDate = "2014-01-01 10:30:30";// 参保开始时间， 格式2013-01-01 10:30:30
	@XmlElement
	private String InsurPo_EndDate = "2014-12-31 10:30:30";// 参保终止时间， 格式2013-01-01 10:30:30
	@XmlElement
	private String Year = "2014";// 备用
	@XmlElement
	private String FamilyCode = "";// 家庭编码（新农合）/单位
	@XmlElement
	private String HouseholdCode = "";// 备用
	@XmlElement
	private String GroupNum = "";// 备用
	@XmlElement
	private String FamilyAmount = "";// 备用
	@XmlElement
	private String AgriculturalAmount = "";// 备用
	@XmlElement
	private String ZipCode = "";// 邮政编码
	@XmlElement
	private String HomeAddress = "";// 备用
	@XmlElement
	private String Telephone = "";// 联系电话
	@XmlElement
	private String FamilyRelations = "";//备用
	@XmlElement
	private String WorkUnit = "";//备用
	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getNation() {
		return Nation;
	}
	public void setNation(String nation) {
		Nation = nation;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getHouseholdAttribute() {
		return HouseholdAttribute;
	}
	public void setHouseholdAttribute(String householdAttribute) {
		HouseholdAttribute = householdAttribute;
	}
	public String getHHouseholdID() {
		return HHouseholdID;
	}
	public void setHHouseholdID(String householdID) {
		HHouseholdID = householdID;
	}
	public String getTown_or_Village_Num() {
		return Town_or_Village_Num;
	}
	public void setTown_or_Village_Num(String town_or_Village_Num) {
		Town_or_Village_Num = town_or_Village_Num;
	}
	public String getHHouseholdName() {
		return HHouseholdName;
	}
	public void setHHouseholdName(String householdName) {
		HHouseholdName = householdName;
	}
	public String getBirthplace() {
		return Birthplace;
	}
	public void setBirthplace(String birthplace) {
		Birthplace = birthplace;
	}
	public String getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public String getHealthState() {
		return HealthState;
	}
	public void setHealthState(String healthState) {
		HealthState = healthState;
	}
	public String getNewBorn_Flag() {
		return NewBorn_Flag;
	}
	public void setNewBorn_Flag(String newBorn_Flag) {
		NewBorn_Flag = newBorn_Flag;
	}
	public String getNrcID() {
		return NrcID;
	}
	public void setNrcID(String nrcID) {
		NrcID = nrcID;
	}
	public String getPersonalID() {
		return PersonalID;
	}
	public void setPersonalID(String personalID) {
		PersonalID = personalID;
	}
	public String getDistrictCode() {
		return DistrictCode;
	}
	public void setDistrictCode(String districtCode) {
		DistrictCode = districtCode;
	}
	public String getDistrictName() {
		return DistrictName;
	}
	public void setDistrictName(String districtName) {
		DistrictName = districtName;
	}
	public String getInsuranceType() {
		return InsuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		InsuranceType = insuranceType;
	}
	public String getMedPersonType() {
		return MedPersonType;
	}
	public void setMedPersonType(String medPersonType) {
		MedPersonType = medPersonType;
	}
	public String getInsurancePolicy() {
		return InsurancePolicy;
	}
	public void setInsurancePolicy(String insurancePolicy) {
		InsurancePolicy = insurancePolicy;
	}
	public String getInsurPo_BeginDate() {
		return InsurPo_BeginDate;
	}
	public void setInsurPo_BeginDate(String insurPo_BeginDate) {
		InsurPo_BeginDate = insurPo_BeginDate;
	}
	public String getInsurPo_EndDate() {
		return InsurPo_EndDate;
	}
	public void setInsurPo_EndDate(String insurPo_EndDate) {
		InsurPo_EndDate = insurPo_EndDate;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getFamilyCode() {
		return FamilyCode;
	}
	public void setFamilyCode(String familyCode) {
		FamilyCode = familyCode;
	}
	public String getHouseholdCode() {
		return HouseholdCode;
	}
	public void setHouseholdCode(String householdCode) {
		HouseholdCode = householdCode;
	}
	public String getGroupNum() {
		return GroupNum;
	}
	public void setGroupNum(String groupNum) {
		GroupNum = groupNum;
	}
	public String getFamilyAmount() {
		return FamilyAmount;
	}
	public void setFamilyAmount(String familyAmount) {
		FamilyAmount = familyAmount;
	}
	public String getAgriculturalAmount() {
		return AgriculturalAmount;
	}
	public void setAgriculturalAmount(String agriculturalAmount) {
		AgriculturalAmount = agriculturalAmount;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public String getHomeAddress() {
		return HomeAddress;
	}
	public void setHomeAddress(String homeAddress) {
		HomeAddress = homeAddress;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getFamilyRelations() {
		return FamilyRelations;
	}
	public void setFamilyRelations(String familyRelations) {
		FamilyRelations = familyRelations;
	}
	public String getWorkUnit() {
		return WorkUnit;
	}
	public void setWorkUnit(String workUnit) {
		WorkUnit = workUnit;
	}

	
}
