package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ShapeFactory {
	
	@Autowired
	@Qualifier("triangle")
	IShape shape;

	public void printArea(int length, int breadth) {
		System.out.println("printing area");
		shape.calcArea(length, breadth);
		
	}

}
