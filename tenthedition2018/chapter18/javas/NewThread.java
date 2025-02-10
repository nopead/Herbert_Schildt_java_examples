package tenthedition2018.chapter18.classes;

class NewThread extends Thread{
	boolean suspendFlag;
	
	NewThread(String threadName, ThreadGroup tgObj){
		super(tgObj, threadName);
		System.out.println("Новый поток: " + this);
		suspendFlag = false;
		start();
	}
	
	public void run(){
		try{
			for (int i = 5; i > 0; i--){
				System.out.println(getName() + ": " + i);
				Thread.sleep(1000);
				synchronized(this){
					while(suspendFlag){
						wait();
					}
				}
			}
		}catch(Exception e){
			System.out.println("Исключение в " + getName());
		}
		System.out.println(getName() + " завершился");
	}
	
	synchronized void mysuspend(){
		suspendFlag = true;
	}
	
	synchronized void myresume(){
		suspendFlag = false;
		notify();
	}
}