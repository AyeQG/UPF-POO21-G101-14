package distancematrix;
import java.util.LinkedList;

public interface Matrix {
	public double[][] matrix;
	public LinkedList<GP> listOfCities;

	public void DistanceMatrix();
	public void addCity( double x, double y, String name );
	public String getCityName( int index );
	public int getNoOfCities();
	public void createDistanceMatrix();
	public double getDistance( int index1, int index2 );
}
