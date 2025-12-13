// Static block and methods 
class statBlo{
	static int a = 10;
	static{
		System.out.println("Static block");
	}
	static void fun(){
		System.out.println("Static method " );
	}
	public static void main(String[] args){
		fun();
		System.out.println(a);
		
	}
}


