package com.websystique.springmvc.controller;

import java.beans.PropertyEditorSupport;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.fabric.Server;
import com.websystique.springmvc.model.utilisateur;
import com.websystique.springmvc.model.voiture;
import com.websystique.springmvc.service.UtilisateurService;
import com.websystique.springmvc.service.VoitureService;

@Controller
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@Autowired
	VoitureService voitureService;
	
	
	
	
	@RequestMapping(value={"/newVoiture"},method=RequestMethod.GET)
	public String newUtilisateur(ModelMap model){
		
		voiture voiture = new voiture();
		
		model.addAttribute("voiture", voiture);
		
		
		return "newVoiture";
	}
	
	@RequestMapping(value={"/newVoiture"},method=RequestMethod.POST)
	public String saveVoiture(@Valid voiture voiture ,BindingResult result ,ModelMap model){
		if (result.hasErrors()) {
			return "newVoiture";
		}
		
		
		voitureService.save(voiture);
		model.addAttribute("voiture", voiture);
		
		return "registrationsuccess";
	}
	
	@ModelAttribute("utilisateurs")
	public List<utilisateur> allUtilisateurs(){
		
		return utilisateurService.allUtilisateurs();
	}
	
	
	

}
