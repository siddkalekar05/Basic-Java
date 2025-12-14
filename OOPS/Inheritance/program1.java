class Parent{
		 int x = 20;
		 int y = 30; 
	void run(){
		System.out.println(x);
		System.out.println(y);
		
	}
}
class Child extends Parent{

	void fun(){
		System.out.println("Addition : "+(x+y));
		System.out.println("Substraction : "+(y-x));
		System.out.println("Multiplication : "+(x*y));
}
}
class Client{
	public static void main(String[] args){
		Child obj = new Child();
		obj.run();
		obj.fun();
	}
}

