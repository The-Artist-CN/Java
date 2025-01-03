public class example {
    public static void main(String[] args) {
        String greeting = "Hello";
        String trim = greeting.substring(0, 3);
        String aa = new String("aa");
        String bb = "aa";
        String cc = "aa";
        String hh = "hello_world";
        System.out.println(bb == cc);
        System.out.println(aa == bb);
        System.out.println(aa.equals(cc));
        System.out.println(aa.equals(bb));
        System.out.println(trim);


    }
}
