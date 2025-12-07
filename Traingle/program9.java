import java.util.*;
class PatternDemo9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        
        for(int i=1;i<=r;i++){
        int ch=64+r;
            for(int j=1;j<=r+1-i;j++){
                
                System.out.print((char)ch+" ");
            ch--;
            } System.out.println();
        
              
        }
    }
    
}
