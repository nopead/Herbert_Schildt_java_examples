package tenthedition2018.chapter7.classes;

import tenthedition2018.chapter6.classes.Box;

class OverloadCons{
	public static void main(String[] args){
		Box mybox1 = new Box();
		Box mybox2 = new Box(10, 20, 15);
		
		System.out.println("vol mybox1: " + mybox1.getVolume());
		System.out.println("vol mybox2: " + mybox2.getVolume());
	}
}