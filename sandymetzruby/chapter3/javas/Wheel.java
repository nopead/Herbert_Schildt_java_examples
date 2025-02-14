package sandymetzruby.chapter3.classes;

interface IDiameterable{
	public double diameter();
}

class Wheel implements IDiameterable{
	private double rim;
	private double tire;
	
	Wheel(double rim, double tire) {
		this.rim = rim;
		this.tire = tire;
	}
	
	public double getRim(){
		return rim;
	}
	
	public double getTire(){
		return tire;
	}
	
	double[] getRimAndTireAsArray() {
		return new double[] {rim, tire};
	}
	
	public double diameter(){
		return (rim + (tire * 2));
	}
	
	double circumrefence(){
		return diameter() * Math.PI;
	}
}