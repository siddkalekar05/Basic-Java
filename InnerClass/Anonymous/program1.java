class Parent{
	void display(){
		System.out.println("Anonymous Inner Class");
	}
}
class Child{
	public static void main(String[] args){
		Parent obj = new Parent(){
			public void display(){
				System.out.println("Ovverridden Method");
				System.out.println("Original Method : ");
				super.display();
			}
		};
		obj.display();
	}
}
