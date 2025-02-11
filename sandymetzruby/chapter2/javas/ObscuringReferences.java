package sandymetzruby.chapter2.classes;

class ObscuringReferences{
	
	private int[][] rim_tire;
	
	ObscuringReferences(int[][] rim_tire){
		this.rim_tire = rim_tire;
	}
	
	void diameters(){
		System.out.print("[");
		for (int i = 0; i < rim_tire.length; i++){
			System.out.print("[" + rim_tire[i][0] + ", " + rim_tire[i][1] + "], ");
		}
		System.out.print("]");
	}
}