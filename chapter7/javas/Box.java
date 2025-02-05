package chapter7.classes;

public class Box{
	
	double width;
	double height;
	double depth;
	
	
	public Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	public Box(Box obj){
		width = obj.width;
		height = obj.height;
		depth = obj.depth;
	}
	
	public Box(double width, double height, double depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	public Box(double len){
		width = height = depth = len;
	}
	
	
	public double getVolume(){
		return width * height * depth;
	}
}