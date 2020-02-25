package mantas.company;

public class Main {

    public static void main(String[] args) {
        // creating objects
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("911");
        System.out.println("Model is " + porsche.getModel());
    }
}
