package chapter18.classes;

import chapter18.classes.NewThread;

class ThreadGroupDemo{
	public static void main(String[] args){
		ThreadGroup groupA = new ThreadGroup("Группа A");
		ThreadGroup groupB = new ThreadGroup("Группа B");
		
		NewThread ob1 = new NewThread("Первый thread", groupA);
		NewThread ob2 = new NewThread("Второй thread", groupA);
		NewThread ob3 = new NewThread("Третий thread", groupB);
		NewThread ob4 = new NewThread("Четвертый thread", groupB);
		
		System.out.println("\n выход из метода list()");
		groupA.list();
		groupB.list();
		System.out.println();
		
		System.out.println("Прерывается группа A");
		Thread[] tgA = new Thread[groupA.activeCount()];
		groupA.enumerate(tgA);
		for (Thread t: tgA){
			((NewThread)t).mysuspend();
		}
		
		try{
			Thread.sleep(4000);
		} catch (InterruptedException e){
			System.out.println("Главный поток исполнения прерван");
		}
		
		System.out.println("Возобновление группы A");
		
		for (Thread t: tgA){
			((NewThread)t).myresume();
		}
		
		try{
			System.out.println("Ожидание завершения потоков исполнения");
			ob1.join();
			ob2.join();
			ob3.join();
			ob4.join();
		}catch(Exception e){
			System.out.println("Исключение в главном потоке");
		}
		
		System.out.println("Главный поток исполнения завершен");
	}
}