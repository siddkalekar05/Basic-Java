import java.util.*;
class Operator1{
	public static void main(String[] args){
		int balance = 50000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice : ");
		int x = sc.nextInt();
	switch(x){
	        case 1:
		       System.out.println("Enter amount to deposite : ");
	               int aMount = sc.nextInt();
	               System.out.println("Total bank balance : "+(balance+aMount));
	               break;	       
		case 2:	System.out.println("Amount widra time : ");
			int times = sc.nextInt();
			for(int i =0;i<times;i++){
		
			       System.out.println("Enter the amount for widra : ");
			       int amount = sc.nextInt();
		
			        if((amount<=10000 && amount<=balance)){
				        System.out.println("Amout can be widra ? :"+(amount<=10000 && amount<=balance));
		               		       if(amount<=balance){
			               	            System.out.println("You can widra");
		    } 
		}else {
			System.out.println("Amount is not in range ");
			System.out.println("Total balance : "+balance);
		}
		 if(amount<=10000){
			 System.out.println("Remaining amount : "+(balance-=amount));
		 }
		break;
			}
		default :
			System.out.println("Invalid Choice");
			break;
	}
 }
}



