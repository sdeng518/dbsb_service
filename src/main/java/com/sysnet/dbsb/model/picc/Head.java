package com.sysnet.dbsb.model.picc;

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
@XmlRootElement(name = "head")
public class Head {
	@XmlElement
	private String StandardVersionCode="V1.0.5";//标准的版本号信息
	@XmlElement
	private String MaxRecord="1";//最大记录数（MedResult的最大记录数）
	//交易流水号	说明：交易流水号必须是每一次就诊的唯一标识，在整个系统中是唯一的，因此开发商应严格按照建议规则生成交易流水号
	//	规则：统筹区编码+时间(14)+医院编号(8)+流水号(4)，之间用-分隔
	//	例：371400_20120101083030-10011001-0001
	@XmlElement
	private String TransRefGUID="";
	@XmlElement
	private String TransactionCode="H304";//交易码
	@XmlElement
	private String DefaultCurrencyCode="01";//货币代码
	@XmlElement
	private String MessageId="";//消息的标识符，交易序列号  
	@XmlElement
	private String CorrelationId="";//一串数字用于标识消息以防这条消息需要被修改
	@XmlElement
	private String MessageDateTime="";//消息创建的时间2013-6-6 15:36:31
	@XmlElement
	private String SenderCode="140310";//消息发送者的代码	（统筹区编码）
	@XmlElement
	private String SenderName="阳泉市医保";//消息发送者的名称
	@XmlElement
	private String SenderAddress="阳泉市医保";//消息发送者的地址
	@XmlElement
	private String ReceiverCode="140310";//消息接受者的代码	（统筹区编码）
	@XmlElement
	private String ReceiverName="阳泉市医保";//消息接受者的名称
	@XmlElement
	private String ReceiverAddress="阳泉市医保";//消息接受者的地址
	@XmlElement
	private String IntermediaryCode="";//第三方的代码
	@XmlElement
	private String IntermediaryrName="";//第三方的名称
	@XmlElement
	private String IntermediaryAddress="";//第三方的地址
	
	public String getStandardVersionCode() {
		return StandardVersionCode;
	}
	public void setStandardVersionCode(String standardVersionCode) {
		StandardVersionCode = standardVersionCode;
	}
	public String getMaxRecord() {
		return MaxRecord;
	}
	public void setMaxRecord(String maxRecord) {
		MaxRecord = maxRecord;
	}
	public String getTransRefGUID() {
		return TransRefGUID;
	}
	public void setTransRefGUID(String transRefGUID) {
		TransRefGUID = transRefGUID;
	}
	public String getTransactionCode() {
		return TransactionCode;
	}
	public void setTransactionCode(String transactionCode) {
		TransactionCode = transactionCode;
	}
	public String getDefaultCurrencyCode() {
		return DefaultCurrencyCode;
	}
	public void setDefaultCurrencyCode(String defaultCurrencyCode) {
		DefaultCurrencyCode = defaultCurrencyCode;
	}
	public String getMessageId() {
		return MessageId;
	}
	public void setMessageId(String messageId) {
		MessageId = messageId;
	}
	public String getCorrelationId() {
		return CorrelationId;
	}
	public void setCorrelationId(String correlationId) {
		CorrelationId = correlationId;
	}
	public String getMessageDateTime() {
		return MessageDateTime;
	}
	public void setMessageDateTime(String messageDateTime) {
		MessageDateTime = messageDateTime;
	}
	public String getSenderCode() {
		return SenderCode;
	}
	public void setSenderCode(String senderCode) {
		SenderCode = senderCode;
	}
	public String getSenderName() {
		return SenderName;
	}
	public void setSenderName(String senderName) {
		SenderName = senderName;
	}
	public String getSenderAddress() {
		return SenderAddress;
	}
	public void setSenderAddress(String senderAddress) {
		SenderAddress = senderAddress;
	}
	public String getReceiverCode() {
		return ReceiverCode;
	}
	public void setReceiverCode(String receiverCode) {
		ReceiverCode = receiverCode;
	}
	public String getReceiverName() {
		return ReceiverName;
	}
	public void setReceiverName(String receiverName) {
		ReceiverName = receiverName;
	}
	public String getReceiverAddress() {
		return ReceiverAddress;
	}
	public void setReceiverAddress(String receiverAddress) {
		ReceiverAddress = receiverAddress;
	}
	public String getIntermediaryCode() {
		return IntermediaryCode;
	}
	public void setIntermediaryCode(String intermediaryCode) {
		IntermediaryCode = intermediaryCode;
	}
	public String getIntermediaryrName() {
		return IntermediaryrName;
	}
	public void setIntermediaryrName(String intermediaryrName) {
		IntermediaryrName = intermediaryrName;
	}
	public String getIntermediaryAddress() {
		return IntermediaryAddress;
	}
	public void setIntermediaryAddress(String intermediaryAddress) {
		IntermediaryAddress = intermediaryAddress;
	}
	
	
}
