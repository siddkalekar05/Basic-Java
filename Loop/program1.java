import java.io.*;
class LoopDemo1{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter the vlue of n : ");
		int n = Integer.parseInt(br.readLine());
		System.out.println("First "+n+" natural number : ");
		for(int i=1;i<=n;i++){
			System.out.println(i);
		}
	}
}

