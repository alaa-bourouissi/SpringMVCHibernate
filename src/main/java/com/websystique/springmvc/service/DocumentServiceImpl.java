package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.DocumentDao;
import com.websystique.springmvc.model.Document;


@Service("documentService")
@Transactional
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	DocumentDao dao;

	@Override
	public List<Document> AllDocument() {
		
		return dao.AllDocument();
	}

	@Override
	public Document findDocById(int id) {
		
		return dao.findDocById(id);
	}

	@Override
	public void saveDocument(Document document) {
		dao.saveDocument(document);
		
	}

	@Override
	public List<Document> findAllDocByUserId(int id) {
		
		return dao.findAllDocByUserId(id);
	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);
		
	}

}
