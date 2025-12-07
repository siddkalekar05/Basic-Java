import java.util.*;
class PatternDemo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        
        System.out.println("Enter the no. of rows : ");
        int ch = 65;
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            
            for(int j=1;j<=i;j++){
                
                System.out.print((char)ch+" ");
            ch++;
            } System.out.println();
              
        }
    }
    
}
