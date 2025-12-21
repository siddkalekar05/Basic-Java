//Demon Thread
class MyThread1 extends Thread{
	public void run(){
		while(true){
			System.out.println(getName());
			try{
				Thread.sleep(5000);
			}catch(InterruptedException ie){
			}
		}
	}
}
class Client2{
	public static void main(String[] args)throws InterruptedException{
		MyThread1 mt = new MyThread1();
		mt.setDaemon(true);
		mt.start();

		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(5000);
		}
	}
}



