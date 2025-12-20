
class EXC1{
	public static void main(String[] args){
		int arr[] = new int[]{1,2,3,4,5};
		System.out.println("Start code");
		try{
			System.out.println(arr[7]);
		} catch(Exception e ){
			System.out.println("Array IndexOutOfBound ");
		} 
		System.out.println("End code ");
	}
}
