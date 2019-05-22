package com.sys.entity;

import java.util.Date;

public class Reservation {
	private int idReser;
	private int idUtili;
	private int idType;
	private Date date;
	public int getIdReser() {
		return idReser;
	}
	public void setIdReser(int idReser) {
		this.idReser = idReser;
	}
	public int getIdUtili() {
		return idUtili;
	}
	public void setIdUtili(int idUtili) {
		this.idUtili = idUtili;
	}
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	

}
