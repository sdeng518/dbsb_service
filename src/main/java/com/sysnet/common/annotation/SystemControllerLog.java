/**
* @Title: SystemControllerLog.java
* @Package com.sysnet.common.annotation
* @Description: 
* @author dengweihua
* @date 2016年2月25日 下午7:06:21
* @version V1.0
*/
package com.sysnet.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
* @ClassName: SystemControllerLog
* @Description: 
* @author dengweihua
* @date 2016年2月25日 下午7:06:21
*/
@Target({ElementType.PARAMETER,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SystemControllerLog {
	String description()  default ""; 
}
