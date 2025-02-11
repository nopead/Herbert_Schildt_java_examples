package sandymetzruby.chapter2.classes;

import java.util.ArrayList;

class RevealingReferences{
	
	ArrayList<Wheel> wheels;
	
	public class Wheel{
		int[] rimTire;
		
		Wheel(int rim, int tire) {
			this.rimTire = new int[] {rim, tire};
		}
		
		int[] getRimTire() {
			return this.rimTire;
		}
	}
	
	RevealingReferences(){
		this.wheels = new ArrayList<Wheel>();
	}
	
	RevealingReferences(ArrayList<Wheel> wheels){
		this.wheels = wheels;
	}
	
	void wheelify(Wheel wheel){
		this.wheels.add(wheel);
	}
	
	void diameters(){
		wheels.forEach((e) -> {
			System.out.println("[" + e.getRimTire()[0] + ", " + e.getRimTire()[0] + "]");
			}
		);
	}
}