package com.sysnet.dbsb.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *  领款人信息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "PayeeInformation")
public class PayeeInformation {
	@XmlElement
	private String CustomerType="03";//客户类型
	@XmlElement
	private String CustomerNature="2";//客户性质
	@XmlElement
	private String BankType="RCU";//开户银行类别
	@XmlElement
	private String BankRegion="1403";//银行区域
	@XmlElement
	private String BankBranchName="开户银行支行";//名称
	@XmlElement
	private String LineNumber="402566171244";//联行号(支行代码)
	@XmlElement
	private String BankAccountName="银行户名";//银行户名
	@XmlElement
	private String BankAccountNameAgain="银行户名";//确认银行户名
	@XmlElement
	private String BankAccount="银行帐号";//银行帐号
	@XmlElement
	private String BankAccountAgain="银行帐号";//确认银行帐号
	@XmlElement
	private String IDType="";//证件类型
	@XmlElement
	private String IDNumber="";//证件号码
	@XmlElement
	private String Telephone="";//联系电话
	@XmlElement
	private String PersonalID="";//社保个人编码
	@XmlElement
	private String FeeField1="";//账号类型1.银行卡2.银行存折
	@XmlElement
	private String FeeField2="";//备用2
	
	@XmlTransient
	private String personalid;
	/**
	* @return personalid
	*/
	public String getPersonalid() {
		return personalid;
	}
	/**
	* @param personalid 要设置的 personalid
	*/
	public void setPersonalid(String personalid) {
		this.personalid = personalid;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String customerType) {
		CustomerType = customerType;
	}
	public String getCustomerNature() {
		return CustomerNature;
	}
	public void setCustomerNature(String customerNature) {
		CustomerNature = customerNature;
	}
	public String getBankType() {
		return BankType;
	}
	public void setBankType(String bankType) {
		BankType = bankType;
	}
	public String getBankRegion() {
		return BankRegion;
	}
	public void setBankRegion(String bankRegion) {
		BankRegion = bankRegion;
	}
	public String getBankBranchName() {
		return BankBranchName;
	}
	public void setBankBranchName(String bankBranchName) {
		BankBranchName = bankBranchName;
	}
	public String getLineNumber() {
		return LineNumber;
	}
	public void setLineNumber(String lineNumber) {
		LineNumber = lineNumber;
	}
	public String getBankAccountName() {
		return BankAccountName;
	}
	public void setBankAccountName(String bankAccountName) {
		BankAccountName = bankAccountName;
	}
	public String getBankAccountNameAgain() {
		return BankAccountNameAgain;
	}
	public void setBankAccountNameAgain(String bankAccountNameAgain) {
		BankAccountNameAgain = bankAccountNameAgain;
	}
	public String getBankAccount() {
		return BankAccount;
	}
	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}
	public String getBankAccountAgain() {
		return BankAccountAgain;
	}
	public void setBankAccountAgain(String bankAccountAgain) {
		BankAccountAgain = bankAccountAgain;
	}
	public String getIDType() {
		return IDType;
	}
	public void setIDType(String type) {
		IDType = type;
	}
	public String getIDNumber() {
		return IDNumber;
	}
	public void setIDNumber(String number) {
		IDNumber = number;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		Telephone = telephone;
	}
	public String getPersonalID() {
		return PersonalID;
	}
	public void setPersonalID(String personalID) {
		PersonalID = personalID;
	}
	public String getFeeField1() {
		return FeeField1;
	}
	public void setFeeField1(String feeField1) {
		FeeField1 = feeField1;
	}
	public String getFeeField2() {
		return FeeField2;
	}
	public void setFeeField2(String feeField2) {
		FeeField2 = feeField2;
	}
	
	
	
}
