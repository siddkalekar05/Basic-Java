//Method Overridding 
class Parent{
	Parent(){
		System.out.println("Parent");
	}
	void career(){
		System.out.println("Eng/Doc");
	}
	void marry(){
		System.out.println("Mother choice");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("Child");
	}
	void career(){
		System.out.println("Eng/Doc");
	}
	void marry(){
		System.out.println("My choice");
	}
}
class Client2{
	public static void main(String[] args){
		Parent obj = new Parent();
		obj.career();
		obj.marry();
		Child obj1 = new Child();
		obj1.career();
		obj1.marry();
		Parent obj2 = new Child();
		obj2.career();
		obj2.marry();
	}
}


