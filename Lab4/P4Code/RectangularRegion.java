import java.util.Arrays;
import java.util.LinkedList;

public class RectangularRegion extends PolygonalRegion {
    private LinkedList<Point> ListP;

    /*public TriangularRegion( Color lineC, Color fillC, LinkedList<Point> lp ) {
        super( lineC, fillC, lp );
        ListP = lp;
    }*/
    public RectangularRegion( Color lineC, Color fillC, Point p1, Point p2 ) {
        super( lineC, fillC, new LinkedList<Point>( Arrays.asList(p1, p2, new Point(p1.getx(), p2.gety()), new Point(p2.getx(), p1.gety()) ) ));
        ListP.add( p1 );
        ListP.add( p2 );
        ListP.add( new Point(p1.getx(), p2.gety()) );
        ListP.add( new Point(p2.getx(), p1.gety()) );

    }
    public void print() {
        for (Point point : ListP) {
            System.out.println( "( "+ point.getx() +", "+ point.gety() +" )" );
        }
    }
}