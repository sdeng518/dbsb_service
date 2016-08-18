/**
* @Title: InsuredPersonServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:09:06
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.InsuredPersonDao;
import com.sysnet.dbsb.model.common.InsuredPerson;
import com.sysnet.dbsb.service.InsuredPersonService;

/**
* @ClassName: InsuredPersonServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年1月21日 下午4:09:06
*/
@Service
public class InsuredPersonServiceImpl implements InsuredPersonService {
	@Resource
	private InsuredPersonDao insuredPersonDao;

	/* (非 Javadoc)
	* <p>Title: queryById</p>
	* <p>Description: </p>
	* @param id
	* @return
	* @see com.sysnet.dbsb.service.InsuredPersonService#queryById(java.lang.String)
	*/
	@Override
	public InsuredPerson queryById(String id) {
		return insuredPersonDao.queryById(id);
	}
}
