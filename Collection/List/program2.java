import java.util.*;

class ListMethod {
    public static void main(String args[]){

        List<Integer>ll = new ArrayList<>();

        ll.add(10);
        ll.add(11);
        ll.add(20);
        ll.add(22);
        ll.add(30);
        System.out.println(ll);

        //void add(int index,object o)
        ll.add(2, 25);
        System.out.println(ll);

        //new Collection 
        List<Integer> ll2 = new ArrayList<>();
        ll2.add(100);
        ll2.add(200);
        ll2.add(300);

        //void addAll(int index,collection)
        ll.addAll(3, ll2);
        System.out.println(ll);

        //Object get(int index)
        ll2.get(1);

        //object remove(int index)
        ll2.remove(2);
        System.out.println(ll2);

        //object set(int index,object new)
        ll.set(3, 120);
        System.out.println(ll);

        //int indexof(Object o)
        System.out.println(ll2.indexOf(100));

        //int lastIndexof(Object o)
        System.out.println(ll.lastIndexOf(200));

        //ListIterator
        ListIterator ltr = ll.listIterator();

        while ((ltr.hasNext())) {
            System.out.println(ltr.next());
            
        }
    }
}

