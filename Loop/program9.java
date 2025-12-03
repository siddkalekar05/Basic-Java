import java.io.*;
class ForDemo9{
        public static void main(String[] args)throws IOException{
                InputStreamReader isr  = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Enter n : ");
                int n = Integer.parseInt(br.readLine());
		int sum =0;
                for(int i = 0;i<=n;i++){
			sum+=i;
                        
                } System.out.println(sum);
        }
}
