package sandymetzruby.chapter2.classes;

import sandymetzruby.chapter2.classes.Wheel;

class Gear{
	
	private int chairing;
	private int cog;
	private Wheel wheel;
	
	Gear(int chairing, int cog, Wheel wheel){
		this.chairing = chairing;
		this.cog = cog;
		this.wheel = wheel;
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
		return(chairing * 1.0 / cog);
	}
	
	public double gearInches(){
		return ratio() * wheel.diameter();
	}	
}