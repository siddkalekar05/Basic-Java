import java.util.*;
class Sample{
	public static void main(String[] args){
		int balance = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to widra : ");
		int amount = sc.nextInt();
		if(balance>=amount){
			System.out.println("You can widra amount");
			System.out.println("Remaining balance : "+(balance - amount));
		}else{
			System.out.println("You cannot widra amount");
			System.out.println("Remaining balance : "+(balance));
		}
	}
}
