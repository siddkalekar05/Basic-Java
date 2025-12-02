import java.util.*;
class SwitchDemo1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the colour : ");
		String colour = sc.next();
		switch(colour){
			case "red":
				System.out.println("Stop");
				break;
			case "yellow":
				System.out.println("Get Ready");
				break;
			case "green":
				System.out.println("Go");
				break;
			default:
				System.out.println("No colour found");
				break;
		}
	}
}
