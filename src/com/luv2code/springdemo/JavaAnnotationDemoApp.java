package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaAnnotationDemoApp {

	

	//no-args constructor
	public JavaAnnotationDemoApp() {
		// TODO Auto-generated constructor stub
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//show logging
		//load config file
				AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
				
				//retrieve bean from spring container
				SwimCoach theCoach1 = context.getBean("swimCoach", SwimCoach.class);

				
				//logger
				
				//get swim guys
				System.out.println(theCoach1.getDailyFortune());

				System.out.println(theCoach1.getEmail());

				
				context.close();

	}

}
