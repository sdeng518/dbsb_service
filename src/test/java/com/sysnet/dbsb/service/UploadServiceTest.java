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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: UploadServiceTest
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午7:13:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class UploadServiceTest {
	@Autowired
	@Qualifier("uploadServiceImpl4ASIA")
//	@Qualifier("uploadServiceImpl4PLICC")
	UploadService uploadServiceImpl;

	// uploadServiceImpl4PLICC
											// uploadServiceImpl4ASIA
											// uploadServiceImpl
	
	private static String medical_record_no = "6104021022150040011_860188791";
	// 6104291032080020098_10146873 6104291082020010113_10304179
	private static String hospital_registration_sn ="308fb798-3562-4da7-a203-908ca5357cc3";
	
			//"f1e0a1b0-db8c-479e-aa4f-744c9e860cef";
	// "6682e7af-abab-4d20-b966-9e6b4eaed8fd";

	/**
	 * @Title: setUp @Description: @throws java.lang.Exception void @throws
	 */
	@Before
	public void setUp() throws Exception {
	}

//	 @Test
	public void testuploadPerson() {
		uploadServiceImpl.uploadPerson(medical_record_no);
	}

//	 @Test
	public void testuploadHospital() {
		String id = "03024101-2";
		uploadServiceImpl.uploadHospital(id);
	}

//	 @Test
	public void testuploadTreatment() {
		uploadServiceImpl.uploadTreatment(medical_record_no, hospital_registration_sn);
	}

	
//	 @Test
	public void testuploadCancelTreatment() {
		 	
		 
		uploadServiceImpl.uploadCancelTreatment(medical_record_no, hospital_registration_sn);
	}

//	 @Test
	public void testuploadTreatDetail() {
		uploadServiceImpl.uploadTreatDetail(medical_record_no, hospital_registration_sn);
	}

//	 @Test
	public void testsearchTreatment() {
		uploadServiceImpl.searchTreatment(medical_record_no, hospital_registration_sn);
	}

//	@Test
	public void testuploadRegistration() {
		uploadServiceImpl.uploadRegistration(medical_record_no, hospital_registration_sn);
	}

//	 @Test
	public void testuploadCompensation() {

		uploadServiceImpl.uploadCompensation(medical_record_no, hospital_registration_sn);
	}
	 @Test
	public void testuploadAllTreatment() {

		uploadServiceImpl.uploadAllTreatment();
	}

}
