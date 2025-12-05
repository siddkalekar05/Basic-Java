import java.util.*;
class PatternDemo9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of r: ");
        int r = sc.nextInt(); 
                for (int i = 1; i <= r; i++) {  
                        if (i % 2 == 0) {
                               int num = r;  
                               int ch = 64 + r;  
                               for (int j = 1; j <= r; j++) {
                                     System.out.print(num + "" + (char)ch + " ");  
                                          num--;  
                                          ch--;   
                               }
                        } else {  
                              int num = 1;  
                              int ch = 65;  
                              for (int j = 1; j <= r; j++) {
                                       System.out.print(num + "" + (char)ch + " ");  
                                                   num++;  
                                                   ch++; 
                                              }
                               }
            System.out.println();  
        }
    }
}

