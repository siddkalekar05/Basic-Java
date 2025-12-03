import java.io.*;
class ForDemo7{
        public static void main(String[] args)throws IOException{
                InputStreamReader isr  = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Enter n : ");
                int n = Integer.parseInt(br.readLine());
                for(int i = 1;i<=10;i++){
                        System.out.println(i*n);
                }
        }
}
