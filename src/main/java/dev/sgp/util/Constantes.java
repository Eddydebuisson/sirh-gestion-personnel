package dev.sgp.util;

import dev.sgp.service.CollaborateurService;
import dev.sgp.service.StatistiqueService;

public interface Constantes {
	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	StatistiqueService STAT_SERVICE = new StatistiqueService();
}