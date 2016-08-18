/**
* @Title: ApplicationMap.java
* @Package com.sysnet.base.common
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午4:42:13
* @version V1.0
*/
package com.sysnet.common.base.sys;

import java.util.HashMap;

/**
* @ClassName: ApplicationMap
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午4:42:13
*/
public class ApplicationMap extends HashMap<String, Object> {

	/**
	* @Fields serialVersionUID : 
	*/
	private static final long serialVersionUID = 1L;
	private static ApplicationMap appMap;

	private ApplicationMap() {
	}

	/**
	 * 
	* @Title: getInstance
	* @Description: 单例的全局Map,用于存放验证数据.例如短信验证码、用户token等等
	* @return ApplicationMap   
	* @throws
	 */
	public static synchronized ApplicationMap getInstance() {
		if (appMap == null) {
			appMap = new ApplicationMap();
		}
		return appMap;
	}
}
