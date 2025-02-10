package tenthedition2018.chapter20.classes;

import java.util.Formatter;

class TryFormatDemo{
	public static void main(String[] args){
		try(Formatter fmt = new Formatter()){
			fmt.format("Форматировать %s просто %d %f", "средствами Java", 10, 98.6);
			System.out.println(fmt);
		}
	}
}