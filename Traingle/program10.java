import java.util.*;
class PatternDemo10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            int num = r - i + 1;  
            for (int j = 1; j <= r + 1 - i; j++) {
                System.out.print(num + " ");
                num += (r - i + 1);  
            }
            System.out.println();  
        }
    }
}

