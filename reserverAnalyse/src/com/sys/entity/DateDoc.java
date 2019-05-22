package com.sys.entity;

public class DateDoc {
	private int idMedecin;
	private String date;
	//0 = Disponible, 1 = En attente de confirmation, 2 = Occupe
	private int state;
	public int getIdMedecin() {
		return idMedecin;
	}
	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
}
