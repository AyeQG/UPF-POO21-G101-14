import java.util.Arrays;
import java.util.LinkedList;

public class TriangularRegion extends PolygonalRegion {
    private LinkedList<Point> ListP = new LinkedList<Point>();

    public TriangularRegion( Color lcinit, Color fcinit, Point p1, Point p2, Point p3 ) {
        super( lcinit, fcinit, new LinkedList<Point>( Arrays.asList(p1, p2, p3) ));
        ListP.add( p1 );
        ListP.add( p2 );
        ListP.add( p3 );
    }
    
    public void print() {
        for (Point point : ListP) {
            System.out.println( "( "+ point.getx() +", "+ point.gety() +" )" );
        }
    }
}