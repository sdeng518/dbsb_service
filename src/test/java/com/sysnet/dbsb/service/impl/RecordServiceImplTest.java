/**
* @Title: InsuredPersonServiceImplTest.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sysnet.dbsb.service.RecordService;

/**
 * @ClassName: InsuredPersonServiceImplTest
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午4:22:59
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class RecordServiceImplTest {
	@Resource
	private RecordService recordServiceImpl;

	@Test
	public void testafterUploadTreat() {

		String responseXml = "<root>\n"
				+ "<head><group_id>20160321154003</group_id><bus_code>100018</bus_code><bus_sub_code>02</bus_sub_code><package_id>1</package_id></head>\n"
				+ "<body><outExportHospitalCompensation>\n" + "    <status>1</status>\n" + "    <msg>Success</msg>\n"
				+ "    <medical_record_no>6104030012260010297_880063938</medical_record_no>\n"
				+ "    <hospital_registration_sn>9ca0d965-88be-481a-84f0-d702b8ed6316</hospital_registration_sn>\n"
				+ "    <name>崔凤英</name>\n" + "    <sex>2</sex>\n" + "    <id_type>I</id_type>\n"
				+ "    <id_number>610403194104201521</id_number>\n"
				+ "    <contract_number>2014610402998965000057</contract_number>\n"
				+ "    <case_number>20166104029022388201</case_number>\n"
				+ "    <mobilephone>13759936234</mobilephone>\n" + "    <accident_reason>1</accident_reason>\n"
				+ "    <leave_hospital_style>1</leave_hospital_style>\n" + "    <in_date>2015-06-08</in_date>\n"
				+ "    <section_office>呼吸消化科</section_office>\n" + "    <leave_date>2015-06-10</leave_date>\n"
				+ "    <leave_state>1</leave_state>\n" + "    <leave_disease_code>YLII08</leave_disease_code>\n"
				+ "    <settlement_number>5226</settlement_number>\n" + "    <total_payment>2799.95</total_payment>\n"
				+ "    <total_self_payment>1408.95</total_self_payment>\n" + "    <db_pay_line>0</db_pay_line>\n"
				+ "    <fit_into_db_amount>0.00</fit_into_db_amount>\n"
				+ "    <deduction_payment>1408.95</deduction_payment>\n"
				+ "    <yb_compensation>1391.0</yb_compensation>\n"
				+ "    <db_compensation>673.0800</db_compensation>\n"
				+ "    <db_year_compensation>5324.82</db_year_compensation>\n"
				+ "    <db_year_hospital_compensation>5324.82</db_year_hospital_compensation>\n"
				+ "    <db_year_clinic_compensation>0.00</db_year_clinic_compensation>\n"
				+ "    <third_party_compensation>0.0</third_party_compensation>\n"
				+ "    <compensate_date>2016-03-21</compensate_date>\n"
				+ "    <nonreal_time_reason>String</nonreal_time_reason>\n" + "    <whether_ignore>0</whether_ignore>\n"
				+ "    <compensation_way>1</compensation_way>\n"
				+ "    <compensate_information>总赔付金额:673.0800</compensate_information>\n"
				+ "    <insurance_sort>城乡居民大病保险A</insurance_sort>\n"
				+ "    <ding_hosp_code>6104030000000000000000017</ding_hosp_code>\n" + "    <employee>大病接口</employee>\n"
				+ "    <uppercase_compensation>陆佰柒拾叁元零捌分</uppercase_compensation>\n"
				+ "    <settlement_download_link>String</settlement_download_link>\n" + "    <arg1>null</arg1>\n"
				+ "    <arg2>null</arg2>\n" + "    <arg3>null</arg3>\n" + "    <arg4>null</arg4>\n"
				+ "    <arg5>null</arg5>\n" + "    <arg6>null</arg6>\n" + "    <arg7>null</arg7>\n"
				+ "    <arg8>null</arg8>\n" + "    <arg9>null</arg9>\n" + "    <arg10>null</arg10>\n"
				+ "</outExportHospitalCompensation></body>\n" + "</root>";
		
		String hospital_registration_sn = "d8ae41a3-5e6f-4c6b-a214-f676cf861af1";
		String medical_record_no = "6104030012260010297_880063938";
		recordServiceImpl.afterUploadTreat(medical_record_no, hospital_registration_sn, responseXml);
	}

}
