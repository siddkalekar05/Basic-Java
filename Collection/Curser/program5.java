//Collection Methods 
import java.util.*;

class CollectionDemo {
    public static void main(String args[]){
        Collection<String> cobj1 = new ArrayList<String>();
        cobj1.add("Sk");
        cobj1.add("MK");
        cobj1.add("pk");
        cobj1.add("dk");
        System.out.println(cobj1);

        Collection<String> cobj2 = new ArrayList<>();
        cobj2.add("AB");
        cobj2.add("CD");
        cobj2.add("EF");
        cobj2.add("GH");
        System.out.println(cobj2);

        //boolean add All(Collection c)
        cobj1.addAll(cobj2);
        System.out.println(cobj2);
        //boolean remove(object)
        cobj1.remove("Dk");
        System.out.println(cobj1);
        //boolean removeAll(Collection c)
        cobj1.removeAll(cobj2);
        System.out.println(cobj1);
        //boolean contains(Object o)
        System.out.println(cobj1.contains("Sk"));

        //boolean contailAll(Collection c)
        cobj1.containsAll(cobj2);
        System.out.println(cobj1);
        //boolean is empty();
        cobj2.isEmpty();
        
        //int size
        System.out.println(cobj2.size());

        //object[] to Array[]
        Object arr[] = cobj2.toArray();
        for(Object data:arr){
            System.out.println(data);
        }
    }
    
}

