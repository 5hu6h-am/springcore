package com.springcore.constructorinj;

public class Person {
	private int personId;
	private String name;
	
	public Person(int personId, String name) {
		super();
		this.personId = personId;
		this.name = name;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + "]";
	}
	
	

}
