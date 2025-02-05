package chapter8.classes;

import chapter8.classes.BoxWeight;

class DemoSuper{
	public static void main(String[] args){
		BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight mybox3 = new BoxWeight();
		BoxWeight mycube = new BoxWeight(3, 2);
		BoxWeight myclone = new BoxWeight(mybox1);
		
		double vol;
		
		vol = mybox1.getVolume();
		System.out.println("mybox1 vol = " + vol);
		
		vol = mybox2.getVolume();
		System.out.println("mybox2 vol = " + vol);
		System.out.println("mybox2 weight = " + mybox2.weight);
		
		vol = mybox3.getVolume();
		System.out.println("mybox3 vol = " + vol);
		System.out.println("mybox3 weight = " + mybox3.weight);
		
		vol = mycube.getVolume();
		System.out.println("mycube vol = " + vol);
		System.out.println("mycube weight = " + mycube.weight);
		
		vol = myclone.getVolume();
		System.out.println("myclone vol = " + vol);
		System.out.println("myclone weight = " + myclone.weight);
	}
}