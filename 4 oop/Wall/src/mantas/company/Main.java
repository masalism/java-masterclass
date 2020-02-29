package mantas.company;

public class Main {

    public static void main(String[] args) {
        Wall wall = new Wall(4, 5);
        System.out.println(wall.getArea());
        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());

    }
}
