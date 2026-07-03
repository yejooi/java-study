package operator;

public class Operator3 {
    static void main(String[] args) {
        // compare
        int a = 2;
        int b = 3;

        boolean result = a == b;
        System.out.println(result);

        String s1 = "string 1";
        String s2 = "string 2";

        result = "hello".equals("hello");
        System.out.println(result);
        result = s1.equals(s2);
        System.out.println(result);
    }
}
