package com.example.ommpproject.projectommp.models;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class DossierCredit {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDossierCredit;
    private int montant;
    private double  nbEcheance;
    private String typeCredit;
    private String unite;
    
    public DossierCredit(Long idDossierCredit, int montant, int nbEcheance, String typeCredit, String unite) {
		super();
		this.idDossierCredit = idDossierCredit;
		this.montant = montant;
		this.nbEcheance = nbEcheance;
		this.typeCredit = typeCredit;
		this.unite = unite;
		
	}
	public String getTypeCredit() {
		return typeCredit;
	}
	public void setTypeCredit(String typeCredit) {
		this.typeCredit = typeCredit;
	}
	public String getUnite() {
		return unite;
	}
	public void setUnite(String unite) {
		this.unite = unite;
	}
	/*@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDossierCredit")
    private List<DemandeCredit> DemandeCredits = new ArrayList<>();*/
	

	public Long getIdDossierCredit() {
		return idDossierCredit;
	}
	public void setIdDossierCredit(Long idDossierCredit) {
		this.idDossierCredit = idDossierCredit;
	}
	public int getMontant() {
		return montant;
	}
	public void setMontant(int montant) {
		this.montant = montant;
	}
	public double getNbEcheance() {
		return nbEcheance;
	}
	public void setNbEcheance(double nbEcheance) {
		this.nbEcheance = nbEcheance;
	}
	
	public DossierCredit() {
		super();
	}
	@Override
	public String toString() {
		return "DossierCredit [idDossierCredit=" + idDossierCredit + ", montant=" + montant + ", nbEcheance="
				+ nbEcheance + "]";
	}
    
}
