package tenthedition2018.chapter19.classes;

import java.util.Arrays;

class ArrayDemo{
	
	static void display(int[] array){
		for(int i: array){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[] array = new int[10];
		
		for (int i = 0; i < array.length; i++){
			array[i] = -3 * i;
		}
		
		System.out.println("Исходный массив");
		display(array);
		Arrays.sort(array);
		System.out.println("Отсортированный массив");
		display(array);
		
		Arrays.fill(array, 2, 6, -1);
		System.out.println("Массив после fill");
		display(array);
		
		Arrays.sort(array);
		System.out.println("Отсортированный массив");
		
		System.out.println("Значение -9 находится на позиции: ");
		int index = Arrays.binarySearch(array, -9);
		
		System.out.println(index);
	}
}