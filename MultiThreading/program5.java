//DeadLog Situation 
class MyThread5 extends Thread{
	static Thread mainThread = null;
	public void run(){
		try{
			System.out.println(Thread.currentThread().getName());
			mainThread.join();
			mainThread.sleep(1000);
		}catch(InterruptedException ie){
		}
	}
}
class Client5{
	public static void main(String[] args)throws InterruptedException{
		MyThread5.mainThread = Thread.currentThread();
		MyThread5 mt5 = new MyThread5();
		mt5.start();
		mt5.join();
		System.out.println(Thread.currentThread().getName());
	}
}

