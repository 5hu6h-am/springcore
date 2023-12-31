package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//in this init and destroy can be implemented using the InitializingBean,DisposableBean 

public class Pepsi implements InitializingBean,DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		//init
		System.out.println("Taking pepsi:init");
	}

	@Override
	public void destroy() throws Exception {
		//destroy
		System.out.println("Going to dispose pepsi: Destroy");
		
	}
	

}
