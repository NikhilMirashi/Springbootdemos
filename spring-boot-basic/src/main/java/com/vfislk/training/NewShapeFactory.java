package com.vfislk.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {

	// Autowiring by type

	@Autowired
	@Qualifier("square")
	IShape shape;

	// Autowiring by name
	@Autowired
	IShape rectangle;

	@Autowired
	IShape triangle;

	// @Autowired
	public NewShapeFactory(IShape triangle) {

		this.triangle = triangle;
	}

	public void printArea(String choice, int length, int breadth) {

		System.out.println("printing area");

		if (choice.equals("square")) {
			shape.calcArea(length, breadth);
		}

		if (choice.equals("rectangle")) {
			rectangle.calcArea(length, breadth);
		}

		if (choice.equals("triangle")) {
			triangle.calcArea(length, breadth);
		}

	}
}
