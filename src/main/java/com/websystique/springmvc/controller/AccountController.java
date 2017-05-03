package com.websystique.springmvc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.HandlerMapping;

import com.websystique.springmvc.model.Account;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.AccoutService;
import com.websystique.springmvc.service.UserService;

@Controller
public class AccountController {
	
	@Autowired
	AccoutService accoutService;
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value = {"/accounts"},method=RequestMethod.GET)
	public String listAccount(ModelMap model){
		List<Account> accounts = accoutService.allAccounts();
		model.addAttribute("accounts",accounts);
		return "accounts";
	}
	
	
	
	@RequestMapping(value={"/newAccount"},method = RequestMethod.GET)
	public String newAccount(ModelMap model){
		String message = "This is message from Java class";
		Account account = new Account();
		model.addAttribute("account",account);
		model.addAttribute("message",message);
	return "newaccount";	
	}
	
	
	@RequestMapping(value = { "/newAccount" }, method = RequestMethod.POST)
	public String saveAccount(@Valid Account account,BindingResult result,ModelMap model){
		if (result.hasErrors()) {
			return "newaccount";
		}
		account.setUser(userService.findById(4));
		accoutService.save(account);
		
		model.addAttribute("success","Account"+account.getName());
		System.out.println("|||||||||||||||||||||||||"+account.getName());
		return "accountsuccess";
	}
	
	@RequestMapping(value={"/edit-account-{id}"},method=RequestMethod.GET)
	public String editAccount(@PathVariable int id,ModelMap model){
		Account account = accoutService.findById(id);
		model.addAttribute("account",account);
		return "newaccount";
	}
	
	
	@RequestMapping(value={"/list-account-{id}"},method=RequestMethod.GET)
	public String AccountByUser(@PathVariable int id,ModelMap model,HttpServletRequest request){
		
		Set<Account> accounts = accoutService.accountsByUser(userService.findById(id));
		
		System.out.println(id);
		
		String restofTheUrl = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE);
		System.out.println("______________________________"+restofTheUrl);
		
		model.addAttribute("accounts",accounts);
		
		return "accountUser";
	}
	
	
	
	@RequestMapping(value={"edit-account-{id}"},method=RequestMethod.POST)
	public String updateAccount(@Valid Account account,BindingResult result,ModelMap model,@PathVariable int id){
		if (result.hasErrors()){
			return "newaccount";
		}
		accoutService.update(account);
		model.addAttribute("success","Account"+account.getName());
		
		return "newaccount";
	}
	
	

}
