package com.vfislk.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class Performer {

	@Autowired
	IInstrument instrumentViolin;

	@Autowired
	@Qualifier("getGuitar")
	IInstrument instrumentGuitar;

	@Autowired
	@Qualifier("getKeyboard")
	IInstrument instrumentKeyboard;

	public void performSong(String choice, String songName) {

		if (choice.equals("violin")) {
			instrumentViolin.playMusic(songName);
		}

		if (choice.equals("guitar")) {
			instrumentGuitar.playMusic(songName);
		}

		if (choice.equals("keyboard")) {
			instrumentKeyboard.playMusic(songName);
		}

	}
	
	
	

}
