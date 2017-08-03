package dev.sgp.web;


import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

@WebServlet("/collaborateurs/creer")
public class CreerCollaborateursController extends HttpServlet {
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/WEB-INF/views/collab/nouveauCollaborateur.jsp").forward(req, resp);
		
		


	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String avecNom = req.getParameter("nom");
		String avecPrenom = req.getParameter("prenom");
		String avecDateDeNaissance = req.getParameter("dateDeNaissance");
		String avecAdresse = req.getParameter("adresse");
		String avecNumSecu = req.getParameter("NumeSecu");
		
		String avecMatricule = "MO1";
		ZonedDateTime avecDate = ZonedDateTime.now();
		String avecEmail = avecPrenom + "." + avecNom + "@societe.com";
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate date = LocalDate.parse(avecDateDeNaissance, format);
		
		String photo = "http://www.chatsdesrues.fr/wp-content/uploads/2016/10/acheter-jouet-pour-chat-pas-cher.jpg";
		Collaborateur collab = new Collaborateur(avecNom, avecMatricule, avecPrenom, date, avecAdresse, avecNumSecu,
				photo,
				avecDate, true);
		
		collabService.sauvegarderCollaborateur(collab);
		
		resp.sendRedirect("/sgp/collaborateurs/lister");
		


	}



}
