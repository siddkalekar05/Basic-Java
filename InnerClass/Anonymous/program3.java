interface Demo{
	abstract void fun();
}
class Client1{
	public static void main(String[] args){
		Demo obj = new Demo(){
			public void fun(){
				System.out.println("Fun Method Override");
			}
		};
		obj.fun();
	}
}
