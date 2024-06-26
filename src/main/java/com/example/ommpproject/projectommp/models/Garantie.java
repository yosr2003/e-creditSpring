package com.example.ommpproject.projectommp.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Garantie {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idGarantie;
	 
	    private String nature;
	    private String type;
	    private int valeur;
	    private String devise;
		public Garantie(Long idGarantie, String nature, String type, int valeur, String devise) {
			super();
			this.idGarantie = idGarantie;
			this.nature = nature;
			this.type = type;
			this.valeur = valeur;
			this.devise = devise;
		}
		public Long getIdGarantie() {
			return idGarantie;
		}
		public void setIdGarantie(Long idGarantie) {
			this.idGarantie = idGarantie;
		}
		public String getNature() {
			return nature;
		}
		public void setNature(String nature) {
			this.nature = nature;
		}
		public Garantie() {
			super();
		}
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public int getValeur() {
			return valeur;
		}
		public void setValeur(int valeur) {
			this.valeur = valeur;
		}
		public String getDevise() {
			return devise;
		}
		public void setDevise(String devise) {
			this.devise = devise;
		}
	    
	    
}
