package mantas.company;

public class Rectangle extends Figure2D {

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        if (height <= 0) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " height must be higher than 0");
        }
        if (width <= 0) {
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " width must be higher than 0");
        }
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return (this.height * width);
    }

    @Override
    public double newParameters(double area) {
        return Math.sqrt(area);
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }
}
