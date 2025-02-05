package chapter8.classes;

import chapter7.classes.Box;

class ColorBox extends Box{
	int color;
	
	ColorBox(double w, double h, double d, int c){
		super(w,h,d);
		color = c;
	}
}