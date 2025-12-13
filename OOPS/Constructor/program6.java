//Contructor with parameter 
class Const{
	Const(){
		System.out.println("Non - para");
	} 
	Const( int x){
		System.out.println("Parameter const");
	}
	public static void main(String[] args){
		Const obj = new Const();
		Const obj2 = new Const(10);
	}
}

