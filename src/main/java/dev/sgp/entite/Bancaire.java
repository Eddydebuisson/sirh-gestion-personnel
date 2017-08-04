package dev.sgp.entite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Bancaire {

	private String banque;
	private String bic;
	@Id
	private String iban;

	public Bancaire(String banque, String bic, String iban) {
		super();
		this.banque = banque;
		this.bic = bic;
		this.iban = iban;
	}

	public Bancaire() {

	}

	public String getBanque() {
		return banque;
	}

	public void setBanque(String banque) {
		this.banque = banque;
	}

	public String getBic() {
		return bic;
	}

	public void setBic(String bic) {
		this.bic = bic;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

}
