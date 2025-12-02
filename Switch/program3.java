import java.util.*;
class SwitchDemo3{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size : ");
                String size = sc.next();
                switch(size){
                        case "S":
                                System.out.println("Small");
                                break;
                        case "L":
                                System.out.println("Large");
                                break;
                        case "XL":
                                System.out.println("Extra-Large");
                                break;
                         case "M":
                                System.out.println("Medium");
                                break;

                        default:
                                System.out.println("No size found");
                                break;
                }
        }
}
