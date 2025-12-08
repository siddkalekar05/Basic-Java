import java.util.*;
class PatternDemo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
		int ch = 64+r-i+1;
            for (int j = 1; j <= r; j++) {
                if (j <= r - i) {
                    System.out.print("\t");
                } else {
                    System.out.print((char)ch+"\t");
		    ch++;
                    
                } 
            }
            System.out.println();
	    
        }
    }
}
