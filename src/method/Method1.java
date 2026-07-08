package method;

public class Method1 {
    static void main(String[] args) {
        int sum1 = add(5, 10);
        System.out.println("결과1: " + sum1);

        int sum2 = add(15, 20);
        System.out.println("결과2: " + sum2);
    }

    static int add(int a, int b) {
        System.out.println(a + " + " + b);
        int sum = a + b;
        return sum;
    }
}
