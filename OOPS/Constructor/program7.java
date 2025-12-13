// Para constructor 
import java.util.*;
class Employee{
	int empId;
	String empName;
	Employee(int empId,String empName){
		this.empId = empId;
		this.empName = empName;
	}
	void empInfo(){
		System.out.println(empId);
		System.out.println(empName);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter emp id : ");
		int empId = sc.nextInt();
		System.out.println("Enter emp name : ");
		String empName = sc.next();
		Employee obj = new Employee(empId,empName);
		obj.empInfo();
	}
}


