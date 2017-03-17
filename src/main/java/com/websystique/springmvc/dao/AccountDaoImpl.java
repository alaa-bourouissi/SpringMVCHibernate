package com.websystique.springmvc.dao;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Account;
import com.websystique.springmvc.model.User;

@Repository("accountDao")
public class AccountDaoImpl extends AbstractDao<Integer, Account> implements AccountDao{
	
	Logger logger = LoggerFactory.getLogger(AccountDaoImpl.class);
	
	@Autowired
	SessionFactory session;

	@Override
	public Account findById(int id) {
		Account account = getByKey(id);
		return account;
	}

	@Override
	public void save(Account account) {
		System.out.println("-------------------**************************");
		persist(account);
		
		
	}

	@Override
	public void deleteAccount(Account account) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Account> allAccounts() {
	/*	Criteria criteria = createEntityCriteria();
		List<Account> accounts = (List<Account>)criteria.list(); 
		return accounts; */
		
		return session.getCurrentSession().createQuery("Select a from Account a").list();
	}

	@Override
	public void update(Account account) {
		session.getCurrentSession().update(account);
		
	}

	@Override
	public Set<Account> accountsByUser(User user) {
		@SuppressWarnings("unchecked")
		List<Account> accounts =  (List<Account>) session.getCurrentSession().createQuery("select a from Account a where a.user = :user").setParameter("user", user).list();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+accounts.size());
		Set<Account> accoutss = new HashSet<Account>(accounts); 
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+accoutss);
		return accoutss;
	}
	
	

}
