package com.websystique.springmvc.service;

import java.util.List;
import java.util.Set;

import com.websystique.springmvc.model.Account;
import com.websystique.springmvc.model.User;

public interface AccoutService {

	Account findById(int id);

	void save(Account account);

	void deleteAccount(Account account);
	
	void update(Account account);

	List<Account> allAccounts();
	
	Set<Account> accountsByUser(User user);

}
