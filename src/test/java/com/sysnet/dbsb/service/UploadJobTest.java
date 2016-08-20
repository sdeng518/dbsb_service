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

import com.sysnet.dbsb.job.UploadJob;

/**
 * @ClassName: UploadServiceTest
 * @Description:
 * @author dengweihua
 * @date 2016年1月21日 下午7:13:01R
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class UploadJobTest {
	@Autowired
	@Qualifier("uploadServiceImpl4ASIA")
//	@Qualifier("uploadServiceImpl4Test")
	
	UploadJob uploadJob;

	/**
	 * @Title: setUp @Description: @throws java.lang.Exception void @throws
	 */
	@Before
	public void setUp() throws Exception {
	}

//	 @Test
	public void testuploadPerson() {
		String id = "140302193310100415";
		uploadJob.uploadPersonById();
	}

	// @Test
	public void testuploadHospital() {
		String id = "40614152-4";
//		uploadJob.uploadHospital(id);
	}

	 @Test
	public void testuploadTreatment() {
		uploadJob.uploadTreatmentById();
	}

//	@Test
	public void testuploadCancelTreatment() {
		String medical_record_no = "310105196701232419";
		String hospital_registration_sn = "981000000615";

			//uploadJob.uploadCancelTreatment(medical_record_no, hospital_registration_sn);

	}

//	@Test
	public void testuploadTreatDetail() {
		String medical_record_no = "140302195509180829";
		String hospital_registration_sn = "981000003030";

//		uploadJob.uploadTreatDetail(medical_record_no, hospital_registration_sn);
	}
}
