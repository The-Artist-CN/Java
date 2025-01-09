import java.lang.String;

public class Example {
  
  public static void main(String[] args) throws ClassNotFoundException{


    Class<?> c1 = String.class;

    String s1 = "hello";
    Class<?> c2 = s1.getClass();

    Class<?> c3 = Class.forName("java.lang.String");

    System.out.println(c1.getName());
    System.out.println(c2.getName());
    System.out.println(c3.getName());
  }
}
