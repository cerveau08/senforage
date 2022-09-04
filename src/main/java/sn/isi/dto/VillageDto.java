package sn.isi.dto;

import java.util.List;


import sn.isi.entities.Client;

public class VillageDto {
	private int id;
	private String nom;
	private String identifiant;
	private Client chef;
	private List<Client> client;
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
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public Client getChef() {
		return chef;
	}
	public void setChef(Client chef) {
		this.chef = chef;
	}
	public List<Client> getClient() {
		return client;
	}
	public void setClient(List<Client> client) {
		this.client = client;
	}
	
}
