package sandymetzruby.chapter3.classes;

import sandymetzruby.chapter3.classes.Wheel;
import java.util.HashMap;

class GearWrapper{
	public static Gear createGear(HashMap<String, Object> args){
		return new Gear((int)args.get("chairing"), (int)args.get("cog"), (Wheel)args.get("wheel"));
	}
}

class Gear{
	private int chairing;
	private int cog;
	private Wheel wheel;
	
	Gear(int chairing, int cog, Wheel wheel){
		this.chairing = chairing;
		this.cog = cog;
		this.wheel = wheel;
	}
	
	Wheel getWheel(){
		return this.wheel;
	}
	
	public int getChairing(){
		return chairing;
	}
	
	public int getCog(){
		return cog;
	}
	
	public int getCog(int unanticipated_adjustment_factor){
		return cog * unanticipated_adjustment_factor;
	}
	
	boolean foo(){
		return true;
	}
	
	public int getCog(int bar_adjustment, int baz_adjustment){
		return cog * (foo() ? bar_adjustment : baz_adjustment);
	}
	
	public double ratio(){
		return (chairing * 1.0 / cog);
	}
	
	double getWheelDiameter(){
		return this.wheel.diameter();
	}
	
	public double gearInchesByVariable(){
		return ratio() * wheel.diameter();
	}	
	
	public double gearInchesByMethod(){
		return ratio() * getWheel().diameter();
	}
	
	public double gearInchesByMethodCallingWheelMethod(){
		return ratio() * getWheelDiameter();
	}
}