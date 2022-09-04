package sn.isi.dto;

import java.util.List;

import sn.isi.entities.Abonnement;
import sn.isi.entities.Village;

public class ClientDto {
	private int id;
	private String nom;
	private String prenom;
	private String adresse;
	private int telephone;
	private Village villagechef;
	private Village village;
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
	public List<Abonnement> getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(List<Abonnement> abonnement) {
		this.abonnement = abonnement;
	}
	
}
