package com.sysnet.dbsb.model.common;

public class DBUploadMsgKey {
    private String MEDICAL_RECORD_NO;

    private String HOSPITAL_REGISTRATION_SN;

    private String TYPE;

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

    public String getTYPE() {
        return TYPE;
    }

    public void setTYPE(String TYPE) {
        this.TYPE = TYPE == null ? null : TYPE.trim();
    }
}