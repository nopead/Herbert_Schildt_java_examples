package tenthedition2018.chapter20.classes;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.Locale;
import java.util.Scanner;
import java.io.IOException;

class ScanMixed{
	public static void main(String[] args) throws IOException{
		int i;
		double d;
		boolean b;
		String str;
		
		String file_path = System.getProperty("user.dir") + "/tenthedition2018/chapter20/assets/test2.txt";
		
		try (FileWriter fw = new FileWriter(new File(file_path))){
			fw.write("Тестирование Scanner 10 12.2 один true два false");
		}
		
		FileReader fr = new FileReader(new File(file_path));
		try(Scanner sc = new Scanner(fr)){
			sc.useLocale(Locale.US);
			
			while (sc.hasNext()){
				if(sc.hasNextInt()){
					i = sc.nextInt();
					System.out.println("int: " + i);
				}
				else if(sc.hasNextDouble()){
					d = sc.nextDouble();
					System.out.println("double: " + d);
				}
				else if(sc.hasNextBoolean()){
					b = sc.nextBoolean();
					System.out.println("boolean: " + b);
				}
				else {
					str = sc.next();
					System.out.println("String: " + str);
				}
			}
		}
	}
}