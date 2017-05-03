package com.websystique.springmvc.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;

@Component
public class StringtoUser implements Converter<Object, User> {

	@Autowired
	UserService userService;

	@Override
	public User convert(Object element) {
		if (element == null) {
			return null;
		}

		// Integer id = Integer.parseInt((String)element);
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");

		if (element instanceof User) {
			return (User) element;
		}
		Integer id = Integer.parseInt((String) element);
		// Integer id = ((User)element).getId();
		User user = userService.findById(id);
		return user;

	}

}
