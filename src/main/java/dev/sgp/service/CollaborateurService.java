package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Bancaire;
import dev.sgp.entite.CollabEvt;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.TypeCollabEvt;

@Stateless
public class CollaborateurService {

	@PersistenceContext
	private EntityManager em;
	@Inject
	Event<CollabEvt> collabEvt;

	public List<Collaborateur> listerCollaborateurs() {

		List<Collaborateur> listeCollaborateur = new ArrayList<>();
		TypedQuery<Collaborateur> query = em.createQuery("select v from Collaborateur v ", Collaborateur.class);
		listeCollaborateur = query.getResultList();

		return listeCollaborateur;
	}

	public void sauvegarderCollaborateur(Collaborateur collab) {
		em.persist(collab);
		collabEvt.fire(
				new CollabEvt(collab.getDateHeureCreation(), TypeCollabEvt.CREATION_COLLAB, collab.getMatricule()));

	}

	public Collaborateur getCollaborateurByMatricule(String matricule) {
		TypedQuery<Collaborateur> query = em.createNamedQuery("Collaborateur.findByMatricule", Collaborateur.class)
				.setParameter("mat", matricule);
		Collaborateur collab = query.getSingleResult();
		return collab;
	}

	public List<Collaborateur> getCollaborateurByDep(Integer id) {
		List<Collaborateur> collaborateurs = new ArrayList<>();
		TypedQuery<Collaborateur> query = em.createNamedQuery("Collaborateur.findByDepartement", Collaborateur.class)
				.setParameter("dep", id);
		collaborateurs = query.getResultList();
		return collaborateurs;
	}

	public void putCollaborateurByMat(String matricule, Collaborateur collab) {
		
		TypedQuery<Collaborateur> query = em.createNamedQuery("Collaborateur.findByMatricule", Collaborateur.class)
				.setParameter("mat", matricule);
		Collaborateur col = query.getSingleResult();
		col.setMatricule(collab.getMatricule());
		em.merge(col);

	}

	public Bancaire getCollaborateurBanqueByMat(String matricule) {
		TypedQuery<Collaborateur> query = em.createNamedQuery("Collaborateur.findByMatricule", Collaborateur.class)
				.setParameter("mat", matricule);
		Collaborateur col = query.getSingleResult();

		return col.getBanque();

	}

	public void putCollaborateurBanqueByMat(String matricule, Bancaire ban) {
		TypedQuery<Collaborateur> query = em.createNamedQuery("Collaborateur.findByMatricule", Collaborateur.class)
				.setParameter("mat", matricule);
		Collaborateur col = query.getSingleResult();
		Bancaire banMerge = col.getBanque();
		banMerge.setBanque(ban.getBanque());
		banMerge.setBic(ban.getBic());
		banMerge.setIban(ban.getIban());
		em.merge(banMerge);
		// col.setBanque(ban);
		// em.merge(col);
	}

}