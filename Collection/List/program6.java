//Print arraylist in reverse order
import java.util.*;
class ListDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);

       System.out.println(al);

       ListIterator ltr = al.listIterator(al.size());
        while ((ltr.hasPrevious())) {
            System.out.print(ltr.previous()+" ");
            
        }
	System.out.println();
    
    }
}

