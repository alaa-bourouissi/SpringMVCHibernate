package com.websystique.springmvc.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.AccountDao;
import com.websystique.springmvc.model.Account;
import com.websystique.springmvc.model.User;




@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccoutService{
	
	@Autowired
	private AccountDao accountDao;
	

	@Override
	public Account findById(int id) {
		
		return accountDao.findById(id);
	}

	@Override
	public void save(Account account) {
		accountDao.save(account);
		
	}

	@Override
	public void deleteAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Account> allAccounts() {
		
		return accountDao.allAccounts();
	}

	@Override
	public void update(Account account) {
		accountDao.update(account);
		
	}

	@Override
	public Set<Account> accountsByUser(User user) {
		
		return accountDao.accountsByUser(user);
	}

}
