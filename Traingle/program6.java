import java.util.*;
class PatternDemo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        int num=r;
        for(int i=1;i<=r;i++){
        
            for(int j=1;j<=r+1-i;j++){
                
                System.out.print(num+" ");
            
            } System.out.println();
            num--;
              
        }
    }
    
}
