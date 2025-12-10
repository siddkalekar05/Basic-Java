import java.io.*;
class BufferedDemo2{
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter num1 : ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter num2 : ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Addition : "+(num1+num2));
	}
}
