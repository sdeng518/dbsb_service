/**
* @Title: HospitalRegistrationServiceImpl.java
* @Package com.sysnet.dbsb.service.impl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:21:43
* @version V1.0
*/
package com.sysnet.dbsb.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sysnet.dbsb.dao.HospitalRegistrationDao;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.service.HospitalRegistrationService;

/**
* @ClassName: HospitalRegistrationServiceImpl
* @Description: 
* @author dengweihua
* @date 2016年1月26日 上午11:21:43
*/
@Service
public class HospitalRegistrationServiceImpl implements HospitalRegistrationService {
	@Resource	
	private HospitalRegistrationDao  hospitalRegistrationDao;
	/* (非 Javadoc)
	* <p>Title: queryById</p>
	* <p>Description: </p>
	* @param id
	* @return
	* @see com.sysnet.dbsb.service.HospitalRegistrationService#queryById(java.lang.String)
	*/
	@Override
	public HospitalRegistration queryById(String id) {
		return hospitalRegistrationDao.queryById(id);
	}

}
