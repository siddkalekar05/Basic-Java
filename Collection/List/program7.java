//Reverse an ArrayList from k ele 
import java.util.*;
class ListDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> al = new ArrayList<Integer>();
       al.add(1);
       al.add(2);
       al.add(3);
       al.add(4);

       System.out.println(al);

       System.out.println("Enter k ele : ");
       int k = sc.nextInt();
       Collections.reverse(al.subList(k, al.size()));
       System.out.println(al);
    }
}

