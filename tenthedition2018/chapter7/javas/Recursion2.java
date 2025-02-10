package tenthedition2018.chapter7.classes;

import tenthedition2018.chapter7.classes.RecTest;

class Recursion2{
	public static void main(String[] args){
		int[] array = {1, 2, 3, 4, 5};
		RecTest test = new RecTest(array);
		test.printArray(test.getArrayLength());
	}
}