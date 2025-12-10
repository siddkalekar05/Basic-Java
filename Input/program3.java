import java.lang.*;
import java.util.*;
class InputDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of student : ");
		String name = sc.next();
		System.out.println("Enter roll no : ");
		int rollno = sc.nextInt();
		System.out.println("Enter CGPA : ");
		float cGpa = sc.nextFloat();
		System.out.println("Name : "+name);
		System.out.println("Roll Number : "+rollno);
		System.out.println("CGPA of Student : "+cGpa);
	}
}

