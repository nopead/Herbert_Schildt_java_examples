package sandymetzruby.chapter3.classes;

import sandymetzruby.chapter3.classes.GearReversedDependency;

class WheelReversedDependency{
	private double rim;
	private double tire;
	private GearReversedDependency gear;
	
	WheelReversedDependency(double rim, double tire, int chairing, int cog){
		this.rim = rim;
		this.tire = tire;
		this.gear = new GearReversedDependency(chairing, cog);
	}
	
	double diameter(){
		return rim + (tire * 2);
	}
	
	double gearInches(){
		return gear.gearInches(diameter());
	}
}