import java.util.*;
class ArrayDemo5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
		    arr[i] = sc.nextInt();
		}
		System.out.println("Enter num for search");
		int num = sc.nextInt();
		for(int i=0;i<arr.length;i++){
			if(num==arr[i]){
				System.out.println("FOUND At "+arr[i]);
				break;
			}else{
				System.out.println("Not Found");
			}
		}
	}
}
