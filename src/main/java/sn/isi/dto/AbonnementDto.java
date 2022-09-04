package sn.isi.dto;

import java.util.Calendar;

import sn.isi.entities.Client;
import sn.isi.entities.Compteur;

public class AbonnementDto {
	
	private int id;
    private Calendar dateAbonnement;
	private String numero;
	private String description;
	private String etat;
	private Compteur compteur;
	private Client client;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDateAbonnement() {
		return dateAbonnement;
	}
	public void setDateAbonnement(Calendar dateAbonnement) {
		this.dateAbonnement = dateAbonnement;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Compteur getCompteur() {
		return compteur;
	}
	public void setCompteur(Compteur compteur) {
		this.compteur = compteur;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
}
