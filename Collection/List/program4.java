//Store N numbers and find the maximum
import java.util.*;
class ListDemo4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
       al.add(100);
       al.add(250);
       al.add(360);
       al.add(44);

       System.out.println(al);

       Iterator itr = al.iterator();
       int max =0;
       while(itr.hasNext()){
        int num = (int) itr.next();
        if(max<num){
            max=num;
        }
        
       }
        System.out.println("Max ele in array list : "+max);
    }
    
}

