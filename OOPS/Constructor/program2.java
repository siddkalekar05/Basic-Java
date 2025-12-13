// Instance Function 
class InstFun{
	int x = 10;
        int y = 20;	
	void fun(){
		System.out.println(x);
	}
	void run(){
		System.out.println(y);
	}
	public static void main(String[] args){
		InstFun obj = new InstFun();
		obj.fun();
		obj.run();
	}
}

