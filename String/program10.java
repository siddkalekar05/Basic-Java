//String Tokennizer 
import java.util.*;
class StringTok{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name college city salary : ");
		String info = sc.nextLine();
		StringTokenizer st = new StringTokenizer(info," ");
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
	}
}
