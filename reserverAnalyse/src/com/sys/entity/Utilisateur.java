package com.sys.entity;

public class Utilisateur {
	private int idUtili;
	private String nom;
	private String prenom;
	private String numSecuSoci;
	public int getIdUtilisateur() {
		return idUtili;
	}
	public void setIdUtilisateur(int idUtili) {
		this.idUtili = idUtili;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNumSecuSoci() {
		return numSecuSoci;
	}
	public void setNumSecuSoci(String numSecuSoci) {
		this.numSecuSoci = numSecuSoci;
	}
	
}
