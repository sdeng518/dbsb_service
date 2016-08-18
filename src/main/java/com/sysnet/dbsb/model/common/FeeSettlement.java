package com.sysnet.dbsb.model.common;

import java.math.BigDecimal;
import java.util.Date;

public class FeeSettlement {
    private String ID;

    private String GROUP_ID;

    private String STANDARD_VERSION_CODE;

    private String BUS_CODE;

    private String BUS_SUB_CODE;

    private String BUS_TYPE;

    private String TOTAL_COUNT;

    private String TOTAL_PACKGE;

    private String PACKAGE_ID;

    private String DATA_COUNT;

    private String AREA_CODE;

    private String OUTSIDE_SYSTEM_CODE;

    private String OUTSIDE_SYSTEM_TYPE;

    private String DING_HOSP_CODE;

    private String OPTION_PERSON_CODE;

    private String INSURED_YEAR;

    private String MEDICAL_RECORD_NO;

    private String HOSPITAL_REGISTRATION_SN;

    private String NAME;

    private String SEX;

    private String ID_TYPE;

    private String ID_NUMBER;

    private Date IN_DATE;

    private String BABY_NAME;

    private String PHONE;

    private String MOBILEPHONE;

    private String ACCIDENT_REASON;

    private String IN_HOSPITAL_STYLE;

    private String BASIC_MEDICAL_TYPE;

    private String BED_NUMBER;

    private String SECTION_OFFICE;

    private String INITIAL_DIAGNOSIS;

    private String COMPLICATION;

    private String MAIN_DIAGNOSIS_CODE;

    private String OTHER_DIAGNOSIS_CODE;

    private String MASTER_DOCTOR;

    private String MEMO;

    private String SETTLEMENT_NUMBER;

    private String LEAVE_STATE;

    private BigDecimal REFERRAL_RATIO;

    private String LEAVE_HOSPITAL_STYLE;

    private Date LEAVE_DATE;

    private String DEATH_TIME;

    private Date LEAVE_DISEASE_CODE;

    private BigDecimal TOTAL_PAYMENT;

    private BigDecimal JIALEI_PAYMENT;

    private BigDecimal YILEI_BAOXIAO;

    private BigDecimal YILEI_PAYMENT;

    private BigDecimal BINGLEI_YIBAO;

    private BigDecimal BINGLEI_PAYMENT;

    private BigDecimal ZY_PAYMENT;

    private BigDecimal XY_PAYMENT;

    private BigDecimal YB_START_PAY_LINE;

    private BigDecimal FIT_INTO_YB_AMOUNT;

    private BigDecimal YB_COMPENSATION;

    private BigDecimal YB_YEAR_COMPENSATION;

    private BigDecimal THIRD_PARTY_COMPENSATION;

    private BigDecimal YEAR_THIRD_PARTY_COMPENSATIO;

    private BigDecimal DB_COMPENSATION;

    private BigDecimal DB_YEAR_COMPENSATION;

    private String BANK_CODE;

    private String BANK_NAME;

    private String CLAIM_PAYMENT_ACCOUNT;

    private String ACCOUNT_HOLDERS;

    private String CONTRACT_NUMBER;

    private String CASE_NUMBER;

    private Date CREARE_DATE;

    private String IS_CANCEL;

    private String IS_CANCEL_SUCCESS;

    private Date CANCEL_DATE;

    private String CANCEL_FAULT_REASON;

    private String STATUS;

    private String MSG;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    public String getGROUP_ID() {
        return GROUP_ID;
    }

    public void setGROUP_ID(String GROUP_ID) {
        this.GROUP_ID = GROUP_ID == null ? null : GROUP_ID.trim();
    }

    public String getSTANDARD_VERSION_CODE() {
        return STANDARD_VERSION_CODE;
    }

    public void setSTANDARD_VERSION_CODE(String STANDARD_VERSION_CODE) {
        this.STANDARD_VERSION_CODE = STANDARD_VERSION_CODE == null ? null : STANDARD_VERSION_CODE.trim();
    }

    public String getBUS_CODE() {
        return BUS_CODE;
    }

    public void setBUS_CODE(String BUS_CODE) {
        this.BUS_CODE = BUS_CODE == null ? null : BUS_CODE.trim();
    }

    public String getBUS_SUB_CODE() {
        return BUS_SUB_CODE;
    }

    public void setBUS_SUB_CODE(String BUS_SUB_CODE) {
        this.BUS_SUB_CODE = BUS_SUB_CODE == null ? null : BUS_SUB_CODE.trim();
    }

    public String getBUS_TYPE() {
        return BUS_TYPE;
    }

    public void setBUS_TYPE(String BUS_TYPE) {
        this.BUS_TYPE = BUS_TYPE == null ? null : BUS_TYPE.trim();
    }

    public String getTOTAL_COUNT() {
        return TOTAL_COUNT;
    }

    public void setTOTAL_COUNT(String TOTAL_COUNT) {
        this.TOTAL_COUNT = TOTAL_COUNT == null ? null : TOTAL_COUNT.trim();
    }

    public String getTOTAL_PACKGE() {
        return TOTAL_PACKGE;
    }

    public void setTOTAL_PACKGE(String TOTAL_PACKGE) {
        this.TOTAL_PACKGE = TOTAL_PACKGE == null ? null : TOTAL_PACKGE.trim();
    }

    public String getPACKAGE_ID() {
        return PACKAGE_ID;
    }

    public void setPACKAGE_ID(String PACKAGE_ID) {
        this.PACKAGE_ID = PACKAGE_ID == null ? null : PACKAGE_ID.trim();
    }

    public String getDATA_COUNT() {
        return DATA_COUNT;
    }

    public void setDATA_COUNT(String DATA_COUNT) {
        this.DATA_COUNT = DATA_COUNT == null ? null : DATA_COUNT.trim();
    }

    public String getAREA_CODE() {
        return AREA_CODE;
    }

    public void setAREA_CODE(String AREA_CODE) {
        this.AREA_CODE = AREA_CODE == null ? null : AREA_CODE.trim();
    }

    public String getOUTSIDE_SYSTEM_CODE() {
        return OUTSIDE_SYSTEM_CODE;
    }

    public void setOUTSIDE_SYSTEM_CODE(String OUTSIDE_SYSTEM_CODE) {
        this.OUTSIDE_SYSTEM_CODE = OUTSIDE_SYSTEM_CODE == null ? null : OUTSIDE_SYSTEM_CODE.trim();
    }

    public String getOUTSIDE_SYSTEM_TYPE() {
        return OUTSIDE_SYSTEM_TYPE;
    }

    public void setOUTSIDE_SYSTEM_TYPE(String OUTSIDE_SYSTEM_TYPE) {
        this.OUTSIDE_SYSTEM_TYPE = OUTSIDE_SYSTEM_TYPE == null ? null : OUTSIDE_SYSTEM_TYPE.trim();
    }

    public String getDING_HOSP_CODE() {
        return DING_HOSP_CODE;
    }

    public void setDING_HOSP_CODE(String DING_HOSP_CODE) {
        this.DING_HOSP_CODE = DING_HOSP_CODE == null ? null : DING_HOSP_CODE.trim();
    }

    public String getOPTION_PERSON_CODE() {
        return OPTION_PERSON_CODE;
    }

    public void setOPTION_PERSON_CODE(String OPTION_PERSON_CODE) {
        this.OPTION_PERSON_CODE = OPTION_PERSON_CODE == null ? null : OPTION_PERSON_CODE.trim();
    }

    public String getINSURED_YEAR() {
        return INSURED_YEAR;
    }

    public void setINSURED_YEAR(String INSURED_YEAR) {
        this.INSURED_YEAR = INSURED_YEAR == null ? null : INSURED_YEAR.trim();
    }

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

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME == null ? null : NAME.trim();
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX == null ? null : SEX.trim();
    }

    public String getID_TYPE() {
        return ID_TYPE;
    }

    public void setID_TYPE(String ID_TYPE) {
        this.ID_TYPE = ID_TYPE == null ? null : ID_TYPE.trim();
    }

    public String getID_NUMBER() {
        return ID_NUMBER;
    }

    public void setID_NUMBER(String ID_NUMBER) {
        this.ID_NUMBER = ID_NUMBER == null ? null : ID_NUMBER.trim();
    }

    public Date getIN_DATE() {
        return IN_DATE;
    }

    public void setIN_DATE(Date IN_DATE) {
        this.IN_DATE = IN_DATE;
    }

    public String getBABY_NAME() {
        return BABY_NAME;
    }

    public void setBABY_NAME(String BABY_NAME) {
        this.BABY_NAME = BABY_NAME == null ? null : BABY_NAME.trim();
    }

    public String getPHONE() {
        return PHONE;
    }

    public void setPHONE(String PHONE) {
        this.PHONE = PHONE == null ? null : PHONE.trim();
    }

    public String getMOBILEPHONE() {
        return MOBILEPHONE;
    }

    public void setMOBILEPHONE(String MOBILEPHONE) {
        this.MOBILEPHONE = MOBILEPHONE == null ? null : MOBILEPHONE.trim();
    }

    public String getACCIDENT_REASON() {
        return ACCIDENT_REASON;
    }

    public void setACCIDENT_REASON(String ACCIDENT_REASON) {
        this.ACCIDENT_REASON = ACCIDENT_REASON == null ? null : ACCIDENT_REASON.trim();
    }

    public String getIN_HOSPITAL_STYLE() {
        return IN_HOSPITAL_STYLE;
    }

    public void setIN_HOSPITAL_STYLE(String IN_HOSPITAL_STYLE) {
        this.IN_HOSPITAL_STYLE = IN_HOSPITAL_STYLE == null ? null : IN_HOSPITAL_STYLE.trim();
    }

    public String getBASIC_MEDICAL_TYPE() {
        return BASIC_MEDICAL_TYPE;
    }

    public void setBASIC_MEDICAL_TYPE(String BASIC_MEDICAL_TYPE) {
        this.BASIC_MEDICAL_TYPE = BASIC_MEDICAL_TYPE == null ? null : BASIC_MEDICAL_TYPE.trim();
    }

    public String getBED_NUMBER() {
        return BED_NUMBER;
    }

    public void setBED_NUMBER(String BED_NUMBER) {
        this.BED_NUMBER = BED_NUMBER == null ? null : BED_NUMBER.trim();
    }

    public String getSECTION_OFFICE() {
        return SECTION_OFFICE;
    }

    public void setSECTION_OFFICE(String SECTION_OFFICE) {
        this.SECTION_OFFICE = SECTION_OFFICE == null ? null : SECTION_OFFICE.trim();
    }

    public String getINITIAL_DIAGNOSIS() {
        return INITIAL_DIAGNOSIS;
    }

    public void setINITIAL_DIAGNOSIS(String INITIAL_DIAGNOSIS) {
        this.INITIAL_DIAGNOSIS = INITIAL_DIAGNOSIS == null ? null : INITIAL_DIAGNOSIS.trim();
    }

    public String getCOMPLICATION() {
        return COMPLICATION;
    }

    public void setCOMPLICATION(String COMPLICATION) {
        this.COMPLICATION = COMPLICATION == null ? null : COMPLICATION.trim();
    }

    public String getMAIN_DIAGNOSIS_CODE() {
        return MAIN_DIAGNOSIS_CODE;
    }

    public void setMAIN_DIAGNOSIS_CODE(String MAIN_DIAGNOSIS_CODE) {
        this.MAIN_DIAGNOSIS_CODE = MAIN_DIAGNOSIS_CODE == null ? null : MAIN_DIAGNOSIS_CODE.trim();
    }

    public String getOTHER_DIAGNOSIS_CODE() {
        return OTHER_DIAGNOSIS_CODE;
    }

    public void setOTHER_DIAGNOSIS_CODE(String OTHER_DIAGNOSIS_CODE) {
        this.OTHER_DIAGNOSIS_CODE = OTHER_DIAGNOSIS_CODE == null ? null : OTHER_DIAGNOSIS_CODE.trim();
    }

    public String getMASTER_DOCTOR() {
        return MASTER_DOCTOR;
    }

    public void setMASTER_DOCTOR(String MASTER_DOCTOR) {
        this.MASTER_DOCTOR = MASTER_DOCTOR == null ? null : MASTER_DOCTOR.trim();
    }

    public String getMEMO() {
        return MEMO;
    }

    public void setMEMO(String MEMO) {
        this.MEMO = MEMO == null ? null : MEMO.trim();
    }

    public String getSETTLEMENT_NUMBER() {
        return SETTLEMENT_NUMBER;
    }

    public void setSETTLEMENT_NUMBER(String SETTLEMENT_NUMBER) {
        this.SETTLEMENT_NUMBER = SETTLEMENT_NUMBER == null ? null : SETTLEMENT_NUMBER.trim();
    }

    public String getLEAVE_STATE() {
        return LEAVE_STATE;
    }

    public void setLEAVE_STATE(String LEAVE_STATE) {
        this.LEAVE_STATE = LEAVE_STATE == null ? null : LEAVE_STATE.trim();
    }

    public BigDecimal getREFERRAL_RATIO() {
        return REFERRAL_RATIO;
    }

    public void setREFERRAL_RATIO(BigDecimal REFERRAL_RATIO) {
        this.REFERRAL_RATIO = REFERRAL_RATIO;
    }

    public String getLEAVE_HOSPITAL_STYLE() {
        return LEAVE_HOSPITAL_STYLE;
    }

    public void setLEAVE_HOSPITAL_STYLE(String LEAVE_HOSPITAL_STYLE) {
        this.LEAVE_HOSPITAL_STYLE = LEAVE_HOSPITAL_STYLE == null ? null : LEAVE_HOSPITAL_STYLE.trim();
    }

    public Date getLEAVE_DATE() {
        return LEAVE_DATE;
    }

    public void setLEAVE_DATE(Date LEAVE_DATE) {
        this.LEAVE_DATE = LEAVE_DATE;
    }

    public String getDEATH_TIME() {
        return DEATH_TIME;
    }

    public void setDEATH_TIME(String DEATH_TIME) {
        this.DEATH_TIME = DEATH_TIME == null ? null : DEATH_TIME.trim();
    }

    public Date getLEAVE_DISEASE_CODE() {
        return LEAVE_DISEASE_CODE;
    }

    public void setLEAVE_DISEASE_CODE(Date LEAVE_DISEASE_CODE) {
        this.LEAVE_DISEASE_CODE = LEAVE_DISEASE_CODE;
    }

    public BigDecimal getTOTAL_PAYMENT() {
        return TOTAL_PAYMENT;
    }

    public void setTOTAL_PAYMENT(BigDecimal TOTAL_PAYMENT) {
        this.TOTAL_PAYMENT = TOTAL_PAYMENT;
    }

    public BigDecimal getJIALEI_PAYMENT() {
        return JIALEI_PAYMENT;
    }

    public void setJIALEI_PAYMENT(BigDecimal JIALEI_PAYMENT) {
        this.JIALEI_PAYMENT = JIALEI_PAYMENT;
    }

    public BigDecimal getYILEI_BAOXIAO() {
        return YILEI_BAOXIAO;
    }

    public void setYILEI_BAOXIAO(BigDecimal YILEI_BAOXIAO) {
        this.YILEI_BAOXIAO = YILEI_BAOXIAO;
    }

    public BigDecimal getYILEI_PAYMENT() {
        return YILEI_PAYMENT;
    }

    public void setYILEI_PAYMENT(BigDecimal YILEI_PAYMENT) {
        this.YILEI_PAYMENT = YILEI_PAYMENT;
    }

    public BigDecimal getBINGLEI_YIBAO() {
        return BINGLEI_YIBAO;
    }

    public void setBINGLEI_YIBAO(BigDecimal BINGLEI_YIBAO) {
        this.BINGLEI_YIBAO = BINGLEI_YIBAO;
    }

    public BigDecimal getBINGLEI_PAYMENT() {
        return BINGLEI_PAYMENT;
    }

    public void setBINGLEI_PAYMENT(BigDecimal BINGLEI_PAYMENT) {
        this.BINGLEI_PAYMENT = BINGLEI_PAYMENT;
    }

    public BigDecimal getZY_PAYMENT() {
        return ZY_PAYMENT;
    }

    public void setZY_PAYMENT(BigDecimal ZY_PAYMENT) {
        this.ZY_PAYMENT = ZY_PAYMENT;
    }

    public BigDecimal getXY_PAYMENT() {
        return XY_PAYMENT;
    }

    public void setXY_PAYMENT(BigDecimal XY_PAYMENT) {
        this.XY_PAYMENT = XY_PAYMENT;
    }

    public BigDecimal getYB_START_PAY_LINE() {
        return YB_START_PAY_LINE;
    }

    public void setYB_START_PAY_LINE(BigDecimal YB_START_PAY_LINE) {
        this.YB_START_PAY_LINE = YB_START_PAY_LINE;
    }

    public BigDecimal getFIT_INTO_YB_AMOUNT() {
        return FIT_INTO_YB_AMOUNT;
    }

    public void setFIT_INTO_YB_AMOUNT(BigDecimal FIT_INTO_YB_AMOUNT) {
        this.FIT_INTO_YB_AMOUNT = FIT_INTO_YB_AMOUNT;
    }

    public BigDecimal getYB_COMPENSATION() {
        return YB_COMPENSATION;
    }

    public void setYB_COMPENSATION(BigDecimal YB_COMPENSATION) {
        this.YB_COMPENSATION = YB_COMPENSATION;
    }

    public BigDecimal getYB_YEAR_COMPENSATION() {
        return YB_YEAR_COMPENSATION;
    }

    public void setYB_YEAR_COMPENSATION(BigDecimal YB_YEAR_COMPENSATION) {
        this.YB_YEAR_COMPENSATION = YB_YEAR_COMPENSATION;
    }

    public BigDecimal getTHIRD_PARTY_COMPENSATION() {
        return THIRD_PARTY_COMPENSATION;
    }

    public void setTHIRD_PARTY_COMPENSATION(BigDecimal THIRD_PARTY_COMPENSATION) {
        this.THIRD_PARTY_COMPENSATION = THIRD_PARTY_COMPENSATION;
    }

    public BigDecimal getYEAR_THIRD_PARTY_COMPENSATIO() {
        return YEAR_THIRD_PARTY_COMPENSATIO;
    }

    public void setYEAR_THIRD_PARTY_COMPENSATIO(BigDecimal YEAR_THIRD_PARTY_COMPENSATIO) {
        this.YEAR_THIRD_PARTY_COMPENSATIO = YEAR_THIRD_PARTY_COMPENSATIO;
    }

    public BigDecimal getDB_COMPENSATION() {
        return DB_COMPENSATION;
    }

    public void setDB_COMPENSATION(BigDecimal DB_COMPENSATION) {
        this.DB_COMPENSATION = DB_COMPENSATION;
    }

    public BigDecimal getDB_YEAR_COMPENSATION() {
        return DB_YEAR_COMPENSATION;
    }

    public void setDB_YEAR_COMPENSATION(BigDecimal DB_YEAR_COMPENSATION) {
        this.DB_YEAR_COMPENSATION = DB_YEAR_COMPENSATION;
    }

    public String getBANK_CODE() {
        return BANK_CODE;
    }

    public void setBANK_CODE(String BANK_CODE) {
        this.BANK_CODE = BANK_CODE == null ? null : BANK_CODE.trim();
    }

    public String getBANK_NAME() {
        return BANK_NAME;
    }

    public void setBANK_NAME(String BANK_NAME) {
        this.BANK_NAME = BANK_NAME == null ? null : BANK_NAME.trim();
    }

    public String getCLAIM_PAYMENT_ACCOUNT() {
        return CLAIM_PAYMENT_ACCOUNT;
    }

    public void setCLAIM_PAYMENT_ACCOUNT(String CLAIM_PAYMENT_ACCOUNT) {
        this.CLAIM_PAYMENT_ACCOUNT = CLAIM_PAYMENT_ACCOUNT == null ? null : CLAIM_PAYMENT_ACCOUNT.trim();
    }

    public String getACCOUNT_HOLDERS() {
        return ACCOUNT_HOLDERS;
    }

    public void setACCOUNT_HOLDERS(String ACCOUNT_HOLDERS) {
        this.ACCOUNT_HOLDERS = ACCOUNT_HOLDERS == null ? null : ACCOUNT_HOLDERS.trim();
    }

    public String getCONTRACT_NUMBER() {
        return CONTRACT_NUMBER;
    }

    public void setCONTRACT_NUMBER(String CONTRACT_NUMBER) {
        this.CONTRACT_NUMBER = CONTRACT_NUMBER == null ? null : CONTRACT_NUMBER.trim();
    }

    public String getCASE_NUMBER() {
        return CASE_NUMBER;
    }

    public void setCASE_NUMBER(String CASE_NUMBER) {
        this.CASE_NUMBER = CASE_NUMBER == null ? null : CASE_NUMBER.trim();
    }

    public Date getCREARE_DATE() {
        return CREARE_DATE;
    }

    public void setCREARE_DATE(Date CREARE_DATE) {
        this.CREARE_DATE = CREARE_DATE;
    }

    public String getIS_CANCEL() {
        return IS_CANCEL;
    }

    public void setIS_CANCEL(String IS_CANCEL) {
        this.IS_CANCEL = IS_CANCEL == null ? null : IS_CANCEL.trim();
    }

    public String getIS_CANCEL_SUCCESS() {
        return IS_CANCEL_SUCCESS;
    }

    public void setIS_CANCEL_SUCCESS(String IS_CANCEL_SUCCESS) {
        this.IS_CANCEL_SUCCESS = IS_CANCEL_SUCCESS == null ? null : IS_CANCEL_SUCCESS.trim();
    }

    public Date getCANCEL_DATE() {
        return CANCEL_DATE;
    }

    public void setCANCEL_DATE(Date CANCEL_DATE) {
        this.CANCEL_DATE = CANCEL_DATE;
    }

    public String getCANCEL_FAULT_REASON() {
        return CANCEL_FAULT_REASON;
    }

    public void setCANCEL_FAULT_REASON(String CANCEL_FAULT_REASON) {
        this.CANCEL_FAULT_REASON = CANCEL_FAULT_REASON == null ? null : CANCEL_FAULT_REASON.trim();
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS == null ? null : STATUS.trim();
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG == null ? null : MSG.trim();
    }
}