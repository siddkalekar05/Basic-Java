import java.util.*;
class PatternDemo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();        
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (j <= r - i) {
                    System.out.print("\t");  
                } else {
                    System.out.print("*\t");  
		}
            }
            System.out.println();
        }
    }
}

