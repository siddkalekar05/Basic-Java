class OutVar{
	int x=10;
	static int y = 100;
	class InnVar{
		void displayVar(){
			System.out.println(x);
			System.out.println(y);
		}
	}
}
class Variable{
	public static void main(String[] args){
		new OutVar().new InnVar().displayVar();
	}
}
