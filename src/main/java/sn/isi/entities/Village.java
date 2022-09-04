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
public class Village {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 100, nullable = false)
	private String nom;
	@Column(length = 100, nullable = false)
	private String identifiant;
	@OneToOne()
	private Client chef;
	@OneToMany(mappedBy = "village")
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
