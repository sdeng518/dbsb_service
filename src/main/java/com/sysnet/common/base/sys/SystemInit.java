/**
* @Title: SystemInit.java
* @Package com.sysnet.base
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午4:50:58
* @version V1.0
*/
package com.sysnet.common.base.sys;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
* @ClassName: SystemInit
* @Description: 
* @author 秦晓东
* @date 2015年12月15日 下午4:50:58
*/
public class SystemInit implements ServletContextListener {

	static final Log log = LogFactory.getLog(SystemInit.class);

	/* (非 Javadoc)
	* <p>Title: contextDestroyed</p>
	* <p>Description: </p>
	* @param arg0
	* @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	*/
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		log.info("系统停止......");
	}

	/* (非 Javadoc)
	* <p>Title: contextInitialized</p>
	* <p>Description: </p>
	* @param arg0
	* @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	*/
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		log.info("系统初始化开始....");
		log.info("全局MAP存储对象，例如手机号码对应验证码");
		ApplicationMap.getInstance();
//		String uploadPath = sce.getServletContext().getRealPath("") + "/upload/";
//		log.info("图片存储地址：" + uploadPath);
		//初始化创建图片文件夹
//		ApplicationMap.getInstance().put("uploadPath", uploadPath);
		log.info(ApplicationMap.getInstance() + "*****************************");
		log.info(ApplicationMap.getInstance() + "==================");
		log.info(ApplicationMap.getInstance() + "++++++++++++++++++");
		log.info("全局MAP存储对象初始化完毕");
		log.info("系统初始化结束....");
	}

}
