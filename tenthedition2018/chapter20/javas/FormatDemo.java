package tenthedition2018.chapter20.classes;

import java.util.Formatter;

class FormatDemo{
	public static void main(String[] args){
		Formatter ft = new Formatter();
		ft.format("Форматировать %s очень просто: %d %f", "средствами Java", 10, 98.6);
		
		System.out.println(ft);
		
		ft.close();
	}
}