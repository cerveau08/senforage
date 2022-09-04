package sn.isi.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private Double consomationMois;
	@Column(length = 20, nullable = false)
	private Double prixLittre;
	@Temporal(TemporalType.TIMESTAMP)
    private Calendar dateCreation;
	@Temporal(TemporalType.DATE)
    private Calendar dateDebut;
	@Temporal(TemporalType.DATE)
    private Calendar dateFin;
	@Temporal(TemporalType.DATE)
    private Calendar dateLimit;
	@Temporal(TemporalType.DATE)
    private Calendar datePaiement;
	@Column(length = 20)
	private Double montantAPayer;
	@Column(length = 20)
	private Double sommeDonnee;
	@ManyToOne()
	private Compteur compteur;
	@OneToMany(mappedBy = "facture")
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
