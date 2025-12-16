class Outer{
	static int x = 10;
	static class Inner{
		void Display(){
			System.out.println("Static Inner class");
			System.out.println(x);
		}
	}
}
class Client{
	public static void main(String[] args){
		Outer.Inner obj = new Outer.Inner();
		obj.Display();
	}
}
