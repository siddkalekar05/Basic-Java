//Linked HashSet
import java.util.*;

class SetDemo2{
    public static void main(String args[]){
       LinkedHashSet ls = new LinkedHashSet<>();

       ls.add(20);
       ls.add(10);
       ls.add(30);
       ls.add(20);
       ls.add(30);
       ls.add(10);

       System.out.println(ls);
    }
}
