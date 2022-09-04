package sn.isi.entities;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Historiquefacture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
    private Calendar dateAction;
	@Column(length = 500)
	private String commentaire;
	@ManyToOne()
	private Facture facture;
	@ManyToOne()
	private User user;
	@ManyToOne()
	private Action action;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDateAction() {
		return dateAction;
	}
	public void setDateAction(Calendar dateAction) {
		this.dateAction = dateAction;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
}
