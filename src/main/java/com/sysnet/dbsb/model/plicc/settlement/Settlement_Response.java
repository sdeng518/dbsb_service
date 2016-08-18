package com.sysnet.dbsb.model.plicc.settlement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

import com.sysnet.dbsb.model.plicc.common.Head;
import com.sysnet.dbsb.util.JAXBUtil;

/**
 * 费用结算请求消息
 * 
 * @author dengweihua
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "root")
public class Settlement_Response {
	@XmlElement(name = "head")
	private Head head;
	@XmlElementWrapper(name="body")
	@XmlElement(name = "outExportHospitalCompensation")
	private List<OutExportHospitalCompensation> outExportHospitalCompensations;

	public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	
	/**
	* @return outExportHospitalCompensations
	*/
	public List<OutExportHospitalCompensation> getOutExportHospitalCompensations() {
		return outExportHospitalCompensations;
	}

	/**
	* @param outExportHospitalCompensations 要设置的 outExportHospitalCompensations
	*/
	public void setOutExportHospitalCompensations(List<OutExportHospitalCompensation> outExportHospitalCompensations) {
		this.outExportHospitalCompensations = outExportHospitalCompensations;
	}

	public static void main(String[] args) {
		String responseXml =
				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
						"\n" + 
						"<root>\n" + 
						"  <head>\n" + 
						"    <group_id>20160226095849</group_id>\n" + 
						"    <bus_code>100018</bus_code>\n" + 
						"    <bus_sub_code>02</bus_sub_code>\n" + 
						"    <package_id>1</package_id>\n" + 
						"  </head>\n" + 
						"  <body>\n" + 
						"    <outExportHospitalCompensation>\n" + 
						"      <status>0</status>\n" + 
						"      <msg>医保机构的定点医院编号为空，请核对</msg>\n" + 
						"      <medical_record_no>String</medical_record_no>\n" + 
						"      <hospital_registration_sn>String</hospital_registration_sn>\n" + 
						"      <name>String</name>\n" + 
						"      <sex>String</sex>\n" + 
						"      <id_type>String</id_type>\n" + 
						"      <id_number>String</id_number>\n" + 
						"      <contract_number>String</contract_number>\n" + 
						"      <case_number>String</case_number>\n" + 
						"      <mobilephone>String</mobilephone>\n" + 
						"      <accident_reason>String</accident_reason>\n" + 
						"      <leave_hospital_style>String</leave_hospital_style>\n" + 
						"      <in_date>String</in_date>\n" + 
						"      <section_office>String</section_office>\n" + 
						"      <leave_date>String</leave_date>\n" + 
						"      <leave_state>String</leave_state>\n" + 
						"      <leave_disease_code>String</leave_disease_code>\n" + 
						"      <settlement_number>String</settlement_number>\n" + 
						"      <total_payment>0</total_payment>\n" + 
						"      <total_self_payment>0</total_self_payment>\n" + 
						"      <db_pay_line>0</db_pay_line>\n" + 
						"      <fit_into_db_amount>0</fit_into_db_amount>\n" + 
						"      <deduction_payment>0</deduction_payment>\n" + 
						"      <yb_compensation>0</yb_compensation>\n" + 
						"      <db_compensation>0</db_compensation>\n" + 
						"      <db_year_compensation>0</db_year_compensation>\n" + 
						"      <db_year_hospital_compensation>0</db_year_hospital_compensation>\n" + 
						"      <db_year_clinic_compensation>0</db_year_clinic_compensation>\n" + 
						"      <third_party_compensation>0</third_party_compensation>\n" + 
						"      <compensate_date>String</compensate_date>\n" + 
						"      <nonreal_time_reason>String</nonreal_time_reason>\n" + 
						"      <whether_ignore>0</whether_ignore>\n" + 
						"      <compensation_way>String</compensation_way>\n" + 
						"      <compensate_information>String</compensate_information>\n" + 
						"      <insurance_sort>String</insurance_sort>\n" + 
						"      <ding_hosp_code>String</ding_hosp_code>\n" + 
						"      <employee>大病接口</employee>\n" + 
						"      <uppercase_compensation>String</uppercase_compensation>\n" + 
						"      <settlement_download_link>String</settlement_download_link>\n" + 
						"      <arg1>String</arg1>\n" + 
						"      <arg2>String</arg2>\n" + 
						"      <arg3>String</arg3>\n" + 
						"      <arg4>String</arg4>\n" + 
						"      <arg5>String</arg5>\n" + 
						"      <arg6>String</arg6>\n" + 
						"      <arg7>String</arg7>\n" + 
						"      <arg8>String</arg8>\n" + 
						"      <arg9>String</arg9>\n" + 
						"      <arg10>String</arg10>\n" + 
						"    </outExportHospitalCompensation>\n" + 
						"  </body>\n" + 
						"</root>";



		Settlement_Response bean = JAXBUtil.converyToJavaBean(responseXml, Settlement_Response.class);
		System.out.println(bean.getOutExportHospitalCompensations().get(0).getMsg());
	}
}
