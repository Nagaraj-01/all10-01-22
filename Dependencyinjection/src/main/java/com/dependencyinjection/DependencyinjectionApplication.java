package com.dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(DependencyinjectionApplication.class, args);
		
		Dependency d =  context.getBean(Dependency.class);
		d.show();
		
		
	}

}
