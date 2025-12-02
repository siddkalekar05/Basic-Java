import java.util.*;
class SwitchDemo7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Available plans :");
		System.out.println("1.Platinum");
		System.out.println("2.Gold");
		System.out.println("3.Silver");
	        System.out.println("4.Bronze");
		System.out.println("5.Free");
		System.out.println("Enter the subscribtion plan : ");
		String sub = sc.next();
		switch(sub){
			case "Platinum":
				System.out.println("For Platinum Plan price is 799");
				break;
			case "Gold":
				System.out.println("For Gold Plan price is i599");
				break;
			case "Silver":
				System.out.println("For Silver Plan price is 399");
				break;
			case "Bronze":
				System.out.println("For Bronze Plan price is 199");
				break;
			case "Free" :
				System.out.println("For less than 199 Platform is free with limited access");
				break;
			default :
				System.out.println("Plan not fount");
		}
	}
}
