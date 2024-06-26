package com.example.ommpproject.projectommp.models;



public class GarantieDto {
	private String nature;
	private String type;
	private int valeur;
	private String devise;

	public GarantieDto() {
	}

	public GarantieDto(String nature, String type, int valeur, String devise) {
		super();
		this.nature = nature;
		this.type = type;
		this.valeur = valeur;
		this.devise = devise;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
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
