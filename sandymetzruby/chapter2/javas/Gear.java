package sandymetzruby.chapter2.classes;

class Gear{
	
	private int chairing;
	private int cog;
	
	Gear(int chairing, int cog){
		this.chairing = chairing;
		this.cog = cog;
	}
	
	public void ratio(){
		System.out.println(chairing * 1.0 / cog);
	}
}