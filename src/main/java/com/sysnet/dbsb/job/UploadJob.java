package com.sysnet.dbsb.job;

import java.util.Calendar;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sysnet.dbsb.model.common.ConfigInfo;
import com.sysnet.dbsb.service.UploadService;

@Component
public class UploadJob {
	public static Logger logger = Logger.getLogger(UploadJob.class);
	@Autowired
	@Qualifier("uploadServiceImpl4ASIA")
	//uploadServiceImpl4PLICC uploadServiceImpl uploadServiceImpl4ASIA
	private UploadService uploadServiceImpl;

	@Autowired
	private ConfigInfo configInfo;

	public void uploadPersonById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadPersonById...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadPerson(medical_record_no);
		}
	}

	public void uploadAllPerson() {
		System.out.println(Calendar.getInstance().getTime() + "uploadAllPerson...");
		uploadServiceImpl.uploadAllPerson();

	}

	public void uploadHospitalById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadHospitalById...");
		uploadServiceImpl.uploadHospital(configInfo.getHospitalId());
	}

	public void uploadAllHospital() {
		System.out.println(Calendar.getInstance().getTime() + "uploadAllHospital...");
		uploadServiceImpl.uploadAllHospital();
	}

	public void uploadAllTreatment() {
		System.out.println(Calendar.getInstance().getTime() + "uploadAllTreatment...");
		uploadServiceImpl.uploadAllTreatment();

	}

	public void uploadTreatmentById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadTreatmentById...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadTreatment(medical_record_no, configInfo.getHospital_registration_sn());
		}
	}

	public void uploadCancelTreatmentById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadCancelTreatmentById...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadCancelTreatment(medical_record_no, configInfo.getHospital_registration_sn());
		}
	}

	public void uploadTreatDetailById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadTreatDetailById...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadTreatDetail(medical_record_no, configInfo.getHospital_registration_sn());
		}
	}
	
	public void uploadTreatSettleDetailById() {
		System.out.println(Calendar.getInstance().getTime() + "uploadTreatSettleDetailById...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadTreatment(medical_record_no, configInfo.getHospital_registration_sn());
			uploadServiceImpl.uploadTreatDetail(medical_record_no, configInfo.getHospital_registration_sn());
		}
	}
	
	public void uploadTreatSteps() {
		System.out.println(Calendar.getInstance().getTime() + "uploadTreatSteps...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadRegistration(medical_record_no,configInfo.getHospital_registration_sn());
			uploadServiceImpl.uploadTreatDetail(medical_record_no, configInfo.getHospital_registration_sn());
			uploadServiceImpl.uploadCompensation(medical_record_no, configInfo.getHospital_registration_sn());
		}
	}
	
	public void uploadRegistration() {
		System.out.println(Calendar.getInstance().getTime() + "uploadRegistration...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadRegistration(medical_record_no,configInfo.getHospital_registration_sn());
		}
			
	}
	
	public void uploadCompensation() {
		System.out.println(Calendar.getInstance().getTime() + "uploadCompensation...");
		for (String medical_record_no : configInfo.getMedical_record_nos()) {
			uploadServiceImpl.uploadCompensation(medical_record_no,configInfo.getHospital_registration_sn());
		}
	}
}
