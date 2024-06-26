package com.example.ommpproject.projectommp.models;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class PiecesJointes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPiecesJointes;
    private String nomPiece;
    private boolean statut;
    
    
    private String name;

    private String type;

    @Lob
    private byte[] data;
    public PiecesJointes(Long idPiecesJointes, String nomPiece, boolean statut, String name, String type, byte[] data) {
		super();
		this.idPiecesJointes = idPiecesJointes;
		this.nomPiece = nomPiece;
		this.statut = statut;
		this.name = name;
		this.type = type;
		this.data = data;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getData() {
		return data;
	}
	public void setData(byte[] data) {
		this.data = data;
	}
	public PiecesJointes(Long idPiecesJointes, String nomPiece, boolean statut) {
		super();
		this.idPiecesJointes = idPiecesJointes;
		this.nomPiece = nomPiece;
		this.statut = statut;
	}
	public String getNomPiece() {
		return nomPiece;
	}
	public void setNomPiece(String nomPiece) {
		this.nomPiece = nomPiece;
	}
	
	
	
	public Long getIdPiecesJointes() {
		return idPiecesJointes;
	}
	public void setIdPiecesJointes(Long idPiecesJointes) {
		this.idPiecesJointes = idPiecesJointes;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public PiecesJointes(Long idPiecesJointes, boolean statut) {
		super();
		this.idPiecesJointes = idPiecesJointes;
		this.statut = statut;
	}
	public PiecesJointes() {
		super();
		
	}
	
	  public PiecesJointes(String name, String type, byte[] data) {
		    this.name = name;
		    this.type = type;
		    this.data = data;
		  }
	  
	  private String filePath;

	  public String getFilePath() {
	      return filePath;
	  }

	  public void setFilePath(String filePath) {
	      this.filePath = filePath;
	  }

}
