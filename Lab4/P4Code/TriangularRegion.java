import java.util.LinkedList;
import java.awt.*;


public class TriangularRegion extends PolygonalRegion {
    
    
    public TriangularRegion( Point p1, Point p2, Point p3 ) {
        super( new LinkedList<Point> ( new Point[]{p1, p2, p3} ) );
    }
    public double getArea() {

    }
}