import java.util.*;
class InteratorDemo2{
        public static void main(String[] args){
                ArrayList<Integer> ar = new ArrayList<>();
                ar.add(10);
                ar.add(20);
                ar.add(30);
                ar.add(40);
                System.out.println(ar);
                ListIterator itr = ar.listIterator();
                while(itr.hasNext()){
                        System.out.println(itr.next());
                }
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
        }
}       
