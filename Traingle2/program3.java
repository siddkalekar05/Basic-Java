import java.util.*;
class PatternDemo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
		int num=r;
            for (int j = 1; j <= r; j++) {
                if (j <= r - i) {
                    System.out.print("\t");
                } else {
                    System.out.print(num+"\t");
		    num--;
                }
            }
            System.out.println();
        }
    }
}
