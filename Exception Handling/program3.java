class EXC2{
        public static void main(String[] args){
                String arr[] = new String[]{"Physics","Chemistry","Math","Biology"};
                System.out.println("Start code");
                try{
                        System.out.println(arr[7]);
                } catch(Exception e ){
                        System.out.println("Array IndexOutOfBound ");
                }
                System.out.println("End code ");
        }
}
