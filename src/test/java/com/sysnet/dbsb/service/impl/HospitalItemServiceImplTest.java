/**
* @Title: InsuredPersonServiceImplTest.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sysnet.dbsb.dao.HospitalItemDao;
import com.sysnet.dbsb.model.common.HospitalItem;

/**
* @ClassName: InsuredPersonServiceImplTest
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class HospitalItemServiceImplTest {
	@Resource
	HospitalItemDao hospitalItemDao;
	
//	@Test
	public void testQuerybyId() {
		String id = "981000316148";
		HospitalItem  hospitalItem = hospitalItemDao.queryById(id);
		System.out.println(hospitalItem.getYb_three_catalog_name());
	}
	
	@Test
	public void testQueryByFilter() {
		Map<String, Object> filter = new HashMap<String, Object>();
		 filter.put("medical_record_no", "140303193710160018");
		 filter.put("hospital_registration_sn", "981000316148");
		 
		List<HospitalItem>  hospitalItems = hospitalItemDao.queryByFilter(filter);
		for (HospitalItem hospitalItem : hospitalItems) {
			System.out.println(hospitalItem.getYb_three_catalog_name());
		}
	}
}
