package ninthedition2015.chapter5.classes;

class ForEach2{
	public static void main(String args[]){
		int nums[] = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;

		for (int x : nums) {
			sum += x;
			if (x == 5) break;
		}
		
		System.out.println("Сумма элементов nums до 6 элемента равна " + sum);
	}
}