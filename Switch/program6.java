import java.util.*;
class SwitchDemo6{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int monthNo = sc.nextInt();
                switch(monthNo){
                        case 1:
                                System.out.println("One");
                                break;
                        case 2:
                                System.out.println("Two");
                                break;
                        case 3:
                                System.out.println("Three");
                                break;
                         case 4:
                                System.out.println("Four");
                                break;
                         case 5:
                                System.out.println("Five");
                                break;
                         default:
                                System.out.println("Number is greater than 5");
                                
		}
	}
}
