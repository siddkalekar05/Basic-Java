import java.util.*;
class Ass2Demo7{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the selling price = ");
                int sellPrice = sc.nextInt();
		System.out.println("Enter cost proce = ");
		int costPrice = sc.nextInt();
		int d = sellPrice - costPrice;
		if(d>0){
			System.out.println("Profit of "+d);
		} else if(d<0){
			System.out.println("Loss of "+d);
		} else{
			System.out.println("No loss No profit");
		}
	}
}

             
