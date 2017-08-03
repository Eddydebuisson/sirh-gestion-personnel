package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import dev.sgp.entite.VisiteWeb;

@ApplicationScoped
public class StatistiqueService {

	List<VisiteWeb> listeStat = new ArrayList<>();

	public List<VisiteWeb> listerStat() {
		return listeStat;
	}

	public void sauvegardeStat(VisiteWeb web) {
		listeStat.add(web);
	}

}
