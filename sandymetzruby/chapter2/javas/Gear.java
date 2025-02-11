package sandymetzruby.chapter2.classes;

class Gear{
	
	private int chairing;
	private int cog;
	private double rim;
	private double tire;
	
	Gear(int chairing, int cog, double rim, double tire){
		this.chairing = chairing;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}
	
	public double ratio(){
		return(chairing * 1.0 / cog);
	}
	
	public double gear_inches(){
		return ratio() * (rim + (tire * 2));
	}
}