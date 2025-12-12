// Reverse the string 
class Reversestring { 
	public static void main(String[] args){
		String s1 = "Siddhesh";
		System.out.println(s1);
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		s1 = sb.toString();
		System.out.println(s1);
	}
}
