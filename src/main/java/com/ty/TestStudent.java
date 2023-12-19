package com.ty;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent
{
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("my_config.xml");
		
		Student stud =(Student) context.getBean("student");
		
		System.out.println(stud.getAge());
	}

}
