/**
* @Title: RandomUtil.java
* @Package com.sysnet.base.util
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午6:31:18
* @version V1.0
*/
package com.sysnet.common.utils;

import org.apache.commons.lang3.RandomUtils;

/**
* @ClassName: RandomUtil
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午6:31:18
*/
public class RandomUtil extends RandomUtils {
	public static void main(String[] args) {
		System.out.println(randomCode());
	}

	/**
	 * 
	* @Title: randomCode
	* @Description: 生成4位验证码
	* @return int   
	* @throws
	 */
	public static int randomCode() {
		return (int) (Math.random() * 9000 + 1000);
	}

}
