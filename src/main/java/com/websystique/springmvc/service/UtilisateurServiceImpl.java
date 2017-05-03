package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.UtilisateurDao;
import com.websystique.springmvc.model.utilisateur;


@Service("utilisateurService")
@Transactional
public class UtilisateurServiceImpl  implements UtilisateurService{
	
	@Autowired
	private UtilisateurDao dao ;

	@Override
	public void save(utilisateur utilisateur) {
		dao.save(utilisateur);
		
	}

	@Override
	public List<utilisateur> allUtilisateurs() {
		
		return dao.allUtilisateurs();
	}

	@Override
	public utilisateur findUtiByID(int id) {
		
		return dao.findUtiByID(id);
	}

	
	
}
