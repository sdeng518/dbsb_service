/**
 * @Title: UploadServiceTest.java
 * @Package com.sysnet.dbsb.service
 * @Description: 
 * @author dengweihua
 * @date 2016年1月21日 下午7:13:01
 * @version V1.0
 */
package com.sysnet.dbsb.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: UploadServiceTest
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午7:13:01R
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml",
		"classpath:conf/spring-mybatis.xml" })
public class UtilTest {

	/**
	 * @Title: setUp @Description: @throws java.lang.Exception void @throws
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testuploadPerson() {
		String xml = "<root>\n"
				+ "    <head>\n"
				+ "        <standard_version_code>V2.4.2</standard_version_code>\n"
				+ "        <group_id>20160412175705</group_id>\n"
				+ "        <bus_code>100007</bus_code>\n"
				+ "        <bus_sub_code>00</bus_sub_code>\n"
				+ "        <bus_type>0</bus_type>\n"
				+ "        <total_count>1</total_count>\n"
				+ "        <total_packge>1</total_packge>\n"
				+ "        <package_id>1</package_id>\n"
				+ "        <data_count>1</data_count>\n"
				+ "        <area_code>610429</area_code>\n"
				+ "        <outside_system_code>SXXNH_SYSNET</outside_system_code>\n"
				+ "        <outside_system_type>2</outside_system_type>\n"
				+ "        <ding_hosp_code>43588555761042911A1001</ding_hosp_code>\n"
				+ "        <option_person_code>admin</option_person_code>\n"
				+ "        <insured_year>2016</insured_year>\n"
				+ "    </head>\n"
				+ "    <body>\n"
				+ "        <hospitalRegistrationInfo>\n"
				+ "            <medical_record_no>6104291082020010113_10304179</medical_record_no>\n"
				+ "            <hospital_registration_sn>78f0dffc-4223-4a97-9d9f-e021c18a092a</hospital_registration_sn>\n"
				+ "            <name>韩最最</name>\n"
				+ "            <sex>2</sex>\n"
				+ "            <id_type>I</id_type>\n"
				+ "            <id_number>610429195403150021</id_number>\n"
				+ "            <in_date>2016-03-18</in_date>\n"
				+ "            <baby_name></baby_name>\n"
				+ "            <phone>13292408951</phone>\n"
				+ "            <mobilephone>13292408951</mobilephone>\n"
				+ "            <accident_reason>1</accident_reason>\n"
				+ "            <in_hospital_style>2</in_hospital_style>\n"
				+ "            <basic_medical_type>2</basic_medical_type>\n"
				+ "            <bed_number></bed_number>\n"
				+ "            <section_office>99</section_office>\n"
				+ "            <initial_diagnosis>I61.902</initial_diagnosis>\n"
				+ "            <complication></complication>\n"
				+ "            <main_diagnosis_code>I61.902</main_diagnosis_code>\n"
				+ "            <other_diagnosis_code></other_diagnosis_code>\n"
				+ "            <master_doctor></master_doctor>\n"
				+ "            <memo></memo>\n" + "            <arg1></arg1>\n"
				+ "            <arg2></arg2>\n" + "            <arg3></arg3>\n"
				+ "            <arg4></arg4>\n" + "            <arg5></arg5>\n"
				+ "            <arg6></arg6>\n" + "            <arg7></arg7>\n"
				+ "            <arg8></arg8>\n" + "            <arg9></arg9>\n"
				+ "            <arg10></arg10>\n"
				+ "        </hospitalRegistrationInfo>\n" + "    </body>\n"
				+ "</root>\n" + "</root>";

	}

}
