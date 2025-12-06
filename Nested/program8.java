import java.util.*;
class PatternDemo38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
		int ch = r+64;
		int num =1;
            for (int j = 1; j <= r; j++) {
                if (i % 2 != 0) {
                    System.out.print((char) ch + " ");
		    ch--;
                } else {
                    System.out.print(num + " ");
		    num++;
                }
            }            
            System.out.println();
        }
    }
}
