import java.util.*;
class SwitchDemo8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 : ");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int num2 = sc.nextInt();
		
		if(num1<0||num2<0){
			System.out.println("Sorry negative number is not allows");
		}else{
			int result = num1*num2;
			switch(result%2){
				case 0:
					System.out.println("Result is even : "+result);
					break;
				case 1:
					System.out.println("Result is odd : "+result);
					break;
			}
		}
	}
}
			
