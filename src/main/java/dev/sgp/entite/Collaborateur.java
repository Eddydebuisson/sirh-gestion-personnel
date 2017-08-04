package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "collaborateur")
@NamedQueries({
		@NamedQuery(name = "Collaborateur.findByDepartement", query = "select c from Collaborateur c where c.departement.id=:dep"),
		@NamedQuery(name = "Collaborateur.findByMatricule", query = "select c from Collaborateur c where c.matricule = :mat") })
public class Collaborateur {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String matricule;
	private String prenom;
	private LocalDate dateDeNaissance;
	private String adresse;
	private String numSecuriteSocial;
	private String photo;
	private ZonedDateTime dateHeureCreation;
	private Boolean actif;
	private String email;
	@ManyToOne
	@JoinColumn(name = "departement")
	private Departement departement;
	private String poste;
	@ManyToOne
	@JoinColumn(name = "banque")
	private Bancaire banque;

	public Collaborateur() {
	}

	public Collaborateur(String nom, String matricule, String prenom, LocalDate dateDeNaissance, String adresse,
			String numSecuriteSocial, String photo, ZonedDateTime dateHeureCreation, Boolean actif) {
		super();
		this.nom = nom;
		this.matricule = matricule;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecuriteSocial = numSecuriteSocial;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
	}

	public Collaborateur(String nom, String matricule, String prenom, LocalDate dateDeNaissance,
			String adresse, String numSecuriteSocial, String photo, ZonedDateTime dateHeureCreation, Boolean actif,
			String email, Departement departement, String poste, Bancaire banque) {
		super();
		this.nom = nom;
		this.matricule = matricule;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.adresse = adresse;
		this.numSecuriteSocial = numSecuriteSocial;
		this.photo = photo;
		this.dateHeureCreation = dateHeureCreation;
		this.actif = actif;
		this.email = email;
		this.departement = departement;
		this.poste = poste;
		this.banque = banque;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumSecuriteSocial() {
		return numSecuriteSocial;
	}

	public void setNumSecuriteSocial(String numSecuriteSocial) {
		this.numSecuriteSocial = numSecuriteSocial;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}

	public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Departement getDepartement() {
		return departement;
	}

	public void setDepartement(Departement departement) {
		this.departement = departement;
	}

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public Bancaire getBanque() {
		return banque;
	}

	public void setBanque(Bancaire banque) {
		this.banque = banque;
	}

}
