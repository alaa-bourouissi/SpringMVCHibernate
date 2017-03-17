package com.websystique.springmvc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.websystique.springmvc.model.Car;
import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.CarService;
import com.websystique.springmvc.service.UserService;



@Controller
@RequestMapping("/cars")

public class CarController {
	
	
	@Autowired
	CarService carService;
	
	@Autowired
	UserService userService;
	
	
	@RequestMapping(value={"/list"},method=RequestMethod.GET)
	public String listCars(ModelMap model){
		List<Car> cars = carService.allCars();
		model.addAttribute("cars", cars);
		return "car";
	}
	
	

	@ModelAttribute("utilisateurs")
	public List<User> allUsers(){
		List<User> utilisateurs = userService.findAllUsers();
		
		return utilisateurs;
	}  
	
	
	@RequestMapping(value={"/newCar"},method=RequestMethod.GET)
	public String newCar(ModelMap model){
		
		Car car = new Car();
		model.addAttribute("car",car);
		return "carRegistration";
	}
	
	@RequestMapping(value={"/newCar"},method=RequestMethod.POST)
	public String newCar( @Valid Car car, BindingResult result,ModelMap model){
		
		if (result.hasErrors()) {
			return "registration";
		}
		carService.save(car);
		model.addAttribute("car",car);
		return "redirect:/cars/list";
	}
	
	
	

}
