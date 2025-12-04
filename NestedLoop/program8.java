import java.util.*;
class PatternDemo8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch =65;
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
            
                System.out.print(ch);
                System.out.print(" ");
               ch++;
            } System.out.println();
             
        }
    }
    
    }
