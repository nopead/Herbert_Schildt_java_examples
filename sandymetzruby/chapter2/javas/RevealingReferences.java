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
				diameter(e);
			}
		);
	}
	
	void diameter(Wheel wheel){
		System.out.println("[" + wheel.getRimTire()[0] + ", " + wheel.getRimTire()[0] + "]");
	}
}