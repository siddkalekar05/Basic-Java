import java.util.*;
class IfElseDemo{
	 public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int x = sc.nextInt();
		if(x>=0){
			System.out.println(x+" is positive");
		} else { 
			System.out.println(x+" is negative");
		}
	}
}
