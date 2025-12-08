import java.util.*;
class PatternDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) { 
		int ch = 64+i;
            for (int sp = 1; sp < i; sp++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= r + 1 - i; j++) {
                if ((r % 2 == 0 && (i + j) % 2 == 0) || (r % 2 != 0 && (i + j) % 2 != 0)) {
                    System.out.print(ch + "\t");
	       ch++;	    
                } else {
                    System.out.print((char) ch + "\t"); 
		    ch++;
                }
              
            }
            System.out.println();
	    ch++;
        }
    }
}

