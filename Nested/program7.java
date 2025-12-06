import java.util.*;
class PatternDemo37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int ch = 64 + r;
        int num = r - 1; 
	for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) ch + " ");
                } else {
                    System.out.print(num + " ");
                }
            }

            if (i % 2 != 0) {
                ch -= 2;
            } else {
                num -= 2;
            }

            System.out.println();
        }
    }
}
