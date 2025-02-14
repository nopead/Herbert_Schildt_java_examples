package sandymetzruby.chapter3.classes;

class GearReversedDependency{
	private int chairing;
	private int cog;
	
	GearReversedDependency(int chairing, int cog){
		this.chairing = chairing;
		this.cog = cog;
	}
	
	double ratio(){
		return chairing * 1.0 / cog;
	}
	
	double gearInches(double diameter){
		return ratio() * diameter;
	}
}