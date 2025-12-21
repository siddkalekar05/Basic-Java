//Ideal way to Create Thread
class Client3{
	public static void main(String[] args){
		Runnable rn = new Runnable(){
			public void run(){
				System.out.println(Thread.currentThread().getName());
			}
		};
		Thread mt = new Thread(rn);
		mt.start();
		System.out.println(Thread.currentThread().getName());
	}
}

