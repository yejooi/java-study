package method;

public class Overloading2 {
    static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.2, 1.5));
    }

    static int add(int a, int b) {
        System.out.println(1);
        return a + b;
    }

    static double add(double a, double b) {
        System.out.println(2);
        return a + b;
    }
}
