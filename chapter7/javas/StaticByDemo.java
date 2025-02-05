package chapter7.classes;

import chapter7.classes.StaticDemo;

class StaticByName{
	public static void main(String[] args){
		StaticDemo.callMe();
		System.out.println("StaticDemo.b = " + StaticDemo.b);
	}
}