package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.Car;
import com.websystique.springmvc.model.User;

public interface CarDao {
	
	
	Car findCarById(int id);
	
	void save(Car car);
	
	void update(Car car);
	
	void delete(Car car);
	
	List<Car> allCars();
	
	List<Car> carsByUser(User user);
	
	
	

}
