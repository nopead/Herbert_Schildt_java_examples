package sandymetzruby.chapter2.classes;

import sandymetzruby.chapter2.classes.Gear;
import sandymetzruby.chapter2.classes.Wheel;
import sandymetzruby.chapter2.classes.ObscuringReferences;
import sandymetzruby.chapter2.classes.RevealingReferences;
import java.util.ArrayList;

class Main{
	public static void main(String[] args){ 
		Gear firstGear = new Gear(52, 11, new Wheel(26, 1.5));
		Gear secondGear = new Gear(30, 27, new Wheel(24, 1.25));
		
		System.out.print("firstGear gearInches(): ");
		System.out.print(firstGear.gearInches() + "\n");
		System.out.print("secondGear gearInches(): ");
		System.out.print(secondGear.gearInches() + "\n");
		
		/*System.out.print("first_gear gear_inches: ");
		System.out.print(first_gear.gear_inches() + "\n");
		System.out.print("second_gear gear_inches: ");
		System.out.print(second_gear.gear_inches() + "\n");*/
		
		ObscuringReferences ob = new ObscuringReferences(new int[][] {{622, 20}, {622, 23}, {559, 30}, {559, 40}});
		ob.diameters();
		
		System.out.println();
		System.out.println("---- Revealing References ------");
		
		RevealingReferences revRef = new RevealingReferences();
		RevealingReferences.Wheel w1 = revRef.new Wheel(622, 20);
		RevealingReferences.Wheel w2 = revRef.new Wheel(622, 23);
		RevealingReferences.Wheel w3 = revRef.new Wheel(599, 30);
		RevealingReferences.Wheel w4 = revRef.new Wheel(599, 40);
		revRef.wheelify(w1);
		revRef.wheelify(w2);
		revRef.wheelify(w3);
		revRef.wheelify(w4);
		revRef.diameters();
		
		System.out.println("---- Revealing References by ArrayList ------");
		ArrayList<RevealingReferences.Wheel> arrayWheels = new ArrayList<RevealingReferences.Wheel>();
		arrayWheels.add(w1);
		arrayWheels.add(w2);
		arrayWheels.add(w3);
		arrayWheels.add(w4);
		RevealingReferences revRef2 = new RevealingReferences(arrayWheels);
		revRef2.diameters();
		
		
		
		
	}
}