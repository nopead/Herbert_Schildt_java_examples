package tenthedition2018.chapter7.classes;

class RecTest{
	private int[] arr;
	
	RecTest(){
		arr = new int[10];
	}
	
	RecTest(int[] ref_array){
		arr = ref_array;
	}
	
	int getArrayLength(){
		return arr.length;
	}
	
	void printArray(int i){
		if(i == 0){
			return;
		}
		else{
			printArray(i - 1);
		}
		System.out.println("element index " + (i - 1) + " value: " + arr[i - 1]);
	}
}