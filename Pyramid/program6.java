import java.util.*;

class PatternDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int col = (r * 2) - 1;
        int num = 1;

        for (int i = 1; i <= r; i++) {
            for (int sp = 1; sp <= i - 1; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= col; j++) {
                System.out.print(num + "\t");
            }

            System.out.println();
            col -= 2;
            num++;
        }
    }
}

