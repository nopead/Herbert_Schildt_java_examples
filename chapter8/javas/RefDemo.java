package chapter8.classes;

import chapter8.classes.BoxWeight;
import chapter7.classes.Box;

class RefDemo{
	public static void main(String[] args){
		BoxWeight weightbox = new BoxWeight(3, 5, 7, 8.37);
		Box plainBox = new Box();
		
		double vol;
		
		vol = weightbox.getVolume();
		System.out.println("weightbox volume = " + vol);
		
		plainBox = weightbox;
		
		vol = plainBox.getVolume();
		
		System.out.println("plainBox volume = " + vol);
	}
}