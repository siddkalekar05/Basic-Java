import java.util.*;
class PatternDemo1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=0;
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(num+j+" ");
            
            } System.out.println();
            num+=r-1;
        } 
    }
    
    }
