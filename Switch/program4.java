import java.util.*;
class SwitchDemo4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the num1 : ");
                int num1 = sc.nextInt();
		System.out.println("Enter the num2 : ");
		int num2 = sc.nextInt();
		System.out.println("Enter the operation : ");
		char Operator = sc.next().charAt(0);
                switch(Operator){
                        case '+':
                                System.out.println("Addition : "+(num1+num2));                                break;
                        case '-':
                                System.out.println("Substraction : "+(num1-num2));
                                break;
                        case '*':
                                System.out.println("Multiplication : "+(num1*num2));
                                break;
                         case '/':
                                System.out.println("Division : "+(num1/num2));
                                break;
                         case '%':
                                System.out.println("Remainder : "+(num1%num2));
                                break;

                        default:
                                System.out.println("No operator found");
                                break;
                }
        }
}
