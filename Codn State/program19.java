import java.util.*;
class Ass2Demo9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the a = ");
                int a = sc.nextInt();
                System.out.println("Enter the b = ");
                int b = sc.nextInt();
		System.out.println("Enter the c = ");
                int c = sc.nextInt();
		int d = a*a+b*b;
		int e = c*c;
		if(e==d){
			System.out.println("Pythagorean triplet");
		} else{
			System.out.println("Not pythgoanal triplet");
		}
	}
}

