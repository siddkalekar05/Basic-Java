import java.util.*;
class Iteratordemo4{
	public static void main(String[] args){
		Vector<String> v = new Vector<>();
		v.add("SK");
		v.add("PK");
		v.add("DK");
		v.add("MK");
		v.add("TK");
		System.out.println(v);

		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}
}
