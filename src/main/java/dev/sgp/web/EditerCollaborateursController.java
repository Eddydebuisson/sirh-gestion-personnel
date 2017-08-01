package dev.sgp.web;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String avecMatricule = req.getParameter("matricule");
		if (avecMatricule == null) {
			resp.setContentType("text/html");
			resp.sendError(404, "Une matricule est attendu.");
		} else {
		resp.setContentType("text/html");
		// code HTML écrit dans le corps de la réponse
		resp.getWriter().write(
				"<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>Matricule=" + avecMatricule
				+ "</li>" + "</ul>");
	}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String avecMatricule = req.getParameter("matricule");
		String avecPrenom = req.getParameter("prenom");
		String avecNom = req.getParameter("nom");
		String avecTitre = req.getParameter("titre");
		
		List<String> params = Stream.of("prenom", "nom", "titre", "matricule").filter(p -> req.getParameter(p) == null)
				.collect(Collectors.toList());
		if (avecMatricule == null || avecPrenom == null || avecNom == null || avecTitre == null) {
			resp.setContentType("text/html");
			resp.sendError(404, "Les paramètres suivants sont incorrects :" + params.toString());
		}

		resp.getWriter().write(
				"<h1>Edition de collaborateur</h1>" + "<ul>" + "<li>Matricule=" + avecMatricule + "</li>"
						+ "<li>Prenom	=" + avecPrenom + "</li>" + "<li>Nom =" + avecNom + "</li>" + "<li>Titre ="
						+ avecTitre + "</li>" + "</ul>");
	}


}
