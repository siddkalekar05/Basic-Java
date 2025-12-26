//Set Methods
import java.util.*;

class SetDemo4{ 
    public static void main(String args[]){
       TreeSet<String> ts = new TreeSet<>();

       ts.add("Tushar");
       ts.add("Madhur");
       ts.add("Nitin");
       ts.add("Shridhar");

       System.out.println(ts);

       //first
       System.out.println(ts.first());

       //Last
       System.out.println(ts.last());

       //Lower
       System.out.println(ts.lower("Shridhar"));

       //floor
       System.out.println(ts.lower("Shridhar"));

       //higher
       System.out.println(ts.higher("Nitin"));

       //ceiling
       System.out.println(ts.ceiling("Madhur"));

       //Sorted set

       //Subset(E,E)
       System.out.println(ts.subSet("Madhur", "Tushar"));

       //headset
       System.out.println(ts.headSet("Nitin"));

       //Tailset
       System.out.println(ts.tailSet("Madhur"));

       //Navigable set

       //Subset(E,bool,E,bool)
       System.out.println(ts.subSet("Madhur", true, "Tushar", true));

       //Headset(E,Bool)
       System.out.println(ts.headSet("Nitin", true));

       //Tailset(E,bool)
       System.out.println(ts.tailSet("Nitin", true));
       
    }


}
