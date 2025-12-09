import java.util.*;

class PatternDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int col = 1;
        int num = 1;

        for (int i = 1; i <= r; i++) {

            for (int sp = 1; sp <= r - i; sp++) {
                System.out.print("\t");
            }


            for (int j = 1; j <= col; j++) {
                System.out.print(num + "\t");
                num+=2;
            }

            System.out.println();
            col += 2;
        }
    }
}
