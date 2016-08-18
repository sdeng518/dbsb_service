package com.sysnet.dbsb.model.common;

public class DBPaymentKey {
    private String MEDICAL_RECORD_NO;

    private String HOSPITAL_REGISTRATION_SN;

    public String getMEDICAL_RECORD_NO() {
        return MEDICAL_RECORD_NO;
    }

    public void setMEDICAL_RECORD_NO(String MEDICAL_RECORD_NO) {
        this.MEDICAL_RECORD_NO = MEDICAL_RECORD_NO == null ? null : MEDICAL_RECORD_NO.trim();
    }

    public String getHOSPITAL_REGISTRATION_SN() {
        return HOSPITAL_REGISTRATION_SN;
    }

    public void setHOSPITAL_REGISTRATION_SN(String HOSPITAL_REGISTRATION_SN) {
        this.HOSPITAL_REGISTRATION_SN = HOSPITAL_REGISTRATION_SN == null ? null : HOSPITAL_REGISTRATION_SN.trim();
    }
}