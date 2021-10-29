package com.Association;

public class Honda extends Car {
	
	public void hondaStartEngine() {
		CarEngine hondaEngine= new CarEngine();
		hondaEngine.Enginestarts();
	}
	public void hondaMusicPlayer() {
		MusicPlayer hondaPlayer = new MusicPlayer();
		hondaPlayer.carMusicPlayer();
	}
}
