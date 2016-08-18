package com.sysnet.dbsb.model.common;

import java.math.BigDecimal;
import java.util.Date;

public class DBPayment extends DBPaymentKey {
    private BigDecimal DB_COMPENSATION;

    private BigDecimal FIT_AMOUNT;
    
    private BigDecimal FIT_AMOUNT_YEAR;

	private BigDecimal DB_COMPENSATION_YEAR;

	private Date OUTDATE;

    private String UPLOADFLAG;

    private Date UPLOADDATE;

    private String COMMENTT;

    private String MSG;

    private BigDecimal UPLOADCOUNT;

    private String ISPRINT;

    private Date CREATEDATE;

    public String getCOMMENTT() {
        return COMMENTT;
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public BigDecimal getDB_COMPENSATION() {
        return DB_COMPENSATION;
    }

    public BigDecimal getDB_COMPENSATION_YEAR() {
        return DB_COMPENSATION_YEAR;
    }

    /**
	* @return fIT_AMOUNT
	*/
	public BigDecimal getFIT_AMOUNT() {
		return FIT_AMOUNT;
	}

    public BigDecimal getFIT_AMOUNT_YEAR() {
        return FIT_AMOUNT_YEAR;
    }

    public String getISPRINT() {
        return ISPRINT;
    }

    public String getMSG() {
        return MSG;
    }

    public Date getOUTDATE() {
        return OUTDATE;
    }

    public BigDecimal getUPLOADCOUNT() {
        return UPLOADCOUNT;
    }

    public Date getUPLOADDATE() {
        return UPLOADDATE;
    }

    public String getUPLOADFLAG() {
        return UPLOADFLAG;
    }

    public void setCOMMENTT(String COMMENTT) {
        this.COMMENTT = COMMENTT == null ? null : COMMENTT.trim();
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }

    public void setDB_COMPENSATION(BigDecimal DB_COMPENSATION) {
        this.DB_COMPENSATION = DB_COMPENSATION;
    }

    public void setDB_COMPENSATION_YEAR(BigDecimal DB_COMPENSATION_YEAR) {
        this.DB_COMPENSATION_YEAR = DB_COMPENSATION_YEAR;
    }

    /**
	* @param fIT_AMOUNT 要设置的 fIT_AMOUNT
	*/
	public void setFIT_AMOUNT(BigDecimal fIT_AMOUNT) {
		FIT_AMOUNT = fIT_AMOUNT;
	}

    public void setFIT_AMOUNT_YEAR(BigDecimal FIT_AMOUNT_YEAR) {
        this.FIT_AMOUNT_YEAR = FIT_AMOUNT_YEAR;
    }

    public void setISPRINT(String ISPRINT) {
        this.ISPRINT = ISPRINT == null ? null : ISPRINT.trim();
    }

    public void setMSG(String MSG) {
        this.MSG = MSG == null ? null : MSG.trim();
    }

    public void setOUTDATE(Date OUTDATE) {
        this.OUTDATE = OUTDATE;
    }

    public void setUPLOADCOUNT(BigDecimal UPLOADCOUNT) {
        this.UPLOADCOUNT = UPLOADCOUNT;
    }

    public void setUPLOADDATE(Date UPLOADDATE) {
        this.UPLOADDATE = UPLOADDATE;
    }

    public void setUPLOADFLAG(String UPLOADFLAG) {
        this.UPLOADFLAG = UPLOADFLAG == null ? null : UPLOADFLAG.trim();
    }
}