package chapter19.classes;

import java.util.*;

class SpliteratorDemo{
	public static void main(String[] args){
		ArrayList<Double> vals = new ArrayList<Double>();
		
		vals.add(1.0);
		vals.add(2.0);
		vals.add(3.0);
		vals.add(4.0);
		vals.add(5.0);
		
		Spliterator<Double> spltr = vals.spliterator();
		while(spltr.tryAdvance((n) -> System.out.println(n)));
		System.out.println();
		
		spltr = vals.spliterator();
		ArrayList<Double> sqrs = new ArrayList<Double>();
		while(spltr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));
		
		System.out.print("Содержимое списочного массива корней:\n");
		spltr = sqrs.spliterator();
		spltr.forEachRemaining((n) -> System.out.println(n));
		System.out.println();
	}
}