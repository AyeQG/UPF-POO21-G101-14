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
		String city = listOfCities.get(index);
		return city.name;
	}
	public int getNoOfCities() {
		return listOfCities.size();
	}
	public void createDistanceMatrix() {
		
	}
	public double getDistance( int index1, int index2 ) {
		
	}
}
