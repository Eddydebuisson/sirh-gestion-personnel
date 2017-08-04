package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Bancaire;

@Stateless
public class BanqueService {

	@PersistenceContext
	private EntityManager em;

	public List<Bancaire> listerBanque() {
		List<Bancaire> listebanque = new ArrayList<>();
		TypedQuery<Bancaire> query = em.createQuery("select d from Bancaire d ", Bancaire.class);
		listebanque = query.getResultList();

		return listebanque;
	}

	public void sauvegarderBanque(Bancaire ban) {
		em.persist(ban);
	}

}
