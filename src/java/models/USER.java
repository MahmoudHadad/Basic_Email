package com.models;

import java.sql.Date;
import java.util.ArrayList;

public class USER {
	private String EMAIL_ADDRESS;
	private String PASSWORD;
	private String FIRST_NAME;
	private String LAST_NAME;
	private String GENDER;
	private Date DATE_OF_BIRTH;
	private String MOBILE_NUMBER;
	private String ADDRESS;
	private int ZIP_CODE;
	
	
	public USER(String eMAIL_ADDRESS, String pASSWORD, String fIRST_NAME,
			String lAST_NAME, String gENDER, Date dATE_OF_BIRTH,
			String mOBILE_NUMBER, String aDDRESS, int zIP_CODE) {
		super();
		EMAIL_ADDRESS = eMAIL_ADDRESS;
		PASSWORD = pASSWORD;
		FIRST_NAME = fIRST_NAME;
		LAST_NAME = lAST_NAME;
		GENDER = gENDER;
		DATE_OF_BIRTH = dATE_OF_BIRTH;
		MOBILE_NUMBER = mOBILE_NUMBER;
		ADDRESS = aDDRESS;
		ZIP_CODE = zIP_CODE;
	}


	public String getEMAIL_ADDRESS() {
		return EMAIL_ADDRESS;
	}


	public void setEMAIL_ADDRESS(String eMAIL_ADDRESS) {
		EMAIL_ADDRESS = eMAIL_ADDRESS;
	}


	public String getPASSWORD() {
		return PASSWORD;
	}


	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}


	public String getFIRST_NAME() {
		return FIRST_NAME;
	}


	public void setFIRST_NAME(String fIRST_NAME) {
		FIRST_NAME = fIRST_NAME;
	}


	public String getLAST_NAME() {
		return LAST_NAME;
	}


	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}


	public String getGENDER() {
		return GENDER;
	}


	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}


	public Date getDATE_OF_BIRTH() {
		return DATE_OF_BIRTH;
	}


	public void setDATE_OF_BIRTH(Date dATE_OF_BIRTH) {
		DATE_OF_BIRTH = dATE_OF_BIRTH;
	}


	public String getMOBILE_NUMBER() {
		return MOBILE_NUMBER;
	}


	public void setMOBILE_NUMBER(String mOBILE_NUMBER) {
		MOBILE_NUMBER = mOBILE_NUMBER;
	}


	public String getADDRESS() {
		return ADDRESS;
	}


	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}


	public int getZIP_CODE() {
		return ZIP_CODE;
	}


	public void setZIP_CODE(int zIP_CODE) {
		ZIP_CODE = zIP_CODE;
	}
	
	////////////////////////////////////////////////////////////////////////////
	public static USER login (String email, String password){
		
		return null;
	}
	
	///////////////////////////////////////////////////////
	// create user with passed parameters then call signup function
	public boolean signup(){
		return false;
		
	}
	///////////////////////////////
	public ArrayList<INBOX_EMAIL> getInbox(){
		return null;
		
	}
}
