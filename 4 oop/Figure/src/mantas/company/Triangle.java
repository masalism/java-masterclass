package mantas.company;

public class Triangle extends Figure2D {
    private double krastine;
    private double aukstine;

    public Triangle(double krastine, double aukstine) {
        this.krastine = krastine;
        this.aukstine = aukstine;
    }

    @Override
    public double area() {
        return (getKrastine() * getAukstine()) / 2;
    }

    @Override
    public double newParameters(double area) {
        return (Math.pow(getKrastine(), 2) * Math.sqrt(3)) / 4;
    }

    @Override
    public double perimeter() {
        return getKrastine() * 3;
    }

    public double getKrastine() {
        return krastine;
    }

    public void setKrastine(double krastine) {
        this.krastine = krastine;
    }

    public double getAukstine() {
        return aukstine;
    }

    public void setAukstine(double aukstine) {
        this.aukstine = aukstine;
    }
}
