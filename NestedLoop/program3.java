import java.util.*;
class PatternDemo3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows : ");
        
        int r = sc.nextInt();
        int ch = 96+r;
        for(int i=1;i<=r;i++){
            for(int j=ch;j>96;j--){
                
                System.out.print((char)j+" ");
                 
            } System.out.println();
            
        }
    }
    
    }
