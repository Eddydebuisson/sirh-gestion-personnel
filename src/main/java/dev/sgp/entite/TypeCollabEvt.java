package dev.sgp.entite;

import javax.persistence.Enumerated;

public enum TypeCollabEvt {

	CREATION_COLLAB("Création d'un nouveau collaborateur"), MODIFICATION_COLLAB("Modification d'un Collaborateur");
	@Enumerated
	private String value;

	private TypeCollabEvt(String s) {
		this.value = s;
	}

	public String getValue() {
		return value;
	}

}
