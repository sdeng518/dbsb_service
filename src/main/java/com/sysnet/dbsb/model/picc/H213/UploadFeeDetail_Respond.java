package com.sysnet.dbsb.model.picc.H213;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.BodyRespond;
import com.sysnet.dbsb.model.picc.Head;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 费用明细延后上传交易响应消息
 * @author dengweihua
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "UploadFeeDetail_Respond")
public class UploadFeeDetail_Respond {
	@XmlElement(name="head")
	private Head head;
	@XmlElement(name="body")
	private BodyRespond body;
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public BodyRespond getBody() {
		return body;
	}
	public void setBody(BodyRespond body) {
		this.body = body;
	}
	
	public static void main(String[] args) {
		String xml = 
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?><UploadFeeDetail_Respond><head>\n" +
						"        <StandardVersionCode>V1.0.5</StandardVersionCode>\n" + 
						"        <MaxRecord>1</MaxRecord>\n" + 
						"        <TransRefGUID>140310-20160322172500-00000000-700458</TransRefGUID>\n" + 
						"        <TransactionCode>H213</TransactionCode>\n" + 
						"        <DefaultCurrencyCode>01</DefaultCurrencyCode>\n" + 
						"        <MessageId>20160322172500</MessageId>\n" + 
						"        <CorrelationId>20160322172500</CorrelationId>\n" + 
						"        <MessageDateTime>2016-03-22T17:25:00</MessageDateTime>\n" + 
						"        <SenderCode>140310</SenderCode>\n" + 
						"        <SenderName>阳泉市医保</SenderName>\n" + 
						"        <SenderAddress>阳泉市医保</SenderAddress>\n" + 
						"        <ReceiverCode>140310</ReceiverCode>\n" + 
						"        <ReceiverName>阳泉市医保</ReceiverName>\n" + 
						"        <ReceiverAddress>阳泉市医保</ReceiverAddress>\n" + 
						"        <IntermediaryCode></IntermediaryCode>\n" + 
						"        <IntermediaryrName></IntermediaryrName>\n" + 
						"        <IntermediaryAddress></IntermediaryAddress>\n" + 
						"    </head><body><TotalNoCalculateDetail>1</TotalNoCalculateDetail><CalculateDetailAmount>0.0</CalculateDetailAmount><SuccessFlag>1</SuccessFlag><Description>successful!但重复上传明细如下：|140310,40614116-1,7415234,7415234,1,12000000579909\n" + 
						"1|</Description><ReserveField1></ReserveField1><ReserveField2></ReserveField2><ReserveField3></ReserveField3></body></UploadFeeDetail_Respond>";
			
			System.out.println(JAXBUtil.converyToJavaBean(xml, UploadFeeDetail_Respond.class).getBody().getDescription());
			
	}
}
