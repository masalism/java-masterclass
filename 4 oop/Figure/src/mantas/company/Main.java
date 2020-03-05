package mantas.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<NewParameters> figure = new ArrayList<>();
        figure.add(new Circle(12));
        figure.add(new Rectangle(12,12));
        figure.add(new Square(15));
        figure.add(new Triangle(4, 6));

        getNewLength(figure, 150);

        List<Area> areas = new ArrayList<>();
        areas.add(new Square(5));
        areas.add(new Square(10));
        System.out.println("Plotai " + plotai(areas));

        List<Figure2D> figure2D = new ArrayList<>();
        figure2D.add(new Rectangle(5,5));
        figure2D.add(new Rectangle(5,5));
    }

    public static void getNewLength (List<NewParameters> figures, double area) {
        double newArea;
        for (NewParameters f : figures) {
            newArea = f.newParameters(area);

            System.out.println(f.getClass().getSimpleName() + " naujas plotas yra " + area + ". Nauji matmuo bus " + newArea);
        }
    }

    static double perimetrai(List<Perimeter> figuros) {
        double bendrasPerimetras = 0;
        for (Perimeter f : figuros) {
            bendrasPerimetras += f.perimeter();
        }
        return bendrasPerimetras;
    }

    static double plotai(List<Area> figuros) {
        double bendrasPlotas = 0;
        for (Area f : figuros) {
            bendrasPlotas += f.area();
        }
        return bendrasPlotas;
    }
}
