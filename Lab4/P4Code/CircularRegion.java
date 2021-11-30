
public class CircularRegion extends EllipsoidalRegion {
    private Point c;
    private int r;

    public CircularRegion( Color lcinit, Color fcinit, Point initC, int initR ) {
        super( lcinit, fcinit, initC, initR, initR );
        c = initC;
        r = initR;
    }
    
    public void print() {
        System.out.println( "center = ( "+ c.getx() +", "+ c.gety() +" )" );
        System.out.println( "radius = "+ r );
    }
}