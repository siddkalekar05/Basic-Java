import java.util.*;

class PatternDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        int col = 1;

        for (int i = 1; i <= r; i++) {
            int ch;

               if (i % 2 != 0) {
                ch = 65; 
   	       } else {
                ch = 97; 
            }

            for (int sp = 1; sp <= r - i; sp++) {
                 System.out.print("\t");
            }


            for (int j = 1; j <= col; j++) {
                System.out.print((char) ch + "\t");
                ch++;
            }

            System.out.println();
            col += 2;
        }
    }
}

