import java.util.*;
class Ass2Demo5{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the num = ");
                float num = sc.nextFloat();
                if(num%6==0){
			System.out.println(num+" is divisible by 6");
		} else{
			System.out.println(num+" is not divisible by 6");
		}
	}
}
