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

import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.dao.PayeeInformationDao;
import com.sysnet.dbsb.model.common.InsuredPerson;
import com.sysnet.dbsb.model.common.PayeeInformation;

/**
* @ClassName: InsuredPersonServiceImplTest
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class PayeeInformationServiceImplTest {
	@Resource
	PayeeInformationDao payeeInformationDao;
	
	@Test
	public void testQuerybyId() {
		String id = "142401198610196213";
		PayeeInformation payeeInformation = payeeInformationDao.queryById(id);
		System.out.println(payeeInformation.getIDNumber());
	}

}
