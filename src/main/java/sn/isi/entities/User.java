package sn.isi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String nom;
	@Column(length = 100, nullable = false)
	private String prenom;
	@Column(length = 100, nullable = false)
	private String email;
	@Column(length = 100, nullable = false)
	private String password;
	@Column(length = 100, nullable = false)
	private String identifiant;
	@Column(length = 10, nullable = false)
	private String etat;
	@ManyToOne()
	private Role role;
	@OneToMany(mappedBy = "user")
	private List<Historiqueclient> historiqueclient;
	@OneToMany(mappedBy = "user")
	private List<Historiquefacture> historiquefacture;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public List<Historiqueclient> getHistoriqueclient() {
		return historiqueclient;
	}
	public void setHistoriqueclient(List<Historiqueclient> historiqueclient) {
		this.historiqueclient = historiqueclient;
	}
	public List<Historiquefacture> getHistoriquefacture() {
		return historiquefacture;
	}
	public void setHistoriquefacture(List<Historiquefacture> historiquefacture) {
		this.historiquefacture = historiquefacture;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
}
