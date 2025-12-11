import java.util.*;
class ArrayDemo6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows and col : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				arr[i][j] = sc.nextInt();
			}
		} 
		System.out.println("Array ele : ");
                 for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                                System.out.println(arr[i][j]);
			}
		 }
	}
}
