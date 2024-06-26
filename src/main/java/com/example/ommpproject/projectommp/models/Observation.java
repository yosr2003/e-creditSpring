package com.example.ommpproject.projectommp.models;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Observation {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idObs;
	    private String description;
	   
		public Long getIdObs() {
			return idObs;
		}
		public void setIdObs(Long idObs) {
			this.idObs = idObs;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Observation() {
			super();
		}
		public Observation(Long idObs, String description) {
			super();
			this.idObs = idObs;
			this.description = description;
		}
	    
}
