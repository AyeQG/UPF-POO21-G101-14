
public class CircularRegion extends EllipsoidalRegion {
    private Point c;
    private int r;

    public CircularRegion( Color lineC, Color fillC, Point initC, int initR ) {
        super( lineC, fillC, initC, initR, initR );
        c = initC;
        r = initR;
    }
    public void print() {
        System.out.println( "center = ( "+ c.getx() +", "+ c.gety() +" )" );
        System.out.println( "radius = "+ r );
    }
}