package com.sysnet.dbsb.model.picc.H304;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 参合人员基本信息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "StaffInformation")
public class StaffInformation {
	@XmlElement
	private String PersonCode="";//个人编号
	@XmlElement
	private String PersonIDCard="";//公民身份号码
	@XmlElement
	private String Name="";//姓名
	@XmlElement
	private String Sex="";//性别
	@XmlElement
	private String Nation="";//民族
	@XmlElement
	private String BirthDate="";//出生日期
	@XmlElement
	private String BeginWorkDate="";//参加工作日期
	@XmlElement
	private String MedPersonType="11";//医疗人员类别
	@XmlElement
	private String UnitFamilyCode="";//单位编号/家庭编号
	@XmlElement
	private String UnitFamilyName="";//单位名称/家庭户主名称
	@XmlElement
	private String HuKouProperty="";//户口性质
	@XmlElement
	private String HuKouDistrictCode="";//户口所在地所属行政区代码
	@XmlElement
	private String HuKouDetailAddr="";//户口所在地详细地址
	@XmlElement
	private String PersonStatus="";//个人身份
	@XmlElement
	private String AdministrativeDuties="";//行政职务
	@XmlElement
	private String LeaderFlag="";//干部标志
	@XmlElement
	private String EmployeeWay="";//用工形式
	@XmlElement
	private String MajorTechJob="";//专业技术职务
	@XmlElement
	private String StateCarrerGrade="";//国家职业资格等级（工人技术等级）
	@XmlElement
	private String ArmyPersonGrade="";//军转人员等级
	@XmlElement
	private String NMG_FLAG="";//农民工标志
	@XmlElement
	private String EducationGrade="";//文化程度
	@XmlElement
	private String PoliticalStatus="";//政治面貌
	@XmlElement
	private String MarriageStatus="";//婚姻状况
	@XmlElement
	private String HeathStatus="";//健康状况
	@XmlElement
	private String SpecialWorkType="";//特殊工种类别
	@XmlElement
	private String InnerEmployeeCode="";//内部职工编号
	@XmlElement
	private String ResidentType="3H";//居民类别(备用)
	@XmlElement
	private String NewBorn_Flag="";//新生儿标志
	@XmlElement
	private String NrcID="";//医保保险证号/参合证号
	@XmlElement
	private String NH_SI_Flag="";//农合系统/社保
	@XmlElement
	private String ArmyDegree="";//军残等级
	@XmlElement
	private String ContractName="";//联系人姓名
	@XmlElement
	private String Address="";//地址
	@XmlElement
	private String PostalCode="";//邮政编码
	@XmlElement
	private String MobileTel="";//移动电话
	@XmlElement
	private String DataType="3";//数据性质1 基本医疗数据 3 新农合
	@XmlElement
	private String NewBornName="";//新生儿姓名
	@XmlElement
	private String SubsidyType="";//补助类别
	@XmlElement
	private String Note="";//备注
	@XmlElement
	private String Operator="";//经办人
	@XmlElement
	private String OperateDate="";//经办时间
	@XmlElement
	private String HouseHoldFlag="";//保户主标志
	@XmlElement
	private String HouseHoldRelation="";//与户主关系
	@XmlElement
	private String GoodWorkFlag="";//劳模标志
	@XmlElement
	private String ContractTel="";//联系人电话
	@XmlElement
	private String OrgnizationCode="";//
	@XmlElement
	private String DistrictCode="140310";//统筹区划编码
	@XmlElement
	private String DistrictName="阳泉市医保";//统筹区划名称
	
	/**
	 * 32	险种类型	城镇职工大病医疗救助
39	险种类型	新农合统筹医疗救助
3D	险种类型	城镇居民大病医疗救助
3E	险种类型	城乡居民大病医疗救助
3H	险种类型	新农合大病医疗救助

	 */
	@XmlElement
	private String InsuranceType="32";//险种 
	
	@XmlElement
	private String InsurancePolicy="PWBR201414030000000001";//保单号
	@XmlElement
	private String InsurPo_BeginDate="2014-01-01";//参保开始时间
	@XmlElement
	private String InsurPo_EndDate="2014-12-31";//参保终止时间
	@XmlElement
	public String getPersonCode() {
		return PersonCode;
	}
	public void setPersonCode(String personCode) {
		PersonCode = personCode;
	}
	public String getPersonIDCard() {
		return PersonIDCard;
	}
	public void setPersonIDCard(String personIDCard) {
		PersonIDCard = personIDCard;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getNation() {
		return Nation;
	}
	public void setNation(String nation) {
		Nation = nation;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}
	public String getBeginWorkDate() {
		return BeginWorkDate;
	}
	public void setBeginWorkDate(String beginWorkDate) {
		BeginWorkDate = beginWorkDate;
	}
	public String getMedPersonType() {
		return MedPersonType;
	}
	public void setMedPersonType(String medPersonType) {
		MedPersonType = medPersonType;
	}
	public String getUnitFamilyCode() {
		return UnitFamilyCode;
	}
	public void setUnitFamilyCode(String unitFamilyCode) {
		UnitFamilyCode = unitFamilyCode;
	}
	public String getUnitFamilyName() {
		return UnitFamilyName;
	}
	public void setUnitFamilyName(String unitFamilyName) {
		UnitFamilyName = unitFamilyName;
	}
	public String getHuKouProperty() {
		return HuKouProperty;
	}
	public void setHuKouProperty(String huKouProperty) {
		HuKouProperty = huKouProperty;
	}
	public String getHuKouDistrictCode() {
		return HuKouDistrictCode;
	}
	public void setHuKouDistrictCode(String huKouDistrictCode) {
		HuKouDistrictCode = huKouDistrictCode;
	}
	public String getHuKouDetailAddr() {
		return HuKouDetailAddr;
	}
	public void setHuKouDetailAddr(String huKouDetailAddr) {
		HuKouDetailAddr = huKouDetailAddr;
	}
	public String getPersonStatus() {
		return PersonStatus;
	}
	public void setPersonStatus(String personStatus) {
		PersonStatus = personStatus;
	}
	public String getAdministrativeDuties() {
		return AdministrativeDuties;
	}
	public void setAdministrativeDuties(String administrativeDuties) {
		AdministrativeDuties = administrativeDuties;
	}
	public String getLeaderFlag() {
		return LeaderFlag;
	}
	public void setLeaderFlag(String leaderFlag) {
		LeaderFlag = leaderFlag;
	}
	public String getEmployeeWay() {
		return EmployeeWay;
	}
	public void setEmployeeWay(String employeeWay) {
		EmployeeWay = employeeWay;
	}
	public String getMajorTechJob() {
		return MajorTechJob;
	}
	public void setMajorTechJob(String majorTechJob) {
		MajorTechJob = majorTechJob;
	}
	public String getStateCarrerGrade() {
		return StateCarrerGrade;
	}
	public void setStateCarrerGrade(String stateCarrerGrade) {
		StateCarrerGrade = stateCarrerGrade;
	}
	public String getArmyPersonGrade() {
		return ArmyPersonGrade;
	}
	public void setArmyPersonGrade(String armyPersonGrade) {
		ArmyPersonGrade = armyPersonGrade;
	}
	public String getNMG_FLAG() {
		return NMG_FLAG;
	}
	public void setNMG_FLAG(String nmg_flag) {
		NMG_FLAG = nmg_flag;
	}
	public String getEducationGrade() {
		return EducationGrade;
	}
	public void setEducationGrade(String educationGrade) {
		EducationGrade = educationGrade;
	}
	public String getPoliticalStatus() {
		return PoliticalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		PoliticalStatus = politicalStatus;
	}
	public String getMarriageStatus() {
		return MarriageStatus;
	}
	public void setMarriageStatus(String marriageStatus) {
		MarriageStatus = marriageStatus;
	}
	public String getHeathStatus() {
		return HeathStatus;
	}
	public void setHeathStatus(String heathStatus) {
		HeathStatus = heathStatus;
	}
	public String getSpecialWorkType() {
		return SpecialWorkType;
	}
	public void setSpecialWorkType(String specialWorkType) {
		SpecialWorkType = specialWorkType;
	}
	public String getInnerEmployeeCode() {
		return InnerEmployeeCode;
	}
	public void setInnerEmployeeCode(String innerEmployeeCode) {
		InnerEmployeeCode = innerEmployeeCode;
	}
	public String getResidentType() {
		return ResidentType;
	}
	public void setResidentType(String residentType) {
		ResidentType = residentType;
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
	public String getNH_SI_Flag() {
		return NH_SI_Flag;
	}
	public void setNH_SI_Flag(String flag) {
		NH_SI_Flag = flag;
	}
	public String getArmyDegree() {
		return ArmyDegree;
	}
	public void setArmyDegree(String armyDegree) {
		ArmyDegree = armyDegree;
	}
	public String getContractName() {
		return ContractName;
	}
	public void setContractName(String contractName) {
		ContractName = contractName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getMobileTel() {
		return MobileTel;
	}
	public void setMobileTel(String mobileTel) {
		MobileTel = mobileTel;
	}
	public String getDataType() {
		return DataType;
	}
	public void setDataType(String dataType) {
		DataType = dataType;
	}
	public String getNewBornName() {
		return NewBornName;
	}
	public void setNewBornName(String newBornName) {
		NewBornName = newBornName;
	}
	public String getSubsidyType() {
		return SubsidyType;
	}
	public void setSubsidyType(String subsidyType) {
		SubsidyType = subsidyType;
	}
	public String getNote() {
		return Note;
	}
	public void setNote(String note) {
		Note = note;
	}
	public String getOperator() {
		return Operator;
	}
	public void setOperator(String operator) {
		Operator = operator;
	}
	public String getOperateDate() {
		return OperateDate;
	}
	public void setOperateDate(String operateDate) {
		OperateDate = operateDate;
	}
	public String getHouseHoldFlag() {
		return HouseHoldFlag;
	}
	public void setHouseHoldFlag(String houseHoldFlag) {
		HouseHoldFlag = houseHoldFlag;
	}
	public String getHouseHoldRelation() {
		return HouseHoldRelation;
	}
	public void setHouseHoldRelation(String houseHoldRelation) {
		HouseHoldRelation = houseHoldRelation;
	}
	public String getGoodWorkFlag() {
		return GoodWorkFlag;
	}
	public void setGoodWorkFlag(String goodWorkFlag) {
		GoodWorkFlag = goodWorkFlag;
	}
	public String getContractTel() {
		return ContractTel;
	}
	public void setContractTel(String contractTel) {
		ContractTel = contractTel;
	}
	public String getOrgnizationCode() {
		return OrgnizationCode;
	}
	public void setOrgnizationCode(String orgnizationCode) {
		OrgnizationCode = orgnizationCode;
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

}
