//Remove all even numbers from list
import java.util.*;
class ListDemo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);

       System.out.println(al);
    
       Iterator itr = al.iterator();
       while(itr.hasNext()){
        int num = (int) itr.next();
        if(num%2==0){
            itr.remove();

        }
        
       }
        System.out.println("Odd_List : "+al);
    }
    
}

