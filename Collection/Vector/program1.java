import java.util.*;

class VectorDemo {
    public static void main(String args[]){
       Vector<Integer> v = new Vector<>();

       v.add(100);
       v.add(200);
       v.add(300);
       v.add(400);
       v.add(500);

       System.out.println(v);

       Enumeration itr = v.elements();
       while(itr.hasMoreElements()){
        System.out.println(itr.nextElement());
       }
    }
}
