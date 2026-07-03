package operator;

public class Operator2 {
    static void main(String[] args) {
        // 전위, 후위 증감 연산자
        int a = 0;
        int b = 0;

        b = ++a;
        System.out.println("a = " + a + ", b = " + b);

        a = 0;
        b = a++;
        System.out.println("a = " + a + ", b = " + b);
    }
}
