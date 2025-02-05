package chapter19.classes;

import java.util.LinkedList;
import java.util.Comparator;
import java.util.Collections;

class AlgorithmsDemo{
	
	private static void printList(LinkedList<Integer> l){
		for (int i: l){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);
		
		Comparator<Integer> c = Collections.reverseOrder();
		
		System.out.println("Cписок(исходный)");
		printList(ll);
		
		Collections.sort(ll);
		
		System.out.println("Обратный список - отсортированный");
		printList(ll);
		
		System.out.println("Перетасованный список");
		Collections.shuffle(ll);
		
		printList(ll);
	}
}