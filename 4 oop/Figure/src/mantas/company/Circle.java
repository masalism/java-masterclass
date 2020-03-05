package mantas.company;

public class Circle extends Figure2D {
    private double r;
    private double area;

    public Circle(double r) {
        if (r <= 0) {
            // rodyti klaida
            throw new IllegalArgumentException(this.getClass().getSimpleName() + " radius must be higher than 0");
        }
        this.r = r;
    }

//    public Circle(double area) {
//        if (area <= 0) {
//            // rodyti klaida
//            throw new IllegalArgumentException(this.getClass().getSimpleName() + " radius must be higher than 0");
//        }
//        this.area = area;
//    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public double newParameters(double area) {
        return Math.sqrt(area / Math.PI);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
