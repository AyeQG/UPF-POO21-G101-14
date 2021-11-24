
public class Point {
    private int x;
    private int y;

	public Point( int initx, int inity ) {
        x = initx;
        y = inity;
    }
	public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public void printPoint() {
        System.out.println( Integer.toString(x) + " " + Integer.toString(y) );
    }
    public Point move( int movex, int movey ) {
        Point newp = new Point( x + movex, y + movey );
        return newp;
    }
    public Vector difference( int xi, int yi ) {
        Vector vec = new Vector( x-xi, y-yi );
        return vec;
    }
    
}
