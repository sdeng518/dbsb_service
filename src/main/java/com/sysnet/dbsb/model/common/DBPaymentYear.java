package com.sysnet.dbsb.model.common;

import java.math.BigDecimal;
import java.util.Date;

public class DBPaymentYear extends DBPaymentYearKey {
    private BigDecimal DB_COMPENSATION_YEAR;

    private BigDecimal DB_FEE_YEAR;

    private Date CREATE_DATE;

    private String NOTE;

    public BigDecimal getDB_COMPENSATION_YEAR() {
        return DB_COMPENSATION_YEAR;
    }

    public void setDB_COMPENSATION_YEAR(BigDecimal DB_COMPENSATION_YEAR) {
        this.DB_COMPENSATION_YEAR = DB_COMPENSATION_YEAR;
    }

    public BigDecimal getDB_FEE_YEAR() {
        return DB_FEE_YEAR;
    }

    public void setDB_FEE_YEAR(BigDecimal DB_FEE_YEAR) {
        this.DB_FEE_YEAR = DB_FEE_YEAR;
    }

    public Date getCREATE_DATE() {
        return CREATE_DATE;
    }

    public void setCREATE_DATE(Date CREATE_DATE) {
        this.CREATE_DATE = CREATE_DATE;
    }

    public String getNOTE() {
        return NOTE;
    }

    public void setNOTE(String NOTE) {
        this.NOTE = NOTE == null ? null : NOTE.trim();
    }
}