package dev.sgp.ecouteur;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dev.sgp.entite.Bancaire;
import dev.sgp.entite.Collaborateur;
import dev.sgp.entite.Departement;
import dev.sgp.service.BanqueService;
import dev.sgp.service.CollaborateurService;
import dev.sgp.service.DepartementService;

@WebListener
public class EcouteurCollaborateur implements ServletContextListener {
	@Inject
	private CollaborateurService collabService;
	@Inject
	private DepartementService departementService;
	@Inject
	private BanqueService banqueService;
	public void initDep() {
		List<Departement> dep = new ArrayList<>();
		dep.add(new Departement(1, "JavaCorp"));
		dep.add(new Departement(2, "JavaEnterprise"));
		dep.add(new Departement(3, "Java"));
		for (Departement departement : dep) {
			departementService.sauvegarderDepartement(departement);
		}
	}
	public void initBanque() {
		List<Bancaire> ban = new ArrayList<>();
		ban.add(new Bancaire("Banque de France‎", "FR76", "FR7630001007941234567890185"));
		ban.add(new Bancaire("BNP Paribas‎", "FR76", "FR7630004000031234567890143"));
		ban.add(new Bancaire("Crédit Agricole", "FR76", "FR7630006000011234567890189"));
		ban.add(new Bancaire("Banque Populaire", "FR76", "FR7610107001011234567890129"));
		ban.add(new Bancaire("Caisse d'Epargne", "FR76", "FR7611315000011234567890138"));
		ban.add(new Bancaire("Crédit Lyonnais", "FR76", "FR7630002032531234567890168"));
		for (Bancaire banque : ban) {
			banqueService.sauvegarderBanque(banque);
		}

	}

	@Override
	public void contextInitialized(ServletContextEvent sce) {

		initDep();
		initBanque();
		List<Collaborateur> colls = new ArrayList<>();
		colls.add(new Collaborateur("Martin", "Javadocteur", "Pierre-antoine", LocalDate.now(),
				"Marseille", "012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(1), "dev",
				banqueService.listerBanque().get(0)));
		colls.add(new Collaborateur("Debuisson", "javaShit", "Eddy", LocalDate.now(), "Marseille",
				"012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(1), "dev",
				banqueService.listerBanque().get(1)));
		colls.add(new Collaborateur("Prime", "Java007", "jerome", LocalDate.now(), "Marseille",
				"012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(1), "dev",
				banqueService.listerBanque().get(2)));
		colls.add(new Collaborateur("Thomas", "Java008", "Thomas", LocalDate.now(), "Marseille",
				"012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(1), "dev",
				banqueService.listerBanque().get(3)));
		colls.add(new Collaborateur("Antho", "Javad001", "Antho", LocalDate.now(), "Marseille",
				"012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(1), "dev",
				banqueService.listerBanque().get(4)));
		colls.add(new Collaborateur("Alex", "Javad002", "Alex", LocalDate.now(), "Marseille",
				"012345678901236",
				"http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg",
				ZonedDateTime.now(), true, "pam@java.fr", departementService.listerDepartement().get(2), "dev",
				banqueService.listerBanque().get(5)));

		for (Collaborateur collaborateur : colls) {

			collabService.sauvegarderCollaborateur(collaborateur);
		}

	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}



}
