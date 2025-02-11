package sandymetzruby.chapter2.classes;

import sandymetzruby.chapter2.classes.Gear;
import sandymetzruby.chapter2.classes.ObscuringReferences;

class Main{
	public static void main(String[] args){
		Gear first_gear = new Gear(52, 11, 26, 1.5);
		Gear second_gear = new Gear(30, 27, 24, 1.25);
		
		System.out.print("first_gear ratio: ");
		System.out.print(first_gear.ratio() + "\n");
		System.out.print("second_gear ratio: ");
		System.out.print(second_gear.ratio() + "\n");
		
		/*System.out.print("first_gear gear_inches: ");
		System.out.print(first_gear.gear_inches() + "\n");
		System.out.print("second_gear gear_inches: ");
		System.out.print(second_gear.gear_inches() + "\n");*/
		
		ObscuringReferences ob = new ObscuringReferences(new int[][] {{622, 20}, {622, 23}, {559, 30}, {559, 40}});
		ob.diameters();
	}
}