class Outer{
	void display(){
		System.out.println("Outer Display");
		class Inner{
			void dis(){
				System.out.println("Inner Display");
			}
		}
		Inner obj = new Inner();
		obj.dis();
	}
}
class Client{
	public static void main(String[] args){
		new Outer().display();
	}
}
