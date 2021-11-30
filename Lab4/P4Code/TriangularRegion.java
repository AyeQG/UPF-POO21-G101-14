import java.util.Arrays;
import java.util.LinkedList;

public class TriangularRegion extends PolygonalRegion {

    public TriangularRegion( Color lcinit, Color fcinit, Point p1, Point p2, Point p3 ) {
        super( lcinit, fcinit, new LinkedList<Point>( Arrays.asList(p1, p2, p3) ));
    }
    
}