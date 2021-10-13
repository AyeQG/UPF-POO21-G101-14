
package distancematrix;

public interface Matrix {
	private array of array of floats matrix; /** ??? */
	private array of GP lCities;

	public void addCity( double x, double y, String name ) {
		
	}
	public String getCityName( int index );
	public int getNoOfCities();
	public void createDistanceMatrix();
	public double getDistance( int index1, int index2 ) {
		
	}
}
