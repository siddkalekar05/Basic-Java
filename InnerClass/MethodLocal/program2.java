class Outter1{
	void Display(){
		System.out.println("Outter class Method");
		class Inner1{
			void Disp(){
				System.out.println("Inner class Method");
			}
		}
		Inner1 obj = new Inner1();
		obj.Disp();
	}
	public static void main(String[] args){
		Outter1 obj = new Outter1();
		obj.Display();
	}
}
