interface interDemo{
       void fun();
       void run();
}
abstract class Demo2 implements interDemo{
	public void fun(){
		System.out.println("In fun");
	}
}
class Demo3 extends Demo2{
	public void run(){
		System.out.println("In run");
	}
}
class Demo4{
	public static void main( String[] arg){
		Demo3 obj = new Demo3();
		obj.fun();
		obj.run();
	}
}
