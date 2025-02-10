package tenthedition2018.chapter20.classes;

import java.util.Timer;
import java.util.TimerTask;


class MyTimerTask extends TimerTask{
	public void run(){
		System.out.println("Задание по таймеру выполняется");
	}
}

class TTest{
	public static void main(String[] args){
		MyTimerTask myTask = new MyTimerTask();
		Timer myTimer = new Timer();
		
		myTimer.schedule(myTask, 1000, 500);
		try{
			Thread.sleep(5000);
		} catch(InterruptedException exc){
		}
		myTimer.cancel();
	}
}