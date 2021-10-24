package distancematrix;

public class TestMatrix {
    public static void main( String[] args ) {
        DistanceMatrix distanceMatrix = new DistanceMatrix();
        
        distanceMatrix.addCity( 100, 200, "Barcelona");
        distanceMatrix.addCity( 200, 50, "Madrid");
        distanceMatrix.addCity( 99, 199, "BCN99");

        System.out.println( distanceMatrix.getCityName(0) );
        System.out.println( distanceMatrix.getCityName(1) );
        
        System.out.println( distanceMatrix.getNoOfCities() );
        System.out.println( distanceMatrix.getDistance(0, 1) );
    }
}