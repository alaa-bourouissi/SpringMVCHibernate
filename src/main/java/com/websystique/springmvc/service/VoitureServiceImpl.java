package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.VoitureDao;
import com.websystique.springmvc.model.utilisateur;
import com.websystique.springmvc.model.voiture;



@Service("voitureService")
@Transactional
public class VoitureServiceImpl implements VoitureService {
	
	@Autowired	
	private VoitureDao dao;

	@Override
	public void save(voiture voiture) {
		dao.save(voiture);
		
	}

	@Override
	public List<voiture> allVoitures() {
		
		return dao.allVoitures();
		
	}

	@Override
	public List<voiture> voituresByUti(utilisateur utilisateur) {
		
		return dao.voituresByUti(utilisateur);
	}

}
