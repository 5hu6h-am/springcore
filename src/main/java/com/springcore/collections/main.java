package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Emp emp1=(Emp) context.getBean("emp1");
		
		System.out.println("Name:"+emp1.getName());
		System.out.println("Phones:"+emp1.getPhones());
		System.out.println("Address:"+emp1.getAddress());
		System.out.println("Courses:"+emp1.getCourses());
	}

}
