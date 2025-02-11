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
	
	public double ratio(){
		return(chairing * 1.0 / cog);
	}
}