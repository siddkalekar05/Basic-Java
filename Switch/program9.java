import java.util.*;
class SwitchDemo9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of sub1 : ");
		int sub1 = sc.nextInt();
		System.out.println("Enter the marks of sub2 : ");
                int sub2 = sc.nextInt();
		System.out.println("Enter the marks of sub3 :" );
                int sub3 = sc.nextInt();
		System.out.println("Enter the marks of sub4 : ");
                int sub4 = sc.nextInt();
		System.out.println("Enter the marks of sub5 :" );
                int sub5 = sc.nextInt();
		if(sub1>40&&sub2>40&&sub3>40&&sub4>40&&sub5>40){
			double result = ((sub1+sub2+sub3+sub4+sub5)/5);
		        int result1 = (int)result/10;
			switch(result1){
				case 9:
					System.out.println("First class and Outstanding : "+result);
				        break;
				case 8:
					System.out.println("First class and Excellent : "+result);
					break;
				case 7:
					System.out.println("First class and Good : "+result);
					break;
				case 6:
					System.out.println("First class : "+result);
					break;
				case 5:
					System.out.println("Second class : "+result);
					break;
				case 4:
					System.out.println("Pass : "+result);
					break;
				default:
					System.out.println("Invalid");
			}
			}else{
				System.out.println("You are fail");
			}
		}
	}	
