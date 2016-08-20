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

import com.sysnet.dbsb.dao.FeeSettlementMapper;
import com.sysnet.dbsb.model.common.FeeSettlement;

/**
* @ClassName: InsuredPersonServiceImplTest
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:22:59
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:conf/applicationContext.xml", "classpath:conf/spring-mybatis.xml" })
public class FeeSettlementMapperlTest {
	@Resource
	FeeSettlementMapper feeSettlementMapper;
	private FeeSettlement record;
	
	@Test
	public void testInsertSelective() {
		record = new FeeSettlement();
		record.setGROUP_ID("1");
		record.setBUS_CODE("H210");
		record.setBUS_SUB_CODE("H210");
		record.setSTATUS("1");
		record.setMSG("getDescription()");
		feeSettlementMapper.insertSelective(record);
		
	}
	
}
