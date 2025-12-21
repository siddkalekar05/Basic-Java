//Thread Syncronysation 
class MyThread3 extends Thread{
	public void run(){
		try{	
			for(int i=0;i<10;i++){
				System.out.println(Thread.currentThread().getName());
				Thread.sleep(2000);
			}
		}catch(InterruptedException ie){

		}
	}
}
class Client4{
	public static void main(String[] args)throws InterruptedException{
		MyThread3 t = new MyThread3();
		t.start();
		t.join();
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName());
			Thread.sleep(1000);
		}
	}
}


			
