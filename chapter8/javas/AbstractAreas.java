package chapter8.classes;

import chapter8.classes.Figure2;
import chapter8.classes.Rectangle2;
import chapter8.classes.Triangle2;

class AbstractAreas{
	public static void main(String[] args){
		Rectangle2 r = new Rectangle2(9, 5);
		Triangle2 t = new Triangle2(10, 8);
		
		
		Figure2 figref;
		
		figref = r;
		System.out.println("Площадь прямоугольника = " + figref.area());
		
		figref = t;
		System.out.println("Площадь прямоугольника = " + figref.area());
	}
}