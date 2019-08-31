package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/user",method = RequestMethod.GET)
public class UserDetailsService {
	
	@RequestMapping(value ="/userDetails/{id}",method = RequestMethod.GET)
	@Cacheable(cacheNames = "myCache",key = "#id")
	public List<User> getAllDetails(@PathVariable("id") String id){
		System.out.println("Calling the method");
		List<User> listUsers = new ArrayList<User>();
		User user1 = new User("Anil","IT","1","Kumar");
		User user2 = new User("AnilOne","IT","2","Kumar");
		User user3 = new User("AnilTwo","IT","3","Kumar");
		User user4 = new User("Anilhree","IT","4","Kumar");
		User user5 = new User("AnilFour","IT","5","Kumar");
		listUsers.add(user1);
		listUsers.add(user2);
		listUsers.add(user3);
		listUsers.add(user4);
		listUsers.add(user5);
		return listUsers;
	}

}
