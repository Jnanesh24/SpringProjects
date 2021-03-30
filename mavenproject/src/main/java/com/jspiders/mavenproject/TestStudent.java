package com.jspiders.mavenproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {

	public static void main(String[] args) {
		  
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(" com/jspiders/mavenproject/springconfigure.xml");
				
				
				Student student = (Student) context.getBean("Student");
		
		System.out.println(student);
      
				
	}

}


