package sn.isi.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Abonnement {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
    private Calendar dateAbonnement;
	@Column(length = 100, nullable = false)
	private String numero;
	@Column(length = 500, nullable = false)
	private String description;
	@Column(length = 20, nullable = false)
	private String etat;
	@OneToOne(mappedBy = "abonnement")
	private Compteur compteur;
	@ManyToOne()
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
