package com.vfislk.training;


import org.springframework.stereotype.Component;

@Component
public class Triangle implements IShape {

	
	@Override
	public void calcArea(int length, int breadth) {
		
		double area=0.5*length*breadth;
		System.out.println("area of triangle : "+area);
		
	}

}
