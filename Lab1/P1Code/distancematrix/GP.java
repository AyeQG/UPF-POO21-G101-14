
public class GP {
    private double xCoor;
    private double yCoor;

	public GP( double initx, double inity ) {
        xCoor = initx;
        yCoor = inity;
    }
	public double getx() {
        return xCoor;
    }
    public double gety() {
        return yCoor;
    }
    public double distance( GP p2 ) {
        double x2 = p2.getx();
	    double y2 = p2.gety();
		return Math.sqrt(Math.pow(xCoor-x2, 2) + Math.pow(yCoor-y2, 2));
    }
    public void printPoint() {
        System.out.println( Double.toString(xCoor) + Double.toString(yCoor) );
    }
    
}
