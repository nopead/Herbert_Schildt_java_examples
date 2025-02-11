package sandymetzruby.chapter2.classes;

import sandymetzruby.chapter2.classes.Gear;

class Main{
	public static void main(String[] args){
		Gear first_gear = new Gear(52, 11);
		Gear second_gear = new Gear(30, 27);
		
		System.out.println("first_gear ratio:");
		first_gear.ratio();
		System.out.println("second_gear ratio:");
		second_gear.ratio();
	}
}