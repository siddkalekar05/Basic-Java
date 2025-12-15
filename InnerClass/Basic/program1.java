class Outer{
	class Inner{
		void inner(){
			System.out.println("In Inner Class");
		}
	}
	void outer(){
         	System.out.println("In Outer Claa");
	}	
}

class Client{
	public static void main(String[] args){
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj.outer();
		obj1.inner();
	}
}


