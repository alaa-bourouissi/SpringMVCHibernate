package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.UserDocumentDao;
import com.websystique.springmvc.model.UserDocument;

@Service("userDocumentService")
@Transactional
public class UserDocumentServiceImpl implements UserDocumentService {

	@Autowired
	UserDocumentDao dao;

	@Override
	public UserDocument findById(int id) {
		return dao.findById(id);
	}

	@Override
	public List<UserDocument> findAll() {
		return dao.findAll();
	}

	@Override
	public List<UserDocument> findAllByUserId(int id) {
		return dao.findAllByUserId(id);
	}

	@Override
	public void saveDocument(UserDocument document) {
		dao.save(document);

	}

	@Override
	public void deleteById(int id) {
		dao.deleteById(id);

	}

}
