package distancematrix;
import java.util.LinkedList;

public class TestMatrix {
    public static void main( String[] args ) {
        DistanceMatrix distanceMatrix = new DistanceMatrix();
        //LinkedList< GP > listOfCities = new LinkedList< GP >();
        distanceMatrix.addCity( 100, 200, "Barcelona");
        distanceMatrix.addCity( 200, 50, "Madrid");
        distanceMatrix.createDistanceMatrix();
        /**GP city0 = listOfCities.get(0);
        System.out.println( city0.getName() );
        System.out.println( listOfCities );*/
    }
}