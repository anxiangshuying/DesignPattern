package com.sys.entity;

import java.util.List;

public class TypeAnalyse {
	private int idType;
	private String description;
	private double prix;
	private List<Medecin> analyse;

	public List<Medecin> getAnalyse() {
		return analyse;
	}
	public void setAnalyse(List<Medecin> analyse) {
		this.analyse = analyse;
	}
	public double getPrix() {
		return prix;
	}
	public int getIdType() {
		return idType;
	}
	public void setIdType(int idType) {
		this.idType = idType;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}
