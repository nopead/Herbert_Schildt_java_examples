package tenthedition2018.chapter20.classes;

import java.util.Formatter;

class FormatDemo2{
	public static void main(String[] args){
		Formatter ft;
		
		for (double i = 1.23; i < 1.0e+6; i *= 100){
			ft = new Formatter();
			ft.format("%f %e", i, i);
			System.out.println(ft);
			//ft.flush();
			ft.close();
		}
		
	}
}