package dev.sgp.ecouteur;

import java.time.LocalDate;
import java.time.ZonedDateTime;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebListener
public class EcouteurCollaborateur implements ServletContextListener {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	@Override
	public void contextInitialized(ServletContextEvent sce) {

		Collaborateur collab = new Collaborateur("Debuisson", "SuperJava", "Eddy", LocalDate.now(),
				"Cité du bois d'épinois", "025546549874616519",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true);
		
		collabService.sauvegarderCollaborateur(collab);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}



}
