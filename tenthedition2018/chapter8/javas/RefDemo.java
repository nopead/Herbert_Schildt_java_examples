package tenthedition2018.chapter8.classes;

import tenthedition2018.chapter8.classes.BoxWeight;
import tenthedition2018.chapter7.classes.Box;

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