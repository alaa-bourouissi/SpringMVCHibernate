package com.websystique.springmvc.converter;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.websystique.springmvc.model.UserProfile;
import com.websystique.springmvc.service.UserProfileService;

/**
 * A converter class used in views to map id's to actual userProfile objects.
 */

@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile>{

	static final Logger logger = LoggerFactory.getLogger(RoleToUserProfileConverter.class);
	
	@Autowired
	UserProfileService userProfileService;

	
	private HashMap<Integer, UserProfile> userProfiles;
	/**
	 * Gets UserProfile by Id
	 * @see org.springframework.core.convert.converter.Converter#convert(java.lang.Object)
	 */
	public UserProfile convert(Object element) {
		Integer id = Integer.parseInt((String)element);
		UserProfile profile = findUserProfile(id);
		//UserProfile profile= userProfileService.findById(id);
		logger.info("Profile : {}",profile);
		return profile;
	}
	
	private UserProfile findUserProfile(Integer id) {
        //First time loading profiles
        if(userProfiles == null) {
            userProfiles = new HashMap<>();
            List<UserProfile> userProfileList = userProfileService.findAll();
            for(UserProfile userProfile: userProfileList) {
                userProfiles.put(userProfile.getId(), userProfile);
            }
        }
        if(userProfiles.containsKey(id)) {
            return userProfiles.get(id);
        }
        return null;
    }
	
	
	
	
}