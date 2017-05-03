package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.utilisateur;


@Repository("utilisateurDao")
public class UtilisateurDaoImpl extends AbstractDao<Integer, utilisateur> implements UtilisateurDao {

	@Override
	public void save(utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<utilisateur> allUtilisateurs() {
		Criteria criteria = createEntityCriteria();
		List<utilisateur> utilisateurs = (List<utilisateur>) criteria.list();
		return utilisateurs;
	}

	@Override
	public utilisateur findUtiByID(int id) {
		utilisateur utilisateur = findUtiByID(id);
		return utilisateur;
	}

}
