package com.websystique.springmvc.service;

import java.util.List;

import com.websystique.springmvc.model.utilisateur;

public interface UtilisateurService {

	void save(utilisateur utilisateur);

	List<utilisateur> allUtilisateurs();

	utilisateur findUtiByID(int id);

}
