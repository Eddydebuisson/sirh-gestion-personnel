package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Observes;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.CollabEvt;

@Stateless
public class ActiviteService {
	@PersistenceContext
	private EntityManager em;

	List<CollabEvt> listeCollabEvt = new ArrayList<>();

	public void recevoirEvenementCollab(@Observes CollabEvt evt) {
		em.persist(evt);

	}

	public List<CollabEvt> listerActivitesCollab() {

		List<CollabEvt> listeCollabEvt = new ArrayList<>();
		TypedQuery<CollabEvt> query = em.createQuery("select v from CollabEvt v ", CollabEvt.class);
		listeCollabEvt = query.getResultList();

		return listeCollabEvt;

	}


}
