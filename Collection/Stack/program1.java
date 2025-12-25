import java.util.*;

class StackDemo {
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();

        //Public ele  push(E item)
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println(s);
        
        //Ele pop
        System.out.println(s.pop());

        //Peek()
        System.out.println(s.peek());

        // boolean IsEmpty()
        System.out.println(s.isEmpty());
    }
}
