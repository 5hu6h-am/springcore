package com.springcore.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorinj/ciconfig.xml");
		Person person=(Person) context.getBean("person");
		
		System.out.println(person);
	}

}
