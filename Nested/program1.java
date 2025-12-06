import java.util.*;
class PatternDemo31{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of rows : ");
		int r = sc.nextInt();
		int ch = r+64;
		for(int i=1;i<=r;i++){
			for(int j=ch;j<=r+64;j--){
				if(j>64){
					System.out.print((char)j+" ");}
			} System.out.println();
		}
	}
}
