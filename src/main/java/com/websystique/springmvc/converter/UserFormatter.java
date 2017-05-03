package com.websystique.springmvc.converter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;

@Component
public class UserFormatter implements com.websystique.springmvc.converter.Formatter<User> {
	
	@Autowired
	private UserService userService ;

	@Override
	public String print(User user, Locale locale) {
		
		return user.getFirstName().toString();
	}

	@Override
	public User parse(String userId, Locale locale) throws ParseException {
		
		return userService.findById(Integer.parseInt(userId));
	}

}
