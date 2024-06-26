package com.example.ommpproject.projectommp.models;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private int cin;
    private String nomClient;
    private String prenomClient;
    private String dateNais;
    private String situation;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "idClient")
    private List<Compte> comptes = new ArrayList<>();

    public Client(Long idClient, int cin, String nomClient, String prenomClient, String dateNais, String situation) {
        this.idClient = idClient;
        this.cin = cin;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.dateNais = dateNais;
        this.situation = situation;
    }
    

    public Client(Long idClient, int cin, String nomClient, String prenomClient, String dateNais, String situation,
			List<Compte> comptes, User user) {
		super();
		this.idClient = idClient;
		this.cin = cin;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateNais = dateNais;
		this.situation = situation;
		this.comptes = comptes;
		this.user = user;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Client(Long idClient, int cin, String nomClient, String prenomClient, String dateNais, String situation,
			List<Compte> comptes) {
		super();
		this.idClient = idClient;
		this.cin = cin;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.dateNais = dateNais;
		this.situation = situation;
		this.comptes = comptes;
	}
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;


	public List<Compte> getComptes() {
		return comptes;
	}


	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}


	public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getDateNais() {
        return dateNais;
    }

    public void setDateNais(String dateNais) {
        this.dateNais = dateNais;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

  

  

	public Client() {
        super();
    }

    @Override
    public String toString() {
        return "Client{" +
                "idClient=" + idClient +
                ", cin=" + cin +
                ", nomClient='" + nomClient + '\'' +
                ", prenomClient='" + prenomClient + '\'' +
                ", dateNais='" + dateNais + '\'' +
                ", situation='" + situation + '\'' +
        
                '}';
    }
}
