abstract class Parent{
	int x = 10;
	abstract void fun();
}
class Child extends Parent{
	public void fun(){
		System.out.println("Value of x : "+x);
	}
}
class Print{
	public static void main(String[] args){
		Parent obj = new Child();
		obj.fun();
	}
}
