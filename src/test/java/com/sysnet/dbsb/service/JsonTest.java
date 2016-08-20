/**
* @Title: JsonTest.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午2:34:39
* @version V1.0
*/
package com.sysnet.dbsb.service;

import java.util.HashMap;

import com.alibaba.fastjson.JSON;

/**
* @ClassName: JsonTest
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午2:34:39
*/
public class JsonTest {
	
	public static void main(String[] args) {
		
		joson2Map();
	}
	
	public static void joson2Map() {
		//map to json
		java.util.Map<String, Person> persons = new HashMap<String,Person>();
		persons.put("1", new Person("steve", 32));
		persons.put("2", new Person("dog", 20));
		String json = JSON.toJSONString(persons, true);
		System.out.println(json);
		
		java.util.Map<String, Person> maps =  (java.util.Map<String, Person>) JSON.parse(json);
		for (String	 key : maps.keySet()) {
			System.out.println(maps.get(key));
		}
	}
}
