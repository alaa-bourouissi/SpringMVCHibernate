package com.websystique.springmvc.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.User;
import com.websystique.springmvc.service.UserService;

@Component
public class StringtoUser implements Converter<Object, User>{
	
	@Autowired
	UserService userService ;

	@Override
	public User convert(Object element) {
		if (element == null ) {
            return null;
        }
		//Integer id = Integer.parseInt((String)element);
		System.out.println("SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
		//Integer id = Integer.parseInt(element);
		Integer id = ((User)element).getId();
		User user = userService.findById(id);
		return user;
	}

	


}
