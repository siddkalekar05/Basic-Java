//Queue Methods 

import java.util.*;

class QueueDemo2 {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        // offer
        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println("Queue: " + q);

        // peek
        System.out.println("Peek: " + q.peek());

        // poll
        System.out.println("Poll: " + q.poll());

        // remove
        System.out.println("Remove: " + q.remove());

        // size
        System.out.println("Size: " + q.size());

        // contains
        System.out.println("Contains 30? " + q.contains(30));

        // isEmpty
        System.out.println("Is Empty? " + q.isEmpty());

        // clear
//        q.clear();
//      System.out.println("Queue after clear: " + q);

        // peek & poll 
        System.out.println("Peek : " + q.peek());
        System.out.println("Poll : " + q.poll());
    }
}

