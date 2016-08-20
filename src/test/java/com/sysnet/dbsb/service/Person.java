/**
* @Title: Person.java
* @Package com.sysnet.dbsb.service
* @Description: 
* @author dengweihua
* @date 2016年4月13日 下午2:47:24
* @version V1.0
*/
package com.sysnet.dbsb.service;

import java.sql.Date;

public class Person{
	/**
	* @Fields Person : 
	*/
	private String name;
	private int age;
	private Date birth;
	
	
	/**
	* 创建一个新的实例 person.
	* @param name
	* @param age
	* @param birth
	 * @param jsonTest TODO
	*/
	public Person(String name, int age, Date birth) {
		super();
		this.name = name;
		this.age = age;
		this.birth = birth;
	}
	
	
	/**
	* 创建一个新的实例 person.
	* @param name
	* @param age
	 * @param jsonTest TODO
	*/
	public Person( String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	/**
	* @return name
	*/
	public String getName() {
		return name;
	}
	/**
	* @param name 要设置的 name
	*/
	public void setName(String name) {
		this.name = name;
	}
	/**
	* @return age
	*/
	public int getAge() {
		return age;
	}
	/**
	* @param age 要设置的 age
	*/
	public void setAge(int age) {
		this.age = age;
	}
	/**
	* @return birth
	*/
	public Date getBirth() {
		return birth;
	}
	/**
	* @param birth 要设置的 birth
	*/
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	
}