import java.util.*;
class Ass2Demo6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the age = ");
                int age = sc.nextInt();
                if(age>=18){
			System.out.println("Valid");
		} else if (age<18 || age<0){
			System.out.println("Invalid");
		} else{
			System.out.println("Error");
		}
	}
}
