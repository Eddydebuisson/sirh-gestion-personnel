package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import dev.sgp.entite.Departement;

@Stateless
public class DepartementService {
	@PersistenceContext
	private EntityManager em;

	public List<Departement> listerDepartement() {
		List<Departement> listeDepartement = new ArrayList<>();
		TypedQuery<Departement> query = em.createQuery("select d from Departement d ", Departement.class);
		listeDepartement = query.getResultList();

		return listeDepartement;
	}

	public void sauvegarderDepartement(Departement deb) {
		em.persist(deb);
	}

}
