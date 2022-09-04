package sn.isi.dto;

import java.util.Calendar;
import java.util.List;

import sn.isi.entities.Compteur;
import sn.isi.entities.Historiquefacture;

public class FactureDto {
	private int id;
	private Double consomationMois;
	private Double prixLittre;
    private Calendar dateCreation;
    private Calendar dateDebut;
    private Calendar dateFin;
    private Calendar dateLimit;
    private Calendar datePaiement;
	private Double montantAPayer;
	private Double sommeDonnee;
	private Compteur compteur;
	private List<Historiquefacture> historiquefacture;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getConsomationMois() {
		return consomationMois;
	}
	public void setConsomationMois(Double consomationMois) {
		this.consomationMois = consomationMois;
	}
	public Double getPrixLittre() {
		return prixLittre;
	}
	public void setPrixLittre(Double prixLittre) {
		this.prixLittre = prixLittre;
	}
	public Calendar getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Calendar dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Calendar getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Calendar getDateFin() {
		return dateFin;
	}
	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}
	public Calendar getDateLimit() {
		return dateLimit;
	}
	public void setDateLimit(Calendar dateLimit) {
		this.dateLimit = dateLimit;
	}
	public Calendar getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Calendar datePaiement) {
		this.datePaiement = datePaiement;
	}
	public Double getMontantAPayer() {
		return montantAPayer;
	}
	public void setMontantAPayer(Double montantAPayer) {
		this.montantAPayer = montantAPayer;
	}
	public Double getSommeDonnee() {
		return sommeDonnee;
	}
	public void setSommeDonnee(Double sommeDonnee) {
		this.sommeDonnee = sommeDonnee;
	}
	public Compteur getCompteur() {
		return compteur;
	}
	public void setCompteur(Compteur compteur) {
		this.compteur = compteur;
	}
	public List<Historiquefacture> getHistoriquefacture() {
		return historiquefacture;
	}
	public void setHistoriquefacture(List<Historiquefacture> historiquefacture) {
		this.historiquefacture = historiquefacture;
	}
	
}
