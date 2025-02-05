package chapter7.classes;

import chapter7.classes.Factorial;

class Recursion{
	public static void main(String[] args){
		Factorial f = new Factorial();
		
		System.out.println("Факториал числа 3 равен: " + f.fact(3));
		System.out.println("Факториал числа 4 равен: " + f.fact(4));
		System.out.println("Факториал числа 5 равен: " + f.fact(5));
	}
}