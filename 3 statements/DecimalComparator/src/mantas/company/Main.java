package mantas.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(areEqualByDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByDecimalPlaces(-3.123, 3.123));
    }

    public static boolean areEqualByDecimalPlaces (double num1, double num2) {

        if ((Math.round(num1 * 1000.0) / 1000.0) == (Math.round(num2 * 1000.0) / 1000.0)) {
            return true;
        } else {
            return false;
        }
    }
}
