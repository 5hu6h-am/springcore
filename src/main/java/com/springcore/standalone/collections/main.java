package com.springcore.standalone.collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
		Person Person1=(Person)con.getBean("person1");
		System.out.println(Person1);
	}

}
