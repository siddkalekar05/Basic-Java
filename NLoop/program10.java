import java.util.*;
class PatternDemo10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            char ch;
            if (i % 3 == 0)
                ch = '@';
            else if (i % 3 == 1)
                ch = '#';
            else
                ch = '$';

            for (int j = 1; j <=r; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
