package mantas.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);
        int previousResult = result;
        System.out.println(previousResult);
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++;
        System.out.println("result++ = " + result);

        result--;
        System.out.println("result-- = " + result);

        result += 2;
        System.out.println("result +=2 = " +result);

        result *= 10;
        System.out.println("result *=10 = " + result);

        result /= 3;
        System.out.println("result /=10 = " + result);

        result -= 2;
        System.out.println("result -=2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if(topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if(isCar) {
            System.out.println("This is not supposed to happen");
        }
        isCar = true;

        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("was car is true");
        }
        System.out.println("wasCar = " + wasCar);

        double a = 20.00d;
        double b = 80.00d;
        double firstResult = (a + b) * 100.00d;
        double remainder = firstResult % 40.00d;
        boolean myBool = remainder == 0 ? true : false;
        System.out.println(myBool);

        if (!myBool) {
            System.out.println("Got some remainder of " + remainder);
        }
    }
}
