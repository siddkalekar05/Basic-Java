// ThreadPool
import java.util.concurrent.*;

class ThreadTask extends Thread{
	int task_Count;
	ThreadTask(int i){
		this.task_Count = task_Count;
	}
	public void run(){
		System.out.println("Task no : "+task_Count+"Starting with :"+Thread.currentThread().getName());
		work();
		System.out.println("Task no : "+task_Count+"Ends with :"+Thread.currentThread().getName());
	}
	public void work(){
		try{
			Thread.sleep(2000);
		}catch(Exception e){
		}
	}
}
class Client6{
	public static void main(String[] args){
		ExecutorService executor = Executors .newFixedThreadPool(3);

		for(int i=0;i<=10;i++){
			ThreadTask tt = new ThreadTask(i);
			executor.execute(tt);
		}
		executor.shutdown();
	}
}


