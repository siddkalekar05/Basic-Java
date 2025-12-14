//Method overloading
class Poly1{
	void add(int x,int y){
	      System.out.println("Addition : "+(x+y));
	}
        void add(int a , float b){
		System.out.println("Addition : "+(a+b));
	}
}
class Client{
	public static void main(String[] args){
		Poly1 obj = new Poly1();
		obj.add(10,20);
		obj.add(12,13.5f);
	}
}
	      	
