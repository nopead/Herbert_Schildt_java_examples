package sandymetzruby.chapter2.classes;

import java.util.ArrayList;

class RevealingReferences{
	
	ArrayList<Wheel> wheels;
	
	public class Wheel{
		double[] rimTire;
		
		Wheel(double rim, double tire) {
			this.rimTire = new double[] {rim, tire};
		}
		
		double[] getRimTire() {
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