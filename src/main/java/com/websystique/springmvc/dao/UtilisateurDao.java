package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.utilisateur;

public interface UtilisateurDao {

	void save(utilisateur utilisateur);

	List<utilisateur> allUtilisateurs();

	utilisateur findUtiByID(int id);

}
