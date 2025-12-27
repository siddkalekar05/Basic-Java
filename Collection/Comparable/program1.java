//Comparable(Tree set)
import java.util.*;

class Player implements Comparable<Player> {
    String pName;
    int jerNo;
    Player(String pName,int jerNo){
        this.pName = pName;
        this.jerNo = jerNo;
    }

     public int compareTo(Player obj) {
        return jerNo-obj.jerNo;
    }

    void disp(){
        System.out.println("Pname : "+pName+" JerNo: "+jerNo);
    }
    public static void main(String args[]){
        TreeSet ts = new TreeSet<>();

        ts.add(new Player("Virat", 10));
        ts.add(new Player("Rohit", 45));
        ts.add(new Player("Dhone", 7));
        ts.add(new Player("Kl Rahul", 1));

        Iterator itr = ts.iterator();
        while ((itr.hasNext())) {{
            Player obj = (Player)itr.next();
            obj.disp();;
        }
            
        }
       
    }


}
