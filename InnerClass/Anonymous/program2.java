abstract class Parent1{
	abstract void Display();
}
class Client{
	public static void main(String[] args){
		Parent1 obj = new Parent1(){
			public void Display(){
				System.out.println("Abstract Method Override");
			}
		};
		obj.Display();
	}
}
