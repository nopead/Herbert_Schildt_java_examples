package tenthedition2018.chapter19.classes;

import java.util.Vector;
import java.util.Enumeration;
import java.util.Iterator;

class VectorDemo{
	public static void main(String[] args){
		Vector<Integer> v = new Vector<Integer>(3, 2);
		System.out.println("Начальный размер вектора: " + v.size());
		System.out.println("Начальная емкость вектора: " + v.capacity());
		
		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);
		System.out.println("Новая емкость вектора: " + v.capacity());
		
		v.addElement(5);
		System.out.println("Новая емкость вектора: " + v.capacity());
		
		v.addElement(6);
		v.addElement(7);
		System.out.println("Новая емкость вектора: " + v.capacity());
		
		v.addElement(9);
		v.addElement(10);
		System.out.println("Новая емкость вектора: " + v.capacity());
		
		v.addElement(11);
		v.addElement(12);
		System.out.println("Новая емкость вектора: " + v.capacity());
		
		System.out.println("Первый элемент вектора: " + v.firstElement());
		System.out.println("Последний элемент вектора: " + v.lastElement());
		if(v.contains(3)){
			System.out.println("Вектор содержит 3");
		}
		
		Enumeration<Integer> en = v.elements();
		System.out.println("Элементы вектора: ");
		while(en.hasMoreElements()){
			System.out.print(en.nextElement() + " ");
		}
		System.out.println();
		
		Iterator<Integer> itr = v.iterator();
		System.out.println("Перебор элементов вектора итератором");
		while(itr.hasNext()){
			System.out.print(itr.next() + " ");
		}
		System.out.println();
		
		System.out.println("Перебор элементов вектора циклом for each");
		for (int i: v){
			System.out.print(i + " ");
		}
		System.out.println();
	}
}