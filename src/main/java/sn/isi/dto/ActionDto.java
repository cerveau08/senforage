package sn.isi.dto;

import java.util.List;

import sn.isi.entities.Historiquefacture;

public class ActionDto {
	private int id;
	private String libelle;
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
	public List<Historiquefacture> getHistoriquefacture() {
		return historiquefacture;
	}
	public void setHistoriquefacture(List<Historiquefacture> historiquefacture) {
		this.historiquefacture = historiquefacture;
	}
	
}
