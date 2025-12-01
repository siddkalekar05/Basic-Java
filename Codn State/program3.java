import java.util.*;
class IfElseDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num1 = sc.nextInt();
		if(num1==10){
			System.out.println(num1+" is equal to 10");
		}else if(num1>10){
			System.out.println(num1+" is greater than 10");
		} else{
			System.out.println(num1+" is less than 10");
		}
	}
}
