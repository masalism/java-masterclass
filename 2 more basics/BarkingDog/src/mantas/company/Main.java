package mantas.company;

public class Main {

    public static void main(String[] args) {
//        shouldWakeUp(true, 1);
//        shouldWakeUp(false, 2);
//        shouldWakeUp(true, 8);
//        shouldWakeUp(true, -1);
        System.out.println(shouldWakeUp( false, 1));
        System.out.println(shouldWakeUp(true, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if ((barking == true) && (hourOfDay < 8 || hourOfDay > 21)) {
            return true;
        } else {
            return false;
        }
    }
}
