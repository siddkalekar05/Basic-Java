import java.util.*;
class PatternDemo39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r: ");
        int r = sc.nextInt();
	int ch;
	int num;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i % 2 != 0 && j%2!=0) {
			 ch = 64+r;
                         num = 1;
                    System.out.print((char) ch + " ");
                    ch--;
		    num++;
                } else if(i%2!=0 &&j%2==0) {
			ch = 64+r;
			num = 1;
                    System.out.print(num + " ");
                    num++;
                } else{ 
			ch = 65;
			num = 1;
			if(i%2!=0 && j%2!=0){
				System.out.print((char)ch+" ");
				ch++;
			}else if( i%2!=0 && j%2==0){
				System.out.print(num+" " );
				num++;
			}else{
			}

            }
                   }
	    System.out.println();
 }
    }
}
