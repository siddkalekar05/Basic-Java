//Map-hashmap(Same key but different value)
import java.util.*;

class HashMapDemo2{ 
    public static void main(String args[]){
        HashMap<String,String> hm = new HashMap<>();

        String str1 = "C2W";
        String str2 = "C2W";
        String str3 = "C2W";

        hm.put(str1, "MSD");
        hm.put(str2, "VK");
        hm.put(str3, "RS");

        System.out.println(hm);
       
       
    }


}
