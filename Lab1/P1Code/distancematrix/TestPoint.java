package distancematrix;
public class TestPoint{
    public static void main( String[] args ) {
        GP p1 = new GP(1,1, "Barcelona" );
        GP p2 = new GP(2,2, "Madrid" );
        GP p3 = new GP(3,4, "Valencia" );
        double dist1to2 = p1.distance(p2);
        double dist1to3 = p1.distance(p3);
        p1.printPoint();
        p2.printPoint();
        p3.printPoint();
        System.out.println( Double.toString( Math.round( dist1to2 * 100d ) / 100d) );
        System.out.println( Double.toString( Math.round( dist1to3 * 100d ) / 100d ) );
    }
    
}