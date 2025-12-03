import java.io.*;
class LoopDemo2{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the value of n: ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("Whole number : ");
		for(int i=0;i<=n;i++){
			System.out.println(i);
		}
	}
}
