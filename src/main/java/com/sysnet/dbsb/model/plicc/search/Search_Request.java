package com.sysnet.dbsb.model.plicc.search;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.util.BusinessUtil;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 住院补偿回退请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Search_Request {
	@XmlElement(name = "head")
	private com.sysnet.dbsb.model.plicc.Head head;
	@XmlElement(name = "body")
	private SearchBody body;

	public com.sysnet.dbsb.model.plicc.Head getHead() {
		return head;
	}

	public void setHead(com.sysnet.dbsb.model.plicc.Head head) {
		head.setGroup_id(BusinessUtil.getCurrentTimeStamp());
		head.setBus_code("100015");
		head.setBus_sub_code("00");
		this.head = head;
	}

	public SearchBody getBody() {
		return body;
	}

	public void setBody(SearchBody body) {
		this.body = body;
	}

	public static void main(String[] args) {
		SearchBody body = new SearchBody();
		Search_Request request = new Search_Request();
		com.sysnet.dbsb.model.plicc.Head head = new com.sysnet.dbsb.model.plicc.Head();
		CompensationSearchInfo compensationSearchInfo = new CompensationSearchInfo();
		body.setCompensationSearchInfo(compensationSearchInfo );
		request.setHead(head);
		request.setBody(body);

		System.out.println(JAXBUtil.convertToXml(request));
	}
}
