interface stat{
	static void fun(){
		System.out.println("Static fun");
	}
	void run();
}
class InterStat implements stat{
	public void run(){
		System.out.println("In run");
	}

}
class InterStat2 implements stat{
	public void fun(){
	
		System.out.println("IN FUN OVERIDE ");
	}
	public void run(){
		System.out.println("IN RUN 2");
	}
}
class Client1{
	public static void main(String[] args){
		InterStat obj = new InterStat();
		obj.run();
		stat.fun();
		InterStat2 obj1 = new  InterStat2();
		obj1.fun();
		obj1.run();
	}
}


