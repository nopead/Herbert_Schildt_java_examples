package ninthedition2015.chapter9.classes;

public interface MyIF {
	int getNumber();
	
	default String getString(){
		return "Объект типа String по умолчанию";
	}
}

