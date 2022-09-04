package sn.isi.dto;

import java.util.Calendar;

import sn.isi.entities.Action;
import sn.isi.entities.Facture;

public class HistoriquefactureDto {
	private int id;
    private Calendar dateAction;
	private String commentaire;
	private Facture facture;
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
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
}
