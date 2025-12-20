import java.util.*;
class C2W{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Code from Core");
		System.out.println("Available Courses : " );
		String arr[] = {"Java and Dsa","Python","C/CPP Dsa" , "React" , "Operating System","DBMS"};
		for(int i = 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		System.out.println("Enter the course you want : ");
		String c = sc.nextLine();
		try{
			for(int i = 0;i<arr.length;i++){
				if(c.equals(arr[i])){
					System.out.println("Course is available You can buy ");
					break;
				} else{
					throw new Exception();
			} 
		}
		} 
		catch( Exception e ){
			System.out.println("Sorry ! Course not avualble");
		} 
	}
}	
