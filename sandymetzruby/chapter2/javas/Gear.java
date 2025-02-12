package sandymetzruby.chapter2.classes;

class Gear{
	
	private int chairing;
	private int cog;
	private double rim;
	private double tire;
	
	Gear(int chairing, int cog){
		this.chairing = chairing;
		this.cog = cog;
	}
	
	Gear(int chairing, int cog, double rim, double tire){
		this.chairing = chairing;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
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
	
	public double getRim(){
		return rim;
	}
	
	public double getTire(){
		return tire;
	}
	
	public double ratio(){
		return(chairing * 1.0 / cog);
	}
	
	public double diameter(){
		return rim + (tire * 2);
	}
	
	public double gearInches(){
		return ratio() * diameter();
	}	
}