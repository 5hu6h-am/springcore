package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student=(Student) con.getBean("student");
		System.out.println(student);
		
		System.out.println(student.hashCode());
		System.out.println("----------------------");
		
		Student student2=(Student) con.getBean("student");
		System.out.println(student2);
		System.out.println(student2.hashCode());
	}

}
