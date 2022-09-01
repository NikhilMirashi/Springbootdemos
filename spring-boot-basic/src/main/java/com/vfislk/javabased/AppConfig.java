package com.vfislk.javabased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

	@Bean
	public Performer getPerformer() {
		return new Performer();
	}
	
	@Bean
	public Guitar getGuitar() {
		return new Guitar();
	}

	@Bean
	@Primary
	public Violin getViolin() {
		return new Violin();
	}

	@Bean
	public Keyboard getKeyboard() {
		return new Keyboard();
	}

}
