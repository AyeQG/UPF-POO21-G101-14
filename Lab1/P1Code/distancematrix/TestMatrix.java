package distancematrix;

public class TestMatrix {
    public static void main( String[] args ) {
        DistanceMatrix distanceMatrix = new DistanceMatrix();
        
        //Code to check if DistanceMatrix's methods work. Print use.
        distanceMatrix.addCity( 100, 200, "Barcelona");
        distanceMatrix.addCity( 200, 50, "Madrid");
        distanceMatrix.addCity( 99, 200, "BCN01");

        System.out.println( distanceMatrix.getCityName(0) );
        System.out.println( distanceMatrix.getCityName(1) );
        System.out.println( distanceMatrix.getNoOfCities() );
        System.out.println( distanceMatrix.getDistance(0, 2) );
        System.out.println( distanceMatrix.getDistance(0, 1) );
    }
}