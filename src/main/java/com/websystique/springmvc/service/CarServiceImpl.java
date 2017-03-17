package com.websystique.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.websystique.springmvc.dao.CarDao;
import com.websystique.springmvc.model.Car;
import com.websystique.springmvc.model.User;



@Service("carService")
@Transactional
public class CarServiceImpl implements CarService{

	
	@Autowired
	private CarDao dao ;
	
	
	@Override
	public Car findCarById(int id) {
		
		return dao.findCarById(id);
	}

	@Override
	public void save(Car car) {
		dao.save(car);
		
	}

	@Override
	public void update(Car car) {
		dao.update(car);
		
	}

	@Override
	public void delete(Car car) {
		dao.delete(car);
		
	}

	@Override
	public List<Car> allCars() {
	
		return dao.allCars();
	}

	@Override
	public List<Car> carsByUser(User user) {
		
		return dao.carsByUser(user);
	}

}
