import java.io.*;
class ArrayDemo4{
        public static void main(String[] args)throws IOException{
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                System.out.println("Enter array size : ");
                int arrsize = Integer.parseInt(br.readLine());
                int arr[] = new int[arrsize];
                System.out.println("Enter data :");
                for(int i=0;i<arrsize;i++){
                         arr[i]=Integer.parseInt(br.readLine());
                }
                System.out.println("Array : ");
                for(int i=0;i<arr.length;i++){
                        System.out.println(arr[i]);
                }
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		
		}
		 System.out.println(sum);
        }
}
