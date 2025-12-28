import java.util.*;

class ListDemo2 {
     String name;
        int jersy_no;
        ListDemo2(String name, int jersy_no){
            this.name = name;
            this.jersy_no = jersy_no;
        }
        void display(){
            System.out.println("PlayerName : "+name+" JersyNo: "+jersy_no);
        }
    public static void main(String args[]){
        ArrayList al = new ArrayList<>();

        al.add(new ListDemo2("Siddhu", 45));
        al.add(new ListDemo2("Daya", 7));

        Iterator itr = al.iterator();
        while(itr.hasNext()){
            ListDemo2 cd = (ListDemo2)itr.next();
            cd.display();;
        }
       
    }
}
