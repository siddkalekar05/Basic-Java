abstract class Demo{
	void carrer(){
		System.out.println("Developer");
	}
	abstract void marry();
}
class Demo1 extends Demo{
	public void marry(){
		System.out.println("Pasandida Aurat");
	}
} 
class Client{
	public static void main(String[] args){
		Demo1 obj = new Demo1();
		obj.carrer();
		obj.marry();
	}
}
