package com.JpaDataModeling;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.JpaDataModeling.Entity.User;
import com.JpaDataModeling.Service.UserDAOService;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
	private static final Logger log= LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	@Autowired
	private UserDAOService userDaoService;
	@Override
	public void run(String... args) throws Exception {
		User user =new User("jack","admin","SE","jk@gamil.com");
		
		User user1 =new User("nagaraj","Java Developer","SE","nk@gamil.com");
		User user2 =new User("maruthi","Developer","SE","mr@gamil.com");
		long insert=userDaoService.insert(user);
		long insert1=userDaoService.insert(user1);
		long insert2=userDaoService.insert(user2);
		log.info("New User Created :" +user);
		log.info("New User Created :" +user1);
		log.info("New User Created :" +user2);
	}



}
