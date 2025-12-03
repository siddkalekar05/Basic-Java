import java.util.*;
class FoorDemo3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n :");
		int n = sc.nextInt();
		for(int i=100;i<100+n;i++){
			System.out.println(i);
		}
	}
}
