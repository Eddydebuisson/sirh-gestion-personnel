package dev.sgp.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Visite")
public class VisiteWeb {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String chemin;
	private Integer tempsExecution;

	public VisiteWeb() {
	}

	public VisiteWeb(String chemin, Integer tempsExecution) {
		super();

		this.chemin = chemin;
		this.tempsExecution = tempsExecution;
	}

	public Integer getId() {
		return id;
	}

	public String getChemin() {
		return chemin;
	}

	public Integer getTempsExecution() {
		return tempsExecution;
	}

}
