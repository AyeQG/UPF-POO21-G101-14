package distancematrix;
public class GP {
    private double xCoor;
    private double yCoor;
    private String name;

	public GP( double initx, double inity, String initName ) {
        xCoor = initx;
        yCoor = inity;
        name = initName;
    }
	public double getx() {
        return xCoor;
    }
    public double gety() {
        return yCoor;
    }
    public String getName() {
        return name;
    }
    public double distance( GP p2 ) {
        double x2 = p2.getx();
	    double y2 = p2.gety();
        double dist = Math.sqrt(Math.pow(xCoor-x2, 2) + Math.pow(yCoor-y2, 2));
        dist = Math.round( dist * 100d ) / 100d;
		return dist;
    }
    public void printPoint() {
        System.out.println( name + ": " + Double.toString(xCoor) + " " + Double.toString(yCoor) );
    }
    
}
