package mantas.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point () {}

    public double distance () {
        return Math.sqrt((this.x - 0.0) * (this.x - 0.0) + (this.y - 0.0) * (this.y - 0.0));
    }

    public double distance (int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    public double distance (Point another) {
        return Math.sqrt((this.x - another.x) * (this.x - another.x) + (this.y - another.y) * (this.y - another.y));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
