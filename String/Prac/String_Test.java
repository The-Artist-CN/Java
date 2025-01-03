public class String_Test {
    public static void main(String[] args) {
        String greeting = "Hello";
        String trim = greeting.substring(0, 3);
        String aa = new String("aa");
        String bb = "aa";
        String cc = "aa";
        String hh = "hello_world";
        System.out.println(bb == cc);
        String aa = "aa";
        String bb = new String("aa");
        String cc = bb;
        String dd = "aa";
        int a = 1;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        System.out.println(aa == bb);
        System.out.println(aa == dd);
        System.out.println(bb.intern() == aa);
        System.out.println(cc == bb);
    }
}
