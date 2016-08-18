package com.sysnet.dbsb.model.common;

import java.util.Date;

public class DBMessage {
    private String ID;

    private String BUS_CODE;

    private String BUS_SUB_CODE;

    private String REQUEST;

	private String RESPONSE;

	private Date UPDATEDATE;

	public String getBUS_CODE() {
        return BUS_CODE;
    }

	public String getBUS_SUB_CODE() {
        return BUS_SUB_CODE;
    }

    public String getID() {
        return ID;
    }

    /**
	* @return rEQUEST
	*/
	public String getREQUEST() {
		return REQUEST;
	}

    /**
	* @return rESPONSE
	*/
	public String getRESPONSE() {
		return RESPONSE;
	}

    public Date getUPDATEDATE() {
        return UPDATEDATE;
    }

    public void setBUS_CODE(String BUS_CODE) {
        this.BUS_CODE = BUS_CODE == null ? null : BUS_CODE.trim();
    }

    public void setBUS_SUB_CODE(String BUS_SUB_CODE) {
        this.BUS_SUB_CODE = BUS_SUB_CODE == null ? null : BUS_SUB_CODE.trim();
    }

    public void setID(String ID) {
        this.ID = ID == null ? null : ID.trim();
    }

    /**
	* @param rEQUEST 要设置的 rEQUEST
	*/
	public void setREQUEST(String rEQUEST) {
		REQUEST = rEQUEST;
	}
   
    /**
	* @param rESPONSE 要设置的 rESPONSE
	*/
	public void setRESPONSE(String rESPONSE) {
		RESPONSE = rESPONSE;
	}

    public void setUPDATEDATE(Date UPDATEDATE) {
        this.UPDATEDATE = UPDATEDATE;
    }
}