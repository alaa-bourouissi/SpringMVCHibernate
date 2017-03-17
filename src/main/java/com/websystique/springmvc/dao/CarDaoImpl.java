package com.websystique.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.websystique.springmvc.model.Car;
import com.websystique.springmvc.model.User;


@Repository("carDao")
public class CarDaoImpl  extends AbstractDao<Integer, Car> implements CarDao{
	
	
	@Autowired
	SessionFactory session;

	@Override
	public Car findCarById(int id) {
		Car car = getByKey(id);
		return car;
	}

	@Override
	public void save(Car car) {
		persist(car);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> allCars() {
		Criteria criteria = createEntityCriteria();
		List<Car> cars = (List<Car>)criteria.list();
		return cars;
	}

	
	
	
	@Override
	public void update(Car car){
		update(car);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Car> carsByUser(User user) {
		
		List<Car> cars = (List<Car>) session.getCurrentSession().createQuery("select c from Car c where c.user = :user").setParameter("user", user).list();
		
		return cars;
	}

}
