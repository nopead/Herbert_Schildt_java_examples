package sandymetzruby.chapter2.classes;

class Gear{
	
	private int chairing;
	private int cog;
	
	Gear(int chairing, int cog, double rim, double tire){
		this.chairing = chairing;
		this.cog = cog;
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
}