package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Document;

public interface DocumentDao {
	
	List<Document> AllDocument();
	
	Document findDocById(int id);
	
	void saveDocument(Document document);
	
	List<Document> findAllDocByUserId(int id);
	
	void deleteById(int id);

}
