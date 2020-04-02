import shapes.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Triangle(3,5));
        shapes.add(new Triangle(43,52));
        shapes.add(new Rectangle(32,51));
        shapes.add(new Rectangle(23,15));
        shapes.add(new Sqare(3));
        shapes.add(new Sqare(35));
        shapes.add(new Round(35));
        shapes.add(new Round(135));

        for (Shape s:shapes) {
            System.out.println(s.getArea()+" | "+s.toString());
        }

        }
    }


