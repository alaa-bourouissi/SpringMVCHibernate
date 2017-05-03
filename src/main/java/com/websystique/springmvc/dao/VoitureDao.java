package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.utilisateur;
import com.websystique.springmvc.model.voiture;

public interface VoitureDao {
	
	
	void save(voiture voiture);
	
	List<voiture> allVoitures();
	
	List<voiture> voituresByUti(utilisateur utilisateur);

}
