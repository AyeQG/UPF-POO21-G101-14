import java.util.Arrays;
import java.util.LinkedList;

public class TriangularRegion extends PolygonalRegion {
    private LinkedList<Point> ListP;

    /*public TriangularRegion( Color lineC, Color fillC, LinkedList<Point> lp ) {
        super( lineC, fillC, lp );
        ListP = lp;
    }*/
    public TriangularRegion( Color lineC, Color fillC, Point p1, Point p2, Point p3 ) {
        super( lineC, fillC, new LinkedList<Point>( Arrays.asList(p1, p2, p3) ));
        ListP.add( p1 );
        ListP.add( p2 );
        ListP.add( p3 );
    }
    public void print() {
        for (Point point : ListP) {
            System.out.println( "("+ point.getx() +","+ point.gety() +")" );
        }
    }
}