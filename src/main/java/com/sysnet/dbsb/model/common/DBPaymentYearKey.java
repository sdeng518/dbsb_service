package com.sysnet.dbsb.model.common;

public class DBPaymentYearKey {
    private String MEDICAL_RECORD_NO;

    private Short INSURANCE_YEAR;

    public String getMEDICAL_RECORD_NO() {
        return MEDICAL_RECORD_NO;
    }

    public void setMEDICAL_RECORD_NO(String MEDICAL_RECORD_NO) {
        this.MEDICAL_RECORD_NO = MEDICAL_RECORD_NO == null ? null : MEDICAL_RECORD_NO.trim();
    }

    public Short getINSURANCE_YEAR() {
        return INSURANCE_YEAR;
    }

    public void setINSURANCE_YEAR(Short INSURANCE_YEAR) {
        this.INSURANCE_YEAR = INSURANCE_YEAR;
    }
}