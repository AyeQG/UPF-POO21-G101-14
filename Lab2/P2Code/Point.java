
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
    
}
