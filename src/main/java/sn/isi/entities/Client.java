package sn.isi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String nom;
	@Column(length = 100, nullable = false)
	private String prenom;
	@Column(length = 500, nullable = false)
	private String adresse;
	@Column(length = 20, nullable = false)
	private int telephone;
	@OneToOne(mappedBy = "chef")
	private Village villagechef;
	@ManyToOne()
	private Village village;
	@OneToMany(mappedBy = "client")
	private List<Abonnement> abonnement;
	
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public Village getVillagechef() {
		return villagechef;
	}
	public void setVillagechef(Village villagechef) {
		this.villagechef = villagechef;
	}
	public Village getVillage() {
		return village;
	}
	public void setVillage(Village village) {
		this.village = village;
	}
	public List<Historiqueclient> getHistoriqueclient() {
		return historiqueclient;
	}
	public void setHistoriqueclient(List<Historiqueclient> historiqueclient) {
		this.historiqueclient = historiqueclient;
	}
	public List<Abonnement> getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(List<Abonnement> abonnement) {
		this.abonnement = abonnement;
	}
	
}
