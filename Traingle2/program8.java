import java.util.*;
class PatternDemo8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
	int num = r;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (j < i) {
                    System.out.print("\t");
                } else {
                    System.out.print(num+"\t");
                }
            } num--;
            System.out.println();
        }
    }
}
