package com.sysnet.common.utils;

import java.util.UUID;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @author 秦晓东
 * @see String
 * @date 2015年12月11日
 * @description 字符串工具类
 */
public class StringUtil extends StringUtils {
	public static void main(String[] args) {
			System.out.println(getUUIDByRules("dikeqin123568"));
	}

	/**
	 * 生成随机32位字符串
	 * 
	 * @return 字符串
	 */
	public static String getUUID() {
		String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");
		return uuid;
	}

	/**
	 * 自定义规则生成32位编码
	 * 
	 * @param rules
	 *            生成规则
	 * @return string
	 */
	public static String getUUIDByRules(String source) {
		String indexString = "www.ej-info.com";
		String distStr = DigestUtils.md5Hex(source + indexString);
		return distStr.replace("a", "d").replace("cf", "bc").replace("ee", "ff").replace("hx", "x2");
	}
}
