package mantas.company;

public class Main {

    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.7);
        calculator.setSecondNumber(543.5);
        System.out.println(calculator.getDivisionResult());
    }
}
