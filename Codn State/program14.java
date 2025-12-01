import java.util.*;
class Ass2Demo4{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the marks = ");
                float marks = sc.nextFloat();
                if(marks>85.0){
                        System.out.println("Medical");
                } else if(marks<=85.0&& marks>75.0){
                        System.out.println("Engineering");
                  } else if(marks<75.0 || marks>65.0){
			  System.out.println("Pharmacy or bachlelor in science");
		  }
        }
}
