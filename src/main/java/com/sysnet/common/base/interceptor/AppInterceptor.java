/**
* @Title: AppInterceptor.java
* @Package com.sysnet.base.interceptor
* @Description: 
* @author 秦晓东
* @date 2015年12月16日 下午4:41:11
* @version V1.0
*/
package com.sysnet.common.base.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.sysnet.common.base.sys.ApplicationMap;
import com.sysnet.common.utils.StringUtil;

/**
* @ClassName: AppInterceptor
* @Description: 
* @author 秦晓东
* @date 2015年12月16日 下午4:41:11
*/
public class AppInterceptor implements HandlerInterceptor {
	private final Logger log = LoggerFactory.getLogger(AppInterceptor.class);

	/* (非 Javadoc)
	* <p>Title: afterCompletion</p>
	* <p>Description: </p>
	* @param arg0
	* @param arg1
	* @param arg2
	* @param arg3
	* @throws Exception
	* @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	*/
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {

	}

	/* (非 Javadoc)
	* <p>Title: postHandle</p>
	* <p>Description: </p>
	* @param arg0
	* @param arg1
	* @param arg2
	* @param arg3
	* @throws Exception
	* @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	*/
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {

	}

	/* (非 Javadoc)
	* <p>Title: preHandle</p>
	* <p>Description: </p>
	* @param arg0
	* @param arg1
	* @param arg2
	* @return
	* @throws Exception
	* @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	*/
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		String userId = request.getParameter("userId");
		String token = request.getParameter("token");
		if (userId == null || token == null || "".equals(StringUtil.trim(userId))
				|| "".equals(StringUtil.trim(token))) {
			responseNotLoginJson(response, userId, false);
			return false;
		} else {
			String tmp = (String) ApplicationMap.getInstance().get(userId);
			if (token.equals(tmp)) {
				return true;
			} else {
				responseNotLoginJson(response, userId, true);
				return false;
			}
		}
	}

	/**
	* @Title: responseNotLoginJson
	* @Description: 
	* @param @param response
	* @param @throws IOException 
	* @return void   
	* @throws
	*/
	private void responseNotLoginJson(HttpServletResponse response, String userId, boolean flag) throws IOException {
		log.info("用户" + userId + ",未登录尝试操作");
		ModelMap result = new ModelMap();
		if (flag) {
//			result.put(Constant.RETURN_CODE, Constant.UNAUTHORIZED);
//			result.put(Constant.RETURN_MESSAGE, Constant.NO_UNAUTHORIZED_MESSAGE);
		} else {
//			result.put(Constant.RETURN_CODE, Constant.INTERNAL_SERVER_ERROR);
//			result.put(Constant.RETURN_MESSAGE, Constant.INTERNAL_SERVER_ERROR_MESSAGE);
		}
//		result.put(Constant.RETURN_DATA, null);
		String strResult = JSON.toJSONString(result, true);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
		response.getWriter().print(strResult);
		response.flushBuffer();
	}

}
