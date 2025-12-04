import java.util.*;
class PatternDemo7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no. of rows : ");

        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=r;j<=r;j--){
                if(j>0){
                System.out.print(j+" ");
                }
            } System.out.println();
            
        }
    }
    
    }
