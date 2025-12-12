class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity()); // Default capacity = 16
        System.out.println(s1.append("SK"));
        System.out.println(s1.append("SIDDHESHSANTOSHKALEKAR"));
        System.out.println(s1);
        System.out.println(s1.capacity());
    }
}

