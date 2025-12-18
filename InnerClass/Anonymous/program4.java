interface Demo1{
	abstract void run();
}
class Demo2{
	public static void main(String[] args){
                Demo1 obj=()->System.out.println("Override ");
		obj.run();
	}
}
