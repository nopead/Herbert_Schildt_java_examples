package chapter18.classes;

import chapter18.classes.X;
import chapter18.classes.Y;

class RTTI{
	public static void main(String[] args){
		X x = new X();
		Y y = new Y();
		
		Class<?> clObj;
		clObj = x.getClass();
		System.out.println("х -- объект типа: " + clObj.getName());
		
		
		clObj = y.getClass();
		System.out.println("y -- объект типа: " + clObj.getName());
		
		clObj = clObj.getSuperclass();
		System.out.println("Суперкласс объекта y: " + clObj.getName());
		
		clObj = x.getClass().getSuperclass();
		System.out.println("Суперкласс объекта x: " + clObj.getName());
		
	}
}