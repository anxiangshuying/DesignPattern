package com.sys.entity;

import java.util.Date;

public class Paiement {
	private int idPayer;
	private int idUtili;
	private int idRser;
	private int code;
	private Date payerDate;
	private String numCarte;
	public int getIdPayer() {
		return idPayer;
	}
	public void setIdPayer(int idPayer) {
		this.idPayer = idPayer;
	}
	public int getIdUtili() {
		return idUtili;
	}
	public void setIdUtili(int idUtili) {
		this.idUtili = idUtili;
	}
	public int getIdRser() {
		return idRser;
	}
	public void setIdRser(int idRser) {
		this.idRser = idRser;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getPayerDate() {
		return payerDate;
	}
	public void setPayerDate(Date payerDate) {
		this.payerDate = payerDate;
	}
	public String getNumCarte() {
		return numCarte;
	}
	public void setNumCarte(String numCarte) {
		this.numCarte = numCarte;
	}
	
}
