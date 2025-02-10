package tenthedition2018.chapter8.classes;

abstract class Figure2{
	double dim1;
	double dim2;
	
	Figure2(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	
	abstract double area();
}

class Rectangle2 extends Figure2{
	Rectangle2(double a, double b){
		super(a, b);
	}
	
	double area(){
		return dim1 * dim2;
	}
}

class Triangle2 extends Figure2{
	Triangle2(double a, double b){
		super(a, b);
	}
	
	double area(){
		return dim1 * dim2 / 2;
	}
}
