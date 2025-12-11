import java.util.*;
class ArrayDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int arrsize = sc.nextInt();
		System.out.println("Enter data : ");
		int arr1[] = new int[arrsize];
		for(int i=0;i<arrsize;i++){
			arr1[i] = sc.nextInt();
		} System.out.println("Array : ");
		for(int i = 0;i<arr1.length;i++){
			System.out.println(arr1[i]);
		}
	}
}

