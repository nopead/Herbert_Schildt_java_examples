package classes;

import classes.Box;

class BoxDemo4{
	public static void main(String[] args){
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		
		double vol1 = mybox1.getVolume();
		double vol2 = mybox2.getVolume();
		
		System.out.println("volume 1 = " + vol1);
		System.out.println("volume 2 = " + vol2);
	}
}