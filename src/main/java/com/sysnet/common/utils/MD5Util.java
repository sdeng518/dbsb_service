package com.sysnet.common.utils;

import java.security.MessageDigest;

public class MD5Util {

	/***
	 * MD5加码 生成32位md5码
	 * 
	 * @param inStr
	 *            源字符串
	 * @return 加密后字符串
	 */
	public static String string2MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];
		byte[] md5Bytes = md5.digest(byteArray);
		StringBuffer hexValue = new StringBuffer();
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}
		String res = hexValue.toString();
		res = res.replace(res.substring(2, 12), res.substring(14, 24)).replace(res.substring(26, 28),
				res.substring(29, 31));
		return res;

	}

	/**
	 * 加密解密算法 执行一次加密，两次解密
	 * 
	 * @param inStr源字符串
	 * @return 结果字符串
	 */
	public static String convertMD5(String inStr) {

		char[] a = inStr.toCharArray();
		for (int i = 0; i < a.length; i++) {
			a[i] = (char) (a[i] ^ 't');
		}
		String s = new String(a);
		return s;
	}

	// 测试主函数
	public static void main(String args[]) {
		String s = new String("ceshi");
		System.out.println("原始：" + s);
		System.out.println("MD5后：" + string2MD5(s));
		System.out.println("加密的：" + convertMD5(s));
		System.out.println("解密的：" + convertMD5(convertMD5(s)));

	}
}
