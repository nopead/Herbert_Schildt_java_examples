package sandymetzruby.chapter3.classes;

import sandymetzruby.chapter3.classes.Wheel;
import java.util.HashMap;

class Gear{
	private int chairing;
	private int cog;
	private Wheel wheel;
	
	Gear(HashMap<String, Object> args){
		this.chairing = (int)args.get("chairing");
		this.cog = (int)args.get("cog");
		this.wheel = (Wheel)args.get("wheel");
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