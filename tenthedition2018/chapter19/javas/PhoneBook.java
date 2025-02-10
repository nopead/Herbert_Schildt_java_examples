package tenthedition2018.chapter19.classes;

import java.util.Properties;
import java.io.BufferedReader; 
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException; 
import java.io.File;

class Phonebook{
	public static void main(String[] args) throws IOException{
		Properties ht = new Properties();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String name, number;
		File phonebookFile = null;
		FileInputStream fin = null;
		boolean changed = false;
		
		try{
			phonebookFile = new File("chapter19/assets/phonebook.dat");
			fin = new FileInputStream(phonebookFile);
		}catch(FileNotFoundException e){
			
		}
		
		try{
			if (fin != null){
				ht.load(fin);
				fin.close();
			}
			else{}
		} catch(IOException e){
			System.out.println("Ошибка чтения файла");
		}
		
		do{
			System.out.println("Введите имя. 'exit' для завершения");
			name = br.readLine();
			if (name.equals("exit")){
				continue;
			}
			System.out.println("Введите номер:");
			number = br.readLine();
			ht.put(name, number);
			changed = true;
		} while(!name.equals("exit"));
		
		if (changed) {
			phonebookFile = new File("chapter19/assets/phonebook.dat");
			FileOutputStream fout = new FileOutputStream(phonebookFile);
			ht.store(fout, "Телефонная книга");
			fout.close();
		}
		
		do {
			System.out.println("Введите имя для поиска. 'exit' для выхода ");
			name = br.readLine();
			if (name.equals("exit")){
				continue;
			}
			number = (String)ht.get(name);
			System.out.println("Номер телефона " + name + ": " + number);
		} while (!name.equals("exit"));
	}
}