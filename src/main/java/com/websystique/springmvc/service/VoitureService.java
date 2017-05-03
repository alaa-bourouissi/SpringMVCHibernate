package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.utilisateur;
import com.websystique.springmvc.model.voiture;

public interface VoitureService {

	void save(voiture voiture);

	List<voiture> allVoitures();

	List<voiture> voituresByUti(utilisateur utilisateur);

}
