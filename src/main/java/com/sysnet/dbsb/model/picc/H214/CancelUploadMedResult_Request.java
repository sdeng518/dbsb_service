/**
* @Title: CancelUploadMedResult_Request.java
* @Package com.sysnet.dbsb.model.picc.H214
* @Description: 
* @author dengweihua
* @date 2016年2月17日 下午6:26:37
* @version V1.0
*/
package com.sysnet.dbsb.model.picc.H214;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.picc.Head;

/**
 * @ClassName: CancelUploadMedResult_Request
 * @Description:
 * @author dengweihua
 * @date 2016年2月17日 下午6:26:37
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CancelUploadMedResult_Request")
public class CancelUploadMedResult_Request {
	@XmlElement(name = "head")
	private Head head;
	@XmlElement(name = "body")
	private Body_Request_H214 body;

	/**
	 * @return head
	 */
	public Head getHead() {
		return head;
	}

	/**
	 * @param head
	 *            要设置的 head
	 */
	public void setHead(Head head) {
		this.head = head;
	}

	/**
	 * @return body
	 */
	public Body_Request_H214 getBody() {
		return body;
	}

	/**
	 * @param body
	 *            要设置的 body
	 */
	public void setBody(Body_Request_H214 body) {
		this.body = body;
	}

}
