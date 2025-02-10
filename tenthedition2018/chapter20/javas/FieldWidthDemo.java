package tenthedition2018.chapter20.classes;

import java.util.Formatter;

class FieldWidthDemo{
	public static void main(String[] args){
		Formatter fmt;
		
		for (int i = 1; i <= 100; i++){
			fmt = new Formatter();
			fmt.format("%8d %8d %8d", i, i*i, i*i*i);
			System.out.println(fmt);
			fmt.close();
		}
	}
}