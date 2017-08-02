package dev.sgp.web;

import java.io.IOException;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.StatistiqueService;
import dev.sgp.util.Constantes;

public class StatistiqueController extends HttpServlet {
	private StatistiqueService stat = Constantes.STAT_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<VisiteWeb> web = stat.listerStat();
		Map<String, IntSummaryStatistics> filtre = web.stream().collect(
				Collectors.groupingBy(VisiteWeb::getChemin, Collectors.summarizingInt(VisiteWeb::getTempsExecution)));
		
		req.setAttribute("listeStat", filtre);
		req.getRequestDispatcher("/WEB-INF/views/collab/statistique.jsp").forward(req, resp);

	}

}
