package com.vfislk.javabased;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements IInstrument {

	@Override
	public void playMusic(String songName) {
		
		System.out.println("your song "+songName+" is playing using Guitar");
	}

}
