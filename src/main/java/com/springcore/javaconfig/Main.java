package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
	ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
	Student student=(Student)con.getBean("student");
	System.out.println(student);
	student.study();
	}

}
