import java.util.*;
class PatternDemo12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
                int ch = r+64;
            for (int j = 1; j <= r; j++) {
                if (j < i) {
                    System.out.print("\t");
                } else {
                    System.out.print((char)ch+"\t");
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
