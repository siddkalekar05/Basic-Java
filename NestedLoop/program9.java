import java.util.*;
class PatternDemo9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch ='A';
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=ch;j<=r+64;j++){
                System.out.print((char)j+" ");
            
            } System.out.println();
            
        }
    }
    
    }
