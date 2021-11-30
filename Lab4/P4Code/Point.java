
public class Point {
    private int x;
    private int y;

	public Point( int initx, int inity ) {
        x = initx;
        y = inity;
    }

	public int getx() { return x; }
    public int gety() { return y; }

    public void print() {
        System.out.println( Integer.toString(x) + " " + Integer.toString(y) );
    }

    public void translate( int dx, int dy ) {
        x += dx; y += dy;
    }
    
    public Vector difference( Point q ) {
        Vector vec = new Vector( x-q.getx(), y-q.gety() );
        return vec;
    }
    
}
