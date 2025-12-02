import java.util.*;
class SwitchDemo2{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the grade : ");
                char grade = sc.next().charAt(0);
                switch(grade){
                        case 'O':
                                System.out.println("Outstanding");
                                break;
                        case 'A':
                                System.out.println("Excellent");
                                break;
                        case 'B':
                                System.out.println("Good");
                                break;
			 case 'C':
                                System.out.println("Average");
                                break;
			 case 'P':
                                System.out.println("Pass");
                                break;
			 case 'F':
                                System.out.println("Fail");
                                break;

                        default:
                                System.out.println("No grade found");
                                break;
                }
        }
}
