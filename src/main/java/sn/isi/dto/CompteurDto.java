package sn.isi.dto;

import java.util.List;

import sn.isi.entities.Abonnement;
import sn.isi.entities.Facture;

public class CompteurDto {
	private int id;
	private String numero;
	private Double cumulconso;
	private Double sommeclient;
	private String etat;
	private Abonnement abonnement;
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
