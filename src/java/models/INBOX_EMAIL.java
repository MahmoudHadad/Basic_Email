package com.models;

import java.sql.Date;

public class INBOX_EMAIL {
	private String RECEIVER;
	private int ID;
	private int CONVERSATION_ID;
	private boolean SEEN;
	private boolean TRASHED;
	private boolean ARCHIEVED;
	public INBOX_EMAIL(String rECEIVER, int iD, int cONVERSATION_ID,
			boolean sEEN, boolean tRASHED, boolean aRCHIEVED) {
		super();
		RECEIVER = rECEIVER;
		ID = iD;
		CONVERSATION_ID = cONVERSATION_ID;
		SEEN = sEEN;
		TRASHED = tRASHED;
		ARCHIEVED = aRCHIEVED;
	}
	public String getRECEIVER() {
		return RECEIVER;
	}
	public void setRECEIVER(String rECEIVER) {
		RECEIVER = rECEIVER;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCONVERSATION_ID() {
		return CONVERSATION_ID;
	}
	public void setCONVERSATION_ID(int cONVERSATION_ID) {
		CONVERSATION_ID = cONVERSATION_ID;
	}
	public boolean isSEEN() {
		return SEEN;
	}
	public void setSEEN(boolean sEEN) {
		SEEN = sEEN;
	}
	public boolean isTRASHED() {
		return TRASHED;
	}
	public void setTRASHED(boolean tRASHED) {
		TRASHED = tRASHED;
	}
	public boolean isARCHIEVED() {
		return ARCHIEVED;
	}
	public void setARCHIEVED(boolean aRCHIEVED) {
		ARCHIEVED = aRCHIEVED;
	}
	
	////////////////////////////////////////////////////
	
}
