package com.vfislk.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext("com.vfislk.javabased");

		Performer performer = context.getBean(Performer.class, "performer");
		performer.performSong("violin", "Ham Sab Bharathiya Hae...!");
		performer.performSong("guitar", "Sare Jaha Se Achha...!");
		performer.performSong("keyboard", "Hindustan jan se pyara hae...!");

		//AppConfig appconfig = context.getBean(AppConfig.class, "appconfig");

	}
}
