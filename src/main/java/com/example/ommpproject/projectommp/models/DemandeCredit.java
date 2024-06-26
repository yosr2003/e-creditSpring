package com.example.ommpproject.projectommp.models;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class DemandeCredit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDemandeCredit;
    private int numeroDemande;
    private String dateDemande;
    private String nomSuivi;
    private Date dateRelation;
    private String statut;
    
    
    public DemandeCredit(Long idDemandeCredit, int numeroDemande, String dateDemande, String nomSuivi,
			Date dateRelation, String statut, int montant, int nbEcheance, String typeCredit, String unite,
			String descripObservation, Compte compte, List<Garantie> garanties, List<PiecesJointes> piecesJointes) {
		super();
		this.idDemandeCredit = idDemandeCredit;
		this.numeroDemande = numeroDemande;
		this.dateDemande = dateDemande;
		this.nomSuivi = nomSuivi;
		this.dateRelation = dateRelation;
		this.statut = statut;
		this.montant = montant;
		this.nbEcheance = nbEcheance;
		this.typeCredit = typeCredit;
		this.unite = unite;
		this.descripObservation = descripObservation;
		this.compte = compte;
		this.garanties = garanties;
		this.piecesJointes = piecesJointes;
	}



	public String getStatut() {
		return statut;
	}



	public void setStatut(String statut) {
		this.statut = statut;
	}

	private int montant;
    private int  nbEcheance;
    private String typeCredit;
    private  String unite;
    private String descripObservation;
    public DemandeCredit(Long idDemandeCredit, int numeroDemande, String dateDemande, String nomSuivi,
			Date dateRelation, int montant, int nbEcheance, String typeCredit, String unite, String descripObservation,
			Compte compte, List<Garantie> garanties, List<PiecesJointes> piecesJointes) {
		super();
		this.idDemandeCredit = idDemandeCredit;
		this.numeroDemande = numeroDemande;
		this.dateDemande = dateDemande;
		this.nomSuivi = nomSuivi;
		this.dateRelation = dateRelation;
		this.montant = montant;
		this.nbEcheance = nbEcheance;
		this.typeCredit = typeCredit;
		this.unite = unite;
		this.descripObservation = descripObservation;
		this.compte = compte;
		this.garanties = garanties;
		this.piecesJointes = piecesJointes;
	}



	public int getMontant() {
		return montant;
	}



	public void setMontant(int montant) {
		this.montant = montant;
	}



	public int getNbEcheance() {
		return nbEcheance;
	}



	public void setNbEcheance(int nbEcheance) {
		this.nbEcheance = nbEcheance;
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



	public String getDescripObservation() {
		return descripObservation;
	}



	public void setDescripObservation(String descripObservation) {
		this.descripObservation = descripObservation;
	}

	@ManyToOne
    private Compte compte;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDemandeCredit")
    private List<Garantie> garanties = new ArrayList<>();
    

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idDemandeCredit")
    private List<PiecesJointes> piecesJointes = new ArrayList<>();
    
    
   /* @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idObs", referencedColumnName = "idObs")
    private Observation observation;*/





	

	public List<PiecesJointes> getPiecesJointes() {
		return piecesJointes;
	}

	public void setPiecesJointes(List<PiecesJointes> piecesJointes) {
		this.piecesJointes = piecesJointes;
	}



	public List<Garantie> getGaranties() {
		return garanties;
	}

	public void setGaranties(List<Garantie> garanties) {
		this.garanties = garanties;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}



	public DemandeCredit() {
		super();
	}



	// Ajoutez d'autres attributs nécessaires pour votre demande de crédit

    public Date getDateRelation() {
		return dateRelation;
	}

	public void setDateRelation(Date dateRelation) {
		this.dateRelation = dateRelation;
	}



  

    public Long getIdDemandeCredit() {
        return idDemandeCredit;
    }

    public void setIdDemandeCredit(Long idDemandeCredit) {
        this.idDemandeCredit = idDemandeCredit;
    }

    public int getNumeroDemande() {
        return numeroDemande;
    }

    public void setNumeroDemande(int numeroDemande) {
        this.numeroDemande = numeroDemande;
    }

    public String getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(String dateDemande) {
        this.dateDemande = dateDemande;
    }

 


    // Ajoutez les getters et setters pour les autres attributs

    @Override
    public String toString() {
        return "DemandeCredit{" +
                "idDemandeCredit=" + idDemandeCredit +
                ", numeroDemande=" + numeroDemande +
                ", dateDemande='" + dateDemande + '\'' +
                ", idSuivi=" + nomSuivi +
                // Ajoutez les autres attributs à la représentation string si nécessaire
                '}';
    }

	public DemandeCredit(Long idDemandeCredit, int numeroDemande, String dateDemande, String nomSuivi,
			Date dateRelation, Compte compte, List<Garantie> garanties) {
		super();
		this.idDemandeCredit = idDemandeCredit;
		this.numeroDemande = numeroDemande;
		this.dateDemande = dateDemande;
		this.nomSuivi = nomSuivi;
		this.dateRelation = dateRelation;
		this.compte = compte;
		this.garanties = garanties;
	}

	public String getNomSuivi() {
		return nomSuivi;
	}

	public void setNomSuivi(String nomSuivi) {
		this.nomSuivi = nomSuivi;
	}
}
