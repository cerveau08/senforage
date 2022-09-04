package sn.isi.dto;


public class DureecoupureDto {
	private int id;
	private Double minMontant;
	private Double maxMontant;
	private int nombreJoursDateFin;
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
