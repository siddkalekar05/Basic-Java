// Concate and intern 
class StringDemo4{
	public static void main(String[] args){
		String s1 = "Siddhesh";
		String s2 = "Kalekar";
		String s3 = "SiddheshKalekar";
		String s4 = s1.concat(s2);
		System.out.println(s4);
		System.out.println(s3==s4);
		s4.intern();
		s4 = s4.intern();
		System.out.println(s3==s4);
	}
}
