package com.sysnet.dbsb.util;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;

public class BusinessUtil {

	public static String convertCategory(String categString) {
		String newString = "";

		if (StringUtils.containsIgnoreCase("ABC", categString)) {
			newString = "1";// 药品
		} else if (StringUtils.containsIgnoreCase("DEGHKLNO", categString)) {
			newString = "2";// 诊疗
		} else if (StringUtils.containsIgnoreCase("FIM", categString)) {
			newString = "3";// 服务
		} else {
			newString = "9";// 其它
		}

		return newString;
	}

	public static String convertType(String type) {
		String newString = "";

		if (StringUtils.equalsIgnoreCase(type, "101")) {
			newString = "1";// 甲类
		} else if (StringUtils.equalsIgnoreCase(type, "201")
				|| StringUtils.equalsIgnoreCase(type, "202")) {
			newString = "2";// 乙类
		} else if (StringUtils.equalsIgnoreCase(type, "901")) {
			newString = "3";// 丙类
		} else {
			newString = "9";// 其它
		}

		return newString;
	}

	public static String BuildMedical_record_no(String healthCard_no,
			BigDecimal personNo) {
		return new StringBuilder().append(healthCard_no).append("_").append(
				personNo).toString();
	}

	/**
	 * 交易流水号 说明：交易流水号必须是每一次请求的唯一标识，在整个系统中是唯一的， 因此开发商应严格按照建议规则生成交易流水号
	 * 规则：统筹区编码+时间(14)+医院编号(8)+流水号(4)，之间用-分隔
	 * 例：371400-20120101083030-10011001-0001 yyyyMMddHHmmss
	 * 
	 * @param areaCode
	 * @param hospitalCode
	 * @param hospitalSeq
	 * @return
	 */
	public static String getTransRefGUID(String areaCode, String hospitalCode,
			String hospitalSeq) {
		if (StringUtils.isEmpty(areaCode)) {
			areaCode = "140310";
		}
		if (StringUtils.isEmpty(hospitalCode)) {
			hospitalCode = "00000000";
		}
		if (StringUtils.isEmpty(hospitalSeq)) {
			String ts = String.valueOf(Calendar.getInstance().getTimeInMillis());
			hospitalSeq = ts.substring(ts.length() - 6);
		}
		
		return new StringBuffer(areaCode).append("-").append(
				DateFormatUtils.format(
						Calendar.getInstance().getTimeInMillis(),
						"yyyyMMddHHmmss")).append("-").append(hospitalCode)
				.append("-").append(hospitalSeq).toString();
	}
	
	/**
	 * 获取消息id
	* @Title: getMessageID
	* @Description: 
	* @return String
	* @throws
	 */
	public static String getMessageID(){
		return DateFormatUtils.format(
				Calendar.getInstance().getTimeInMillis(),
				"yyyyMMddHHmmss");
	}

	/**
	 * 获取唯一编码
	 * 
	 * @return
	 */
	public static String getRandomUUID() {
		String uuid = UUID.randomUUID().toString();
		uuid = uuid.replace("-", "");

		return uuid;
	}
	
	public static String getCurrentTimeStamp() {
		return DateFormatUtils.format(Calendar.getInstance().getTime(), "yyyyMMddHHmmss");
	}
	
	public static String getCurrentTimeISO() {
		return DateFormatUtils.ISO_DATETIME_FORMAT.format(Calendar.getInstance());
	}
		
	public static void main(String[] args) {
		System.out.println(BusinessUtil.getCurrentTimeStamp());
	}

	/**
	* @Title: toFullDateTime
	* @Description: 
	* @param inpatientDate
	* @return String
	* @throws
	*/
	public static String toFullDateTime(String shortDate) {
		if (shortDate.length() < 12) {
			shortDate += " 00:00:00";
		}
		return shortDate;
	}
}
