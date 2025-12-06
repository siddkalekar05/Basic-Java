import java.util.*;
class PatternDemo32{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter r : ");
		int r = sc.nextInt();
		int ch;
		for(int i=1;i<=r;i++){
			if(i%2!=0){
				 ch = 64+r;
			}else{
				 ch = 65;
			} 
		      for(int j=1;j<=r;j++){
			      if(i%2!=0){
				      System.out.print((char)ch+" ");
				      ch--;
			      }else{
				      System.out.print((char)ch+" ");
				      ch++;}
		      } System.out.println();
		}
	}
}
