import java.util.LinkedList;

public class TestPolygonalRegion {
    public static void main( String[] args ) {
        LinkedList<Point> list = new LinkedList<Point>();
        Point p1 = new Point(2, 5, "p1");
        Point p2 = new Point(-4, 3, "p2");
        Point p3 = new Point(5, 1, "p3");
        p1.printPoint();
        p2.printPoint();
        p3.printPoint();
        list.add(p1);
        list.add(p2);
        list.add(p3);

        PolygonalRegion Poly = new PolygonalRegion( list );
        double area = Poly.getArea();
        System.out.println( area );

    }
}