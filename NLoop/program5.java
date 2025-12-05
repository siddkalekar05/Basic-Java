import java.util.*;
class PatternDemo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=1;
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
	int ch =64+r;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print((char)ch);
                System.out.print(num);
                System.out.print(" ");
            num++;
            } System.out.println();
              
        }
    }
}
