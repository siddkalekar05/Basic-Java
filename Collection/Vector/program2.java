import java.util.*;

class VectorMethods {
    public static void main(String args[]){
       Vector<Integer> v = new Vector<>();

       v.add(100);
       v.add(200);
       v.add(300);
       v.add(400);
       v.add(500);

       System.out.println(v);

       //size()
       System.out.println(v.size());
       //capacity
       System.out.println(v.capacity());
       //if data>10 
       // capacity = currentcap*2;

       //public void set Size( int new size)
       v.setSize(10);

       //public syn. E elemnts( int index)
       System.out.println(v.elementAt(3));

       //First Element 
       System.out.println(v.firstElement());

       //Last Elemet
       System.out.println(v.lastElement());

       //void setElementAt( E e)
       v.setElementAt(800, 2);
       System.out.println(v);

       //void remove ElementsAt(int index)
       v.removeElementAt(1);
       System.out.println(v);

       //void insertElementAt( E obj,int index)
       v.insertElementAt(250, 1);
       System.out.println(v);

       //void removeAllElements();
       
       //Enumeration
       Enumeration itr = v.elements();
       while(itr.hasMoreElements()){
        System.out.println(itr.nextElement());
       }
    }
}
