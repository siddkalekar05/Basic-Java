import java.util.*;
class Ass2Demo8{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the marks = ");
                float marks = sc.nextFloat();
                if(marks>=85.0||marks>=75.0){
			System.out.println("Passed: first class with distinction");
		} else if(marks>=60 ||marks>=75){
			System.out.println("Passed : first class");
		} else if(marks<60 && marks>=54){
			System.out.println("Passed:Sencond class");
		} else if(marks<=54 && marks>=47){
			System.out.println("Pass");
		} else{
			System.out.println("Failed");
		}
	}
}
