package operator;

public class Operator4 {
    // logical
    static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);

        boolean result;
        int c = 15;
        result = 10 < c && c < 20;
        System.out.println(result);
    }
}
