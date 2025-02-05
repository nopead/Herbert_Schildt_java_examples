package classes;

import classes.Box;

class BoxDemo3{
	public static void main(String[] args){
		Box mybox = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		
		System.out.println("invoke mybox.getVolume");
		mybox.getVolume();
		System.out.println("invoke mybox2.getVolume");
		mybox2.getVolume();
	}
}