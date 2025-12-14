interface parent1{
	default void fun(){
		System.out.println("Default fun");
	}
}
interface parent2{
	static void fun(){
		System.out.println("Static Fun");
	}
}
class Btech implements parent1,parent2{
}
class Btech2{
	public static void main(String[] args){
		Btech obj = new Btech();
		obj.fun();
	}
}
