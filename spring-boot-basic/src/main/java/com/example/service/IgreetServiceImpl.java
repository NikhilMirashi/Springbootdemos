package com.example.service;

import org.springframework.stereotype.Service;

@Service
public class IgreetServiceImpl implements IGreetService {

	@Override
	public void greetUser(String name) {
		
		System.out.println("welcome "+name+" have a great day ..!");
	}

}
