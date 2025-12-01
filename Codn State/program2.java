import java.util.*;
class IfElseDemo2{
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int x = sc.nextInt();
		if(x%2==0 || x==0){
	               System.out.println(x+" is even number.");
                   } else {
                          System.out.println(x+" is odd number.");
                      }
	 }
}	 
