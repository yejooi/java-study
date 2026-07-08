package method;

public class MethodReturn {
    static void main(String[] args) {
        checkAge(10);
        checkAge(20);
    }

    static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자 출입 불가");
            return;
        }
        System.out.println(age + "살, 입장");
    }
}
