// Body in interface by Default 
interface Inter{
	default void fun(){
		System.out.println("In original Run");
	} 
	void run();
}
class Child1 implements Inter{
	public void run(){
		System.out.println(" In 2 nd run");
	}
}
class Child2 implements Inter{
	public void run(){
		System.out.println(" In 2nd run ");
	}
}
class Child3 implements Inter{
        public void fun(){
                System.out.println("In 2 nd fun ");
        }
	public void run(){
		System.out.println("In run 3");
         }
}
class Last{
	public static void main(String[] args){
		Child1 obj1 = new Child1();
		Child2 obj2 = new Child2();
		Child3 obj3 = new Child3();

		obj1.fun();
		obj1.run();

		obj2.fun();
		obj2.run();

		obj3.fun();
		obj3.run();
	}
}

