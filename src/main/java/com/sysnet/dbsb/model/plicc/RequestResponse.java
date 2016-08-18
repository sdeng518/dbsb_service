package com.sysnet.dbsb.model.plicc;

public class RequestResponse {
	private String bus_code="";
	private String bus_sub_code="";
	private String request="";
	private String response="";
	public String getBus_code() {
		return bus_code;
	}
	public void setBus_code(String bus_code) {
		this.bus_code = bus_code;
	}
	public String getBus_sub_code() {
		return bus_sub_code;
	}
	public void setBus_sub_code(String bus_sub_code) {
		this.bus_sub_code = bus_sub_code;
	}
	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	
	
	
}
