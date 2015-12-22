package com.models;

import java.sql.Date;

public class EMAIL {
	private int ID;
	private String SUBJECT;
	private String BODY;
	private Date DATE;
	private int CONVERSATION_ID;
	private String SENDER;
	private String FORWARDER;
	
	
	public EMAIL(int iD, String sUBJECT, String bODY, Date dATE,
			int cONVERSATION_ID, String sENDER, String fORWARDER) {
		super();
		ID = iD;
		SUBJECT = sUBJECT;
		BODY = bODY;
		DATE = dATE;
		CONVERSATION_ID = cONVERSATION_ID;
		SENDER = sENDER;
		FORWARDER = fORWARDER;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSUBJECT() {
		return SUBJECT;
	}
	public void setSUBJECT(String sUBJECT) {
		SUBJECT = sUBJECT;
	}
	public String getBODY() {
		return BODY;
	}
	public void setBODY(String bODY) {
		BODY = bODY;
	}
	public Date getDATE() {
		return DATE;
	}
	public void setDATE(Date dATE) {
		DATE = dATE;
	}
	public int getCONVERSATION_ID() {
		return CONVERSATION_ID;
	}
	public void setCONVERSATION_ID(int cONVERSATION_ID) {
		CONVERSATION_ID = cONVERSATION_ID;
	}
	public String getSENDER() {
		return SENDER;
	}
	public void setSENDER(String sENDER) {
		SENDER = sENDER;
	}
	public String getFORWARDER() {
		return FORWARDER;
	}
	public void setFORWARDER(String fORWARDER) {
		FORWARDER = fORWARDER;
	}
	///////////////////////////////
	
	
}
