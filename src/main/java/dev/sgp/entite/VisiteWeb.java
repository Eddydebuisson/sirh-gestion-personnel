package dev.sgp.entite;

public class VisiteWeb {

	private Integer id;
	private String chemin;
	private Integer tempsExecution;

	public VisiteWeb(Integer id, String chemin, Integer tempsExecution) {
		super();
		this.id = id;
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
