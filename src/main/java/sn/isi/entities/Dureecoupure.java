package sn.isi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dureecoupure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(length = 10, nullable = false)
	private Double minMontant;
	@Column(length = 10, nullable = false)
	private Double maxMontant;
	@Column(length = 2, nullable = false)
	private int nombreJoursDateFin;
	@Column(length = 2, nullable = false)
	private int nombreJoursDateLimit;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getMinMontant() {
		return minMontant;
	}
	public void setMinMontant(Double minMontant) {
		this.minMontant = minMontant;
	}
	public Double getMaxMontant() {
		return maxMontant;
	}
	public void setMaxMontant(Double maxMontant) {
		this.maxMontant = maxMontant;
	}
	public int getNombreJoursDateFin() {
		return nombreJoursDateFin;
	}
	public void setNombreJoursDateFin(int nombreJoursDateFin) {
		this.nombreJoursDateFin = nombreJoursDateFin;
	}
	public int getNombreJoursDateLimit() {
		return nombreJoursDateLimit;
	}
	public void setNombreJoursDateLimit(int nombreJoursDateLimit) {
		this.nombreJoursDateLimit = nombreJoursDateLimit;
	}
	
}
