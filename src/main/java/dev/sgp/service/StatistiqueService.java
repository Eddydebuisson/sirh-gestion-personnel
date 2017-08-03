package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.VisiteWeb;

@Stateless
public class StatistiqueService {
	@PersistenceContext
	private EntityManager em;


	public List<VisiteWeb> listerStat() {

		List<VisiteWeb> listeStat = new ArrayList<>();
		TypedQuery<VisiteWeb> query = em.createQuery("select v from VisiteWeb v ", VisiteWeb.class);
		listeStat = query.getResultList();
	
	
		return listeStat;
	}

	public void sauvegardeStat(VisiteWeb web) {
		em.persist(web);
	}

}
