package sn.isi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Action {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String libelle;
	@OneToMany(mappedBy = "action")
	private List<Historiqueclient> historiqueclient;
	@OneToMany(mappedBy = "action")
	private List<Historiquefacture> historiquefacture;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
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
	
}
