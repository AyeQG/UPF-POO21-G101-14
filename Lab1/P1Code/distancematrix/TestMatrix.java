package distancematrix;
import java.util.LinkedList;

public class TestMatrix {
    public static void main( String[] args ) {
        /*double[][] matrix = new double[10][10];
        LinkedList< GP > listOfCities = new LinkedList< GP >();*/
        DistanceMatrix distanceMatrix = new DistanceMatrix();
        
        distanceMatrix.addCity( 100, 200, "Barcelona");
        distanceMatrix.addCity( 200, 50, "Madrid");
        System.out.println( distanceMatrix.getCityName(0) );
        System.out.println( distanceMatrix.getCityName(1) );
        
        //System.out.println( city0.getName() );
        
        System.out.println( distanceMatrix.getNoOfCities() );
        System.out.println( distanceMatrix.getDistance(0, 1) );
    }
}