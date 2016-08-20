/**
* @Title: InsuredPersonServiceImplTest.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.util.Calendar;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sysnet.dbsb.dao.xnh.D506Mapper;
import com.sysnet.dbsb.model.plicc.xnh.D506;

/**
* @ClassName: InsuredPersonServiceImplTest
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class D506MapperlTest {
	@Resource
	D506Mapper d506Dao;
	

	@Test
	public void testupdateByPrimaryKeySelective() {
		 
		D506 record = new D506();
		record.setD506_01("ceafda20-afee-4e9f-b47a-4be1ae13df28");
		record.setD506_38("43568027961110111A1001");
		record.setD506_EXT41("1");
		record.setD506_EXT42(Calendar.getInstance().getTime());
		d506Dao.updateByPrimaryKeySelective(record );	
		
	}
}
