package chapter9.classes;

interface Callback{
	void callback(int param);
}

class Client implements Callback{
	public void callback(int param){
		System.out.println("Метод callback с параметром: " + param);
	}
	
	void nonIfaceMeth(){
		System.out.println("Метод не из реализованного интерфейса");
	}
}

class AnotherClient implements Callback{
	public void callback(int param){
		System.out.println("Метод callback уже у другого клиента");
		System.out.println("Параметр в квадрате = " + param * param);
	}
}
