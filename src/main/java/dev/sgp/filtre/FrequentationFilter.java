package dev.sgp.filtre;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;
import dev.sgp.service.StatistiqueService;

@WebFilter(urlPatterns = { "/*" }, description = "Statistique info")
public class FrequentationFilter implements Filter {

	private FilterConfig config = null;
	@Inject
	private StatistiqueService stat;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.config = filterConfig;
		config.getServletContext().log("Visite !");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		long before = System.currentTimeMillis();
		chain.doFilter(request, response);
		long after = System.currentTimeMillis();
		String path = ((HttpServletRequest) request).getRequestURI();
		long temp = after - before;
		stat.sauvegardeStat(new VisiteWeb(path, (int) temp));

	}

	@Override
	public void destroy() {

	}


}
