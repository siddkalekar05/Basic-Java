import java.util.*;

class LinkedListMethod{
    public static void main(String args[]){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Siddhu");
        ll.add("Santosh");
        ll.add("Manisha");
        ll.add("Piyush");

        System.out.println(ll);

        //public void addFirst(E e)
        ll.addFirst("DK");
        System.out.println(ll);

        //public void addLast(E e)
        ll.addLast("Tk");
        System.out.println(ll);

        //public e getFirst()
        System.out.println(ll.getFirst());

        //public e getLast()
        System.out.println(ll.getLast());

        //public e remove first()
        ll.removeFirst();
        System.out.println(ll);

        //public e remove last()
        ll.removeLast();
        System.out.println(ll);

        //public e peekFirst();
        System.out.println(ll.peekFirst());

        //Public e peekLast()
        System.out.println(ll.peekLast());

    }
}
