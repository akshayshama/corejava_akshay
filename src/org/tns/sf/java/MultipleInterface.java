package org.tns.sf.java;

interface Camera{
	void takePic();
}

interface MusicPlayer{
	void playMusic();
}

class Smartphone implements Camera,MusicPlayer{

	@Override
	public void playMusic() {
		System.out.println("play music");
		
	}

	@Override
	public void takePic() {
		System.out.println("take pics");
		
		
	}
	
}

public class MultipleInterface {

	public static void main(String[] args) {
		Smartphone myphone=new Smartphone();
		myphone.playMusic();
		myphone.takePic();
		
	}

}
