package tenthedition2018.chapter8.classes;

class Figure{
	double dim1;
	double dim2;
	
	Figure(double a, double b){
		dim1 = a;
		dim2 = b;
	}
	
	double area(){
		System.out.println("Площадь фигуры не определена");
		return 0;
	}
}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a, b);
	}
	
	@java.lang.Override
	double area(){
		return dim1*dim2;
	}
}

class Triangle extends Figure{
	Triangle(double a, double b){
		super(a,b);
	}
	
	@java.lang.Override
	double area(){
		return dim1 * dim2 / 2;
	}
}