package sn.isi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Compteur {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String numero;
	@Column(length = 100, nullable = false)
	private Double cumulconso;
	@Column(length = 100, nullable = false)
	private Double sommeclient;
	@Column(length = 20, nullable = false)
	private String etat;
	@OneToOne()
	private Abonnement abonnement;
	@OneToMany(mappedBy = "compteur")
	private List<Facture> facture;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Double getCumulconso() {
		return cumulconso;
	}
	public void setCumulconso(Double cumulconso) {
		this.cumulconso = cumulconso;
	}
	public Double getSommeclient() {
		return sommeclient;
	}
	public void setSommeclient(Double sommeclient) {
		this.sommeclient = sommeclient;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Abonnement getAbonnement() {
		return abonnement;
	}
	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}
	public List<Facture> getFacture() {
		return facture;
	}
	public void setFacture(List<Facture> facture) {
		this.facture = facture;
	}
	
}
