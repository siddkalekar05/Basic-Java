class Doctor{
	void dis(){
		System.out.println("Outer class");
	}
	static class Hospital1{
		void disH1(){
			System.out.println("Hospital 1");
		}
	}
	static class Hospital2{
		void disH2(){
			System.out.println("Hospital 2");
		}
	}
}
class Client2{
	public static void main(String[] args){
		Doctor.Hospital1 obj = new Doctor.Hospital1();
		obj.disH1();

		Doctor.Hospital2 obj1 = new Doctor.Hospital2();
		obj1.disH2();

	}
}
