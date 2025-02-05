package classes;

import classes.Box;

class BoxDemo2{
	public static void main(String[] args){
		Box mybox = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		
		double vol1 = mybox.getWidth() * mybox.getHeight() * mybox.getDepth();
		double vol2 = mybox2.getWidth() * mybox2.getHeight() * mybox2.getDepth();
		
		System.out.println("Vol1=" + vol1);
		System.out.println("Vol2=" + vol2);
	}
}