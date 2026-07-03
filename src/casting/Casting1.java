package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue = 1.5;

        longValue = intValue;
        System.out.println("longValue = " + longValue);

        intValue = (int)doubleValue;
        System.out.println("intValue = " + intValue);
    }
}
