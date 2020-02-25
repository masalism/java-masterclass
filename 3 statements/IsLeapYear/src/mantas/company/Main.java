package mantas.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(2004));
        System.out.println(isLeapYear(2020));
    }

    public static boolean isLeapYear (int year) {
        if ((year < 0) || (year > 9999)) {
            return false;
        }
        if ((year % 4 == 0) || (year % 100 == 0) || (year % 100 == 0)) {
            return true;
        } else {
            return false;
        }
    }

}
