//ThreadPool 
import java.util.concurrent.*;
class ThreadTask extends Thread{
	int task_Count;
	ThreadTask(int i){
		this.task_Count=task_Count;
	}
	public void run(){
		System.out.println("Task no:"+task_Count+"Start with : "+Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}catch(Exception e){
		}
		System.out.println("Task no:"+task_Count+"Ends With:"+Thread.currentThread().getName());
	}
}
class Client7{
	public static void main(String[] args){
		ExecutorService executor = Executors.newFixedThreadPool(3);

		for(int i=0;i<10;i++){
			ThreadTask tt = new ThreadTask(i);
			executor.execute(tt);
		}
		executor.shutdown();
	}
}

