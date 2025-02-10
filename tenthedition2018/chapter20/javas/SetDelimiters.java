package tenthedition2018.chapter20.classes;

import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.util.Scanner;
import java.util.Locale;
import java.io.FileNotFoundException;

class SetDelimiters{
	public static void main(String[] args){
		int count = 0;
		double sum = 0.0;
		
		String file_path = System.getProperty("user.dir") + "/tenthedition2018/chapter20/assets/test3.txt";
		
		try (FileWriter fw = new FileWriter(new File(file_path))){
			fw.write("2, 3.4, 5,6, 7.4, 9.1, 10.5, готово");
		}
		catch (IOException ex){ 
			System.out.println(ex);
		}
		catch (Exception e){
			System.out.println(e);
		}
		
		try (Scanner sc = new Scanner(new FileReader(new File(file_path)))){
			sc.useLocale(Locale.US);
			sc.useDelimiter(", *");
			
			while(sc.hasNext()){
				if(sc.hasNextDouble()){
					sum += sc.nextDouble();
					count++;
				}
				else{
					String str = sc.next();
					if(str.equals("готово")) {
						break;
					}
					else{
						System.out.println("Ошибка формата файла");
						return;
					}
				}
			}
			
			System.out.println("Среднее число типа double в файле: " + (sum / count));
		} catch (FileNotFoundException fnfe){
			System.out.println(fnfe);
		}
	}
}