package method;

public class Overloading1 {
    static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
    }

    static int add(int a, int b) {
        System.out.println(1);
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println(2);
        return a + b + c;
    }
}
