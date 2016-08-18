package com.sysnet.dbsb.model.message;

import java.util.List;

import com.sysnet.dbsb.model.common.HospitalItem;
import com.sysnet.dbsb.model.common.HospitalRegistration;
import com.sysnet.dbsb.model.common.InsuredPerson;
import com.sysnet.dbsb.model.plicc.Head;
import com.sysnet.dbsb.model.plicc.settlement.HospitalFeeSettlementInfo;
import com.sysnet.dbsb.util.Dom4jUtil;
import com.sysnet.dbsb.util.JAXBUtil;

public class MessageBuilder {

	private static final String AREA_CODE = "610403";
	private static final String standard_version_code = "2.4.9";
	private static final String bus_type = "0";//大病的付款对象(结算对象)， 0-个人 1-医院2-医保结算机构
	private static final String outside_system_code = "SXXNH_SYSNET";
	private static final String outside_system_type = "2";//2—新农合

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		testPerson();
	}

	private static void testPerson() {
		MessageBuilder builder = new MessageBuilder();
		InsuredPerson person = new InsuredPerson();
		person.setMedical_record_no("合疗证号");
		person.setName("参合姓名");
		person.setSex("性别");
		person.setId_type("证件类型");
		person.setId_number("证件号码");
		person.setNation("");
		
		String requeString = builder.buildRequest(person );
		System.out.println(requeString);
	}
	
	
	private String bus_code;
	private String bus_sub_code;
	private String total_count;
	private String total_packge;
	private String data_count;
	private String area_code;
	private String package_id;
	
	public String buildRequest(InsuredPerson person) {
		bus_code="100005";
		bus_sub_code="00";
		
		StringBuilder request = new StringBuilder("<root>");
		
		String headXml = buildHead();
		Dom4jUtil dom4jUtil = new Dom4jUtil();
		request.append(dom4jUtil.initXML_TO_Document(headXml).getRootElement().asXML());
		
		request.append("<body>");
		String bodyXml = JAXBUtil.convertToXml(person);
		request.append(dom4jUtil.initXML_TO_Document(bodyXml).getRootElement().asXML());
		
		request.append("</body></root>");
		
		return request.toString();
	}

	public String buildRequest(HospitalFeeSettlementInfo hospitalFeeSettlementInfo) {
		bus_code="100018";
		bus_sub_code="02";
		
		StringBuilder request = new StringBuilder("<root>");
		
		String headXml = buildHead(hospitalFeeSettlementInfo.getHospitalRegistration());
		Dom4jUtil dom4jUtil = new Dom4jUtil();
		request.append(dom4jUtil.initXML_TO_Document(headXml).getRootElement().asXML());
		request.append("<body>");
		String bodyXml = JAXBUtil.convertToXml(hospitalFeeSettlementInfo);
		request.append(dom4jUtil.initXML_TO_Document(bodyXml).getRootElement().asXML());
		
		request.append("</body></root>");
		
		return request.toString();
	}

	public String buildRequest(HospitalRegistration registration,List<HospitalItem> items) {
		bus_code="100020";
		bus_sub_code="01";//结算后案件上传明细
		
		StringBuilder request = new StringBuilder("<root>");
		
		String headXml = buildHead(registration);
		Dom4jUtil dom4jUtil = new Dom4jUtil();
		request.append(dom4jUtil.initXML_TO_Document(headXml).getRootElement().asXML());
		request.append("<body><hospitalFeeDetailInfo> ");
		request.append("<medical_record_no>").append(registration.getMedical_record_no()).append("</medical_record_no>");
		request.append("<hospital_registration_sn>").append(registration.getHospital_registration_sn()).append("</hospital_registration_sn>");
		request.append("<name>").append(registration.getName()).append("</name>");
		request.append("<sex>").append(registration.getSex()).append("</sex>");
		request.append("<id_type>I</id_type>");
		request.append("<id_number>").append(registration.getId_number()).append("</id_number>");
		
		for (HospitalItem hospitalItem : items) {
			String bodyXml = JAXBUtil.convertToXml(hospitalItem);
			request.append(dom4jUtil.initXML_TO_Document(bodyXml).getRootElement().asXML());
		}
		
		request.append("</hospitalFeeDetailInfo></body></root>");
		
		return request.toString();
	}

	private String buildHead(HospitalRegistration registration) {
		Head head = new Head();
		head.setStandard_version_code(standard_version_code);
		head.setGroup_id(String.valueOf(System.currentTimeMillis()));
		head.setBus_code(bus_code);
		head.setBus_sub_code(bus_sub_code);
		head.setBus_type(bus_type);
		head.setTotal_count(total_count);
		head.setTotal_packge(total_packge);
		head.setPackage_id(package_id);
		head.setData_count(data_count);
		head.setArea_code(area_code);
		head.setOutside_system_code(outside_system_code);
		head.setOutside_system_type(outside_system_type);
		head.setInsured_year("2015");
		head.setDing_hosp_code(registration == null ? "":registration.getDing_hosp_code());
		head.setOption_person_code("");
		
		String headXml = JAXBUtil.convertToXml(head);
		return headXml;
	}
	private String buildHead() {
		return buildHead(null);
	}
	
	public MessageBuilder() {
		total_count = "1";
		total_packge = "1";
		package_id="0";
		data_count = "2";
		area_code = AREA_CODE;
		
	}

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

	public String getTotal_count() {
		return total_count;
	}

	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}

	public String getTotal_packge() {
		return total_packge;
	}

	public void setTotal_packge(String total_packge) {
		this.total_packge = total_packge;
	}

	public String getData_count() {
		return data_count;
	}

	public void setData_count(String data_count) {
		this.data_count = data_count;
	}

	public String getArea_code() {
		return area_code;
	}

	public void setArea_code(String area_code) {
		this.area_code = area_code;
	}

	public String getPackage_id() {
		return package_id;
	}

	public void setPackage_id(String package_id) {
		this.package_id = package_id;
	}

	public static String getAREA_CODE() {
		return AREA_CODE;
	}

	public static String getStandard_version_code() {
		return standard_version_code;
	}

	public static String getBus_type() {
		return bus_type;
	}

	public static String getOutside_system_code() {
		return outside_system_code;
	}

	public static String getOutside_system_type() {
		return outside_system_type;
	}
}
