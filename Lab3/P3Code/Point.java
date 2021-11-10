
public class Point {
    protected int x;
    protected int y;
    protected String name;

	public Point( int initx, int inity, String initName ) {
        x = initx;
        y = inity;
        name = initName;
    }
	public int getx() {
        return x;
    }
    public int gety() {
        return y;
    }
    public String getname() {
        return name;
    }
    public void printPoint() {
        System.out.println( name + ":" + Integer.toString(x) + " " + Integer.toString(y) );
    }
    
}
