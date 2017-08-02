package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {

	private String nom;
	private String matricule;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String NumSecuriteSocial;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;

	public Collaborateur(String nom, String matricule, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecuriteSocial, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.nom = nom;
		this.matricule = matricule;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		NumSecuriteSocial = numSecuriteSocial;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	public String getNom() {
		return nom;
	}

	public String getMatricule() {
		return matricule;
	}

	public String getPrenom() {
		return prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public String getNumSecuriteSocial() {
		return NumSecuriteSocial;
	}

	public String getPhoto() {
		return photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}

}
