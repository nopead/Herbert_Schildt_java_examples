package chapter6.classes;

public class Box{
	
	private double width;
	private double height;
	private double depth;
	
	public Box(){
		width = 0;
		height = 0;
		depth = 0;
	}
	
	public Box(double width_, double heigth_, double depth_){
		this.width = width_;
		this.height = heigth_;
		this.depth = depth_;
	}
	
	double getWidth(){
		return width;
	}
	double getHeight(){
		return height;
	}
	double getDepth(){
		return depth;
	}
	
	public double getVolume(){
		return width * height * depth;
	}
}