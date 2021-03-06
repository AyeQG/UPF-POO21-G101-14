package distancematrix;
import java.util.LinkedList;

public class DistanceMatrix implements Matrix {
	private LinkedList<LinkedList<Double>> matrix = new LinkedList<LinkedList<Double>>();
	private LinkedList<GP> listOfCities = new LinkedList<GP>();

	public DistanceMatrix() {
    }
	public void addCity( double x, double y, String name ) {
		GP city = new GP( x, y, name );
		listOfCities.add( city );
        createDistanceMatrix();
	}
	public String getCityName( int index ) {
		GP city = listOfCities.get(index);
		return city.getName();
	}
	public int getNoOfCities() {
		return listOfCities.size();
	}
	public void createDistanceMatrix() {
		int size = getNoOfCities();
		LinkedList<Double> listDistance = new LinkedList<Double>();
		for ( int index1 = 0; index1 < size; index1++ ) {
			for ( int index2 = 0; index2 < size; index2++ ) {
				double distance = getDistance( (size-1), index2 );
				listDistance.add(distance);
			}
		}
		matrix.add(listDistance);
	}
	public double getDistance( int index1, int index2 ) {
		GP city1 = listOfCities.get(index1);
		GP city2 = listOfCities.get(index2);
		double dist1to2 = city1.distance(city2);
		return dist1to2;
	}
}