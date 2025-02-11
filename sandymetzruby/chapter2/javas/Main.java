package sandymetzruby.chapter2.classes;

import sandymetzruby.chapter2.classes.Gear;

class Main{
	public static void main(String[] args){
		Gear first_gear = new Gear(52, 11, 26, 1.5);
		Gear second_gear = new Gear(30, 27, 24, 1.25);
		
		System.out.print("first_gear gear_inches: ");
		System.out.print(first_gear.gear_inches() + "\n");
		System.out.print("second_gear gear_inches: ");
		System.out.print(second_gear.gear_inches() + "\n");
	}
}