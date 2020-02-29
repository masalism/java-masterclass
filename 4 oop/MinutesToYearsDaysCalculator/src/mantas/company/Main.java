package mantas.company;

public class Main {

    public static void main(String[] args) {
        printYearsAndDays(0);
        printYearsAndDays(-1);
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid value");
        } else {
            long years = minutes / 60 / 24 / 365;
            long remaingMinutes = minutes - (years * 60 * 24 * 365);
            long days = remaingMinutes /60 /24;
            System.out.println(minutes + " min = " + years + " y and " +days + "d");
        }
    }
}