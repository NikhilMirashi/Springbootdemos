package com.vfislk.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext("com.vfislk");
//		ShapeFactory shapeFactory=context.getBean(ShapeFactory.class,"shapeFactory");
//		shapeFactory.printArea(10, 20);
		
		NewShapeFactory newShapeFactory=context.getBean(NewShapeFactory.class, "newShapeFactory");
		newShapeFactory.printArea("triangle",5, 5);
	}

}
