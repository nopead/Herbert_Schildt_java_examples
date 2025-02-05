package classes;

import classes.Box;

class BoxDemo{
	public static void main(String[] args){
		Box myBox = new Box(20, 10, 20);
		double vol;
			
		vol = myBox.getWidth() * myBox.getHeight() * myBox.getDepth();
		
		System.out.println("Объем коробки: " + vol);
	}
}

