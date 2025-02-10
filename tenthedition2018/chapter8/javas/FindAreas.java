package tenthedition2018.chapter8.classes;

import tenthedition2018.chapter8.classes.Figure;
import tenthedition2018.chapter8.classes.Rectangle;
import tenthedition2018.chapter8.classes.Triangle;

class FindAreas{
	public static void main(String[] args){
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		Figure figref;
		
		figref = r;
		System.out.println("Площадь прямоугольника = " + figref.area());
		
		figref = t;
		System.out.println("Площадь треугольника = " + figref.area());
		
		figref = f;
		System.out.println("Площадь фигуры = " + figref.area());
	}
}