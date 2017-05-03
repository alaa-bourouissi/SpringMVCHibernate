package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.utilisateur;
import com.websystique.springmvc.model.voiture;


@Repository("voitureDao")
public class VoitureDaoImpl extends AbstractDao<Integer, voiture> implements VoitureDao{
	
	@Autowired
	SessionFactory session;

	@Override
	public void save(voiture voiture) {
		persist(voiture);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<voiture> allVoitures() {
		Criteria criteria = createEntityCriteria();
		List<voiture> voitures= (List<voiture>)criteria.list();
		return voitures;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<voiture> voituresByUti(utilisateur utilisateur) {
		List<voiture> voitures = (List<voiture>) session.getCurrentSession().createQuery("select v from Voiture v where v.utilisateur = :utilisateur").setParameter("utilsateur", utilisateur).list();
		return voitures;
	}

}
