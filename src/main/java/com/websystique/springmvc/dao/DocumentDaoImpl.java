package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Document;



@Repository("documentDao")
public class DocumentDaoImpl extends AbstractDao<Integer, Document> implements DocumentDao {
	
	
	@Autowired
	SessionFactory session;

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Document> AllDocument() {
		Criteria criteria = createEntityCriteria();
		return (List<Document>)criteria.list();
	}

	
	
	@Override
	public Document findDocById(int id) {
		
		return getByKey(id);
	}

	@Override
	public void saveDocument(Document document) {
		persist(document);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findAllDocByUserId(int id) {
		Criteria crit = createEntityCriteria();
		Criteria userCriteria = crit.createCriteria("user");
		userCriteria.add(Restrictions.eq("id", id));
		return (List<Document>)crit.list();
	}
	
	
	

	@Override
	public void deleteById(int id) {
		Document document = getByKey(id);
		delete(document);
		
	}

}
