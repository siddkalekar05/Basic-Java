//Map-Identityhashmap (Same key - Different values)
import java.util.*;

class HashMapDemo4{ 
    public static void main(String args[]){
        IdentityHashMap<String,String> hm = new IdentityHashMap<>();

        String str1 = new String("C2W");
        String str2 = new String("C2W");
        String str3 = new String("C2W");

        hm.put(str1, "MSD");
        hm.put(str2, "VK");
        hm.put(str3, "RS");

        System.out.println(hm);
       
       
    }


}
