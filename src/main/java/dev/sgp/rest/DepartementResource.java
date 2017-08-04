package dev.sgp.rest;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Departement;

@Path("/departements")
public class DepartementResource {
	@PersistenceContext
	private EntityManager em;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Departement> list() {
		List<Departement> departements = new ArrayList<>();
		TypedQuery<Departement> query = em.createQuery("select v from Departement v ", Departement.class);
		departements = query.getResultList();
		return departements;
	
	}

}
