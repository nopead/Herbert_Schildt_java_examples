package tenthedition2018.chapter6.classes;

import tenthedition2018.chapter6.classes.Box;

class BoxDemo{
	public static void main(String[] args){
		Box myBox = new Box(20, 10, 20);
		double vol;
			
		vol = myBox.getWidth() * myBox.getHeight() * myBox.getDepth();
		
		System.out.println("Объем коробки: " + vol);
	}
}

