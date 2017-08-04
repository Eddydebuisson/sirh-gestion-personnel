package dev.sgp.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import dev.sgp.entite.Bancaire;
import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;

@Path("/collaborateurs")
public class CollaborateursResource {

	@EJB
	CollaborateurService colla;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Collaborateur> list(@QueryParam("departement") Integer dep) {
		if (dep == null) {
			return colla.listerCollaborateurs();
		} else
			return colla.getCollaborateurByDep(dep);
	}

	@Path("/{matricule}")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Collaborateur getCollaborateurByMat(@PathParam("matricule") String matricule) {
		return colla.getCollaborateurByMatricule(matricule);
	}

	@Path("/{matricule}")
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	public void putCollaborateurByMat(@PathParam("matricule") String matricule, Collaborateur collab) {
		colla.putCollaborateurByMat(matricule, collab);
	}

	@Path("/{matricule}/banque")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Bancaire getCollaborateurBanqueByMat(@PathParam("matricule") String matricule) {
		return colla.getCollaborateurBanqueByMat(matricule);
	}

	@Path("/{matricule}/banque")
	@Produces(MediaType.APPLICATION_JSON)
	@PUT
	public void putCollaborateurBanqueByMat(@PathParam("matricule") String matricule, Bancaire ban) {
		colla.putCollaborateurBanqueByMat(matricule, ban);
	}
	

}
