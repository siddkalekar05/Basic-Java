import java.util.*;
class PatternDemo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            int num=1;
            for(int j=1;j<=i;j++){
                
                System.out.print(num+" ");
            num++;
            } System.out.println();
              
        }
    }
    
 }
