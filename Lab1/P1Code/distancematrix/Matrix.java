package distancematrix;
import java.util.LinkedList;

public interface Matrix {
	private double[][] matrix;
	private LinkedList<GP> listOfCities;

	public void DistanceMatrix();
	public void addCity( double x, double y, String name ) {
		GP name = new GP( x, y );
		listOfCities.add( name );
	}
	public String getCityName( int index ) {
		GP city = listOfCities.get(index);
		return city.name; ////?
	}
	public int getNoOfCities() {
		return listOfCities.size();
	}
	public void createDistanceMatrix() {
		
	}
	public double getDistance( int index1, int index2 ) {
		GP city1 = listOfCities.get(index1);
		GP city2 = listOfCities.get(index2);
		double dist1to2 = city1.distance(city2);
		return dist1to2;	////?
	}
}
