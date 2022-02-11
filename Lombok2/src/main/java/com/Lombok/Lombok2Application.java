package com.Lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Lombok2Application {

	public static void main(String[] args) {
		SpringApplication.run(Lombok2Application.class, args);
		
		User us =new User(01,"nagaraj","kotgera","nk@gmail.com");
		//us.setFname("naga");
		//System.out.println(us.getFname());
		System.out.println();
		System.out.println(us);
	}

}
