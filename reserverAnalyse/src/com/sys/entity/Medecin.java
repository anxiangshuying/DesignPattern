package com.sys.entity;

import java.util.List;

public class Medecin {
	private int idMedecin;
	private String nom;
	private String prenom;
	private String numSecuSoci;
	private double salaire;
	private TypeAnalyse analyse;

	public TypeAnalyse getAnalyse() {
		return analyse;
	}

	public void setAnalyse(TypeAnalyse analyse) {
		this.analyse = analyse;
	}

	public int getIdMedecin() {
		return idMedecin;
	}

	public void setIdMedecin(int idMedecin) {
		this.idMedecin = idMedecin;
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

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

}
