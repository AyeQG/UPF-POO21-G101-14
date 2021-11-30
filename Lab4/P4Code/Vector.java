
public class Vector {
    private int x;
    private int y;

    public Vector( int xi, int yi ) {
        x = xi;
        y = yi;
    }
    
    public int getx() { return x; }
    public int gety() { return y; }

    public double crossProduct ( Vector v2 ) {
        return x*v2.gety() - y* v2.getx();
    }

    public void print() {
        System.out.println( "Vector: ("+ Integer.toString(x) + ", " + Integer.toString(y) +")" );
    }
}