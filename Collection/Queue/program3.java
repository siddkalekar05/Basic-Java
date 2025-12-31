import java.util.*;

class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(10);
        pq.offer(20);

        System.out.println("Priority Queue: " + pq);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}

