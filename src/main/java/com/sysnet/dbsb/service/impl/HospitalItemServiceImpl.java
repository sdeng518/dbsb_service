/**
* @Title: HospitalItemServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:17:24
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.HospitalItemDao;
import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.service.HospitalItemService;

/**
* @ClassName: HospitalItemServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:17:24
*/
@Service
public class HospitalItemServiceImpl implements HospitalItemService {
	@Resource
	private HospitalItemDao hospitalItemDao;
	/* (非 Javadoc)
	* <p>Title: queryById</p>
	* <p>Description: </p>
	* @param id
	* @return
	* @see com.sysnet.dbsb.service.HospitalItemService#queryById(java.lang.String)
	*/
	@Override
	public HospitalItem queryById(String id) {
		return hospitalItemDao.queryById(id);
	}

}
