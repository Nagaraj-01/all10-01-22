package com.springbootproperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPropertiesApplication implements CommandLineRunner {
	
//	@Value("${myapp.language}")
//	String lang;
	@Autowired
	MyProperties myprops;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPropertiesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lang: "+myprops.getMyapp().getLanguage() +" name: "+myprops.getName()+" first zip: "+myprops.getZip()[0]+" Version: "+myprops.getVersion()+
				" messagingused:"+myprops.getMessagingused());
		
	}

}
