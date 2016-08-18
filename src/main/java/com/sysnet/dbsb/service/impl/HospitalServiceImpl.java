/**
* @Title: HospitalServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:50:51
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.HospitalDao;
import com.sysnet.dbsb.model.common.Hospital;
import com.sysnet.dbsb.service.HospitalService;

/**
* @ClassName: HospitalServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:50:51
*/
@Service
public class HospitalServiceImpl implements HospitalService {
	@Resource
	private HospitalDao hospitalDao; 
	
	/* (非 Javadoc)
	* <p>Title: queryById</p>
	* <p>Description: </p>
	* @param id
	* @return
	* @see com.sysnet.dbsb.service.HospitalService#queryById(java.lang.String)
	*/
	@Override
	public Hospital queryById(String id) {
		return hospitalDao.queryById(id);
	}

}
