package tenthedition2018.chapter19.classes;

import java.util.*;

class IteratorDemo{
	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
		System.out.println("Исходное содержимое списочного массива ");
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		ListIterator<String> litr = al.listIterator();
		while(litr.hasNext()){
			String element = litr.next();
			litr.set(element + "+");
		}
		
		System.out.println("Измененный al с помощью ListIterator: ");
		itr = al.iterator();
		while (itr.hasNext()){
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();
		
		System.out.println("Измененный в обратном порядке список: ");
		while(litr.hasPrevious()){
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();	
	}
}