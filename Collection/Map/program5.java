//Map-WeakHashMap(We can remove obj or key)
import java.util.*;

class Demo{
    public void finalize(){
        System.out.println("Object Remove");
    }
}
class HashMapDemo5{ 
    public static void main(String args[]){
        WeakHashMap hm = new WeakHashMap<>();

        Demo obj = new Demo();
        hm.put(obj, "ABC");

        System.out.println(hm);

        obj=null;
        System.gc();

        System.out.println(hm);
 
    }


}
