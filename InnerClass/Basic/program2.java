class Outer1 {
    class Inner1 {
        void displayInner() {
            System.out.println("Inner-1");
        }
    }
    class Inner2 {
        void displayInner2() {
            System.out.println("Inner-2");
        }
    }
    void displayOuter1() {
        System.out.println("Outer-1");
    }
}

class Client2 {
    public static void main(String[] args) {
        new Outer1().new Inner2().displayInner2();  
        new Outer1().new Inner1().displayInner();  
        new Outer1().displayOuter1();              
    }
}

