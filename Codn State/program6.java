import java.util.*;
class IfElseDemo6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int num1 = sc.nextInt();
		if(num1%3==0 && num1%7==0){
			System.out.println(num1+" is divisible by 3 & 7");
		} else if(num1%3==0){
			System.out.println(num1+" is divisible by 3");
		} else if(num1%7==0){
			System.out.println(num1+" is divisible by 7");
		} else{
			System.out.println(num1+" is neither divisible by 3 nor by 7");
		}
	}
}
