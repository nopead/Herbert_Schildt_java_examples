package sandymetzruby.chapter3.classes;

class Wheel{
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
	
	double diameter(){
		return (rim + (tire * 2));
	}
	
	double circumrefence(){
		return diameter() * Math.PI;
	}
}