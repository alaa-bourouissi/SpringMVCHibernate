package com.websystique.springmvc.dao;

import java.util.List;
import java.util.Set;

import com.websystique.springmvc.model.Account;
import com.websystique.springmvc.model.User;

public interface AccountDao {
	
	Account findById(int id);
	
	void save(Account account);
	
	void update(Account account);
	
	void deleteAccount(Account account);
	
	List<Account> allAccounts();
	
	Set<Account> accountsByUser(User user);

}
