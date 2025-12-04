import java.util.*;
class PatternDemo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows : ");
        int r = sc.nextInt();
	int num=1;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(num+" ");
		num++;
            } System.out.println();
        }
    }

    }
