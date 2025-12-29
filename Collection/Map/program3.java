//Map-hashmap(Different key and Different value)
import java.util.*;

class HashMapDemo3{ 
    public static void main(String args[]){
        HashMap<String,String> hm = new HashMap<>();

        String str1 = new String("C2W");
        String str2 = new String("C2W");
        String str3 = new String("C2W");

        hm.put(str1, "MSD");
        hm.put(str2, "VK");
        hm.put(str3, "RS");

        System.out.println(hm);
       
       
    }


}
