import java.util.*;
class IfElseDemo9{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the day number : ");
                int num1 = sc.nextInt();
                if(num1==1){
                        System.out.println("MONDAY");
                } else if(num1==2){
                        System.out.println("TUESDAY");
		}else if(num1==3){
                        System.out.println("WENSDAY");
		}else if(num1==4){
                        System.out.println("THURSDAY");
		}else if(num1==5){
                        System.out.println("FRIDAY");
		}else if(num1==6){
                        System.out.println("SATURDAY");
		}else if(num1==7){
                        System.out.println("SUNDAY");
                } else{
                        System.out.println("Day number must be between 1 to 7!!!");
                } 
}
}
