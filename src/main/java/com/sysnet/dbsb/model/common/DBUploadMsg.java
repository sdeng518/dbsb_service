package com.sysnet.dbsb.model.common;

import java.math.BigDecimal;
import java.util.Date;

public class DBUploadMsg extends DBUploadMsgKey {
    private String UPLOADFLAG;

    private Date UPLOADDATE;

    private String COMMENTT;

    private BigDecimal UPLOADCOUNT;

    private Date CREATEDATE;

    public String getUPLOADFLAG() {
        return UPLOADFLAG;
    }

    public void setUPLOADFLAG(String UPLOADFLAG) {
        this.UPLOADFLAG = UPLOADFLAG == null ? null : UPLOADFLAG.trim();
    }

    public Date getUPLOADDATE() {
        return UPLOADDATE;
    }

    public void setUPLOADDATE(Date UPLOADDATE) {
        this.UPLOADDATE = UPLOADDATE;
    }

    public String getCOMMENTT() {
        return COMMENTT;
    }

    public void setCOMMENTT(String COMMENTT) {
        this.COMMENTT = COMMENTT == null ? null : COMMENTT.trim();
    }

    public BigDecimal getUPLOADCOUNT() {
        return UPLOADCOUNT;
    }

    public void setUPLOADCOUNT(BigDecimal UPLOADCOUNT) {
        this.UPLOADCOUNT = UPLOADCOUNT;
    }

    public Date getCREATEDATE() {
        return CREATEDATE;
    }

    public void setCREATEDATE(Date CREATEDATE) {
        this.CREATEDATE = CREATEDATE;
    }
}