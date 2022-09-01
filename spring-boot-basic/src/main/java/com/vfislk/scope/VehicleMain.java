package com.vfislk.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VehicleMain {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("com.vfislk.scope");
		Vehicle vehicle1=context.getBean(Vehicle.class);
		Vehicle vehicle2=context.getBean(Vehicle.class);
		System.out.println("vehicle1 "+vehicle1);
		System.out.println("vehicle2 "+vehicle2);
		
		System.out.println();
		System.out.println("vehicle1 :"+vehicle1.getBrand());
		System.out.println("vehicle2 :"+vehicle2.getBrand());
		
		System.out.println();
		vehicle1.setBrand("Nkhil");
		System.out.println("after changing");
		System.out.println("vehicle1 :"+vehicle1.getBrand());
		System.out.println("vehicle2 :"+vehicle2.getBrand());
	}

}
