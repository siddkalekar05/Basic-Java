import java.util.*;
class IfElseDemo4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the character : ");
                char ch1 = sc.next().charAt(0);
		if(ch1>='A' && ch1<='Z'){
			System.out.println(ch1+" is uppercase charector");
		} else if(ch1>='a' && ch1<='z'){
			System.out.println(ch1+" is a lowercase letter");
		} else{
			System.out.println(ch1+" is invalid");
		}
	}
}
