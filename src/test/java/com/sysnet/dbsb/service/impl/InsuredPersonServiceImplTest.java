/**
* @Title: InsuredPersonServiceImplTest.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.model.common.InsuredPerson;

/**
* @ClassName: InsuredPersonServiceImplTest
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class InsuredPersonServiceImplTest {
	@Resource
	InsuredPersonDao insuredPersonDao;
	
	@Test
	public void testQuerybyId() {
		String id = "140302194907021220";
		InsuredPerson insuredPerson = insuredPersonDao.queryById(id);
		System.out.println(insuredPerson.getName());
		
	}

}
