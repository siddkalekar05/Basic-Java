  import java.util.*;
class PatternDemo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){ 
		int num = r-i+1;
            for(int j=1;j<=r;j++){
                
                System.out.print(num);
                System.out.print(" ");
                 num+=r;
            } System.out.println();
              
        }
    }
    
    }
