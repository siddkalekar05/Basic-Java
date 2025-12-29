//Map-Hashmap Methods 
import java.util.*;

class HashMapDemo6{ 
    public static void main(String args[]){
        HashMap hm = new HashMap<>();

        hm.put(18, "Vk");
        hm.put(7, "MSD");
        hm.put(45, "RS");

        System.out.println(hm);

        //get(key)
        System.out.println(hm.get(45));
        System.out.println(hm.get(2));

        //remove(key)
        hm.remove(7);
        System.out.println(hm);

        //Contains key(Key)
        System.out.println(hm.containsKey(45));

        //Contains Value(Value)
        System.out.println(hm.containsValue(18));

        //Set key()

        //Values
        Collection data = hm.values();
        System.out.println(data);

        //EntySet()
        Set entry = hm.entrySet();
        System.out.println(entry);

        //iterator()
        Iterator itr = entry.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
       
    }


}
