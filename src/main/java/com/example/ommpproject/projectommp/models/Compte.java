package com.example.ommpproject.projectommp.models;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCompte;
    private int numCompte;
    private String dateOuv;
    private String devise;



	

	public Compte(Long idCompte, int numCompte, String dateOuv, String devise) {
		super();
		this.idCompte = idCompte;
		this.numCompte = numCompte;
		this.dateOuv = dateOuv;
		this.devise = devise;
	}

	public String getDevise() {
		return devise;
	}

	public void setDevise(String devise) {
		this.devise = devise;
	}

	/*
	 * @OneToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "idCompte") private List<DemandeCredit> demandesCredit =
	 * new ArrayList<>();
	 */
    public Compte(Long idCompte, int numCompte, String dateOuv) {
        this.idCompte = idCompte;
        this.numCompte = numCompte;
        this.dateOuv = dateOuv;
    }

    public Compte() {
        super();
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public int getNumCompte() {
        return numCompte;
    }

    public void setNumCompte(int numCompte) {
       this.numCompte = numCompte;
    }

    public String getDateOuv() {
        return dateOuv;
    }

    public void setDateOuv(String dateOuv) {
        this.dateOuv = dateOuv;
    }

	/*
	 * public List<DemandeCredit> getDemandesCredit() { return demandesCredit; }
	 * 
	 * public void setDemandesCredit(List<DemandeCredit> demandesCredit) {
	 * this.demandesCredit = demandesCredit; }
	 */

    public String toString() {
        return "Compte{" +
                "idCompte=" + idCompte +
                ", NumCompte=" + numCompte +
                ", DateOuv='" + dateOuv + '\'' +
                '}';
    }


}
