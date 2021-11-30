import java.util.Arrays;
import java.util.LinkedList;

public class RectangularRegion extends PolygonalRegion {

    public RectangularRegion( Color lcinit, Color fcinit, Point p1, Point p2 ) {
        super( lcinit, fcinit, new LinkedList<Point>( Arrays.asList(
        p1, new Point(p1.getx(), p2.gety()), p2, new Point(p2.getx(), p1.gety()) ) ));
    }
    
    //the area of this rectangular region will be computed in its parent class
    //PolygonalRegion.getArea()
}