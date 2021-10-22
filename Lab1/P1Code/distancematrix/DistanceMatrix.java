package distancematrix;
import java.util.LinkedList;
import java.util.*;

public class DistanceMatrix implements Matrix {
	private LinkedList<LinkedList<Double>> matrix;
	private LinkedList<GP> listOfCities;

	public void DistanceMatrix() {
        listOfCities = new LinkedList<GP>();
        matrix = new LinkedList<LinkedList<Double>>();
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
		//for ( int index1 = 0; index1 < size; index1++ ) {
			//for ( int index2 = 0; index2 < size; index2++ ) {
				//double dist = getDistance(index1, index2);
				//matrix<index1<index2>>.add(dist);
			//}
		//}
        for(LinkedList<double> index1 : matrix) {
            for(double index2 : index1) {
                double dist = getDistance(index1, index2);
                index1.add(index2, dist);
				
            }
        }
	}
	public double getDistance( int index1, int index2 ) {
		GP city1 = listOfCities.get(index1);
		GP city2 = listOfCities.get(index2);
		double dist1to2 = city1.distance(city2);
		return dist1to2;
	}
}/*
public class DistanceMatrix implements Matrix {
	private double[][] matrix;
	private LinkedList<GP> listOfCities;
	
	public void DistanceMatrix() {
        listOfCities = new LinkedList<GP>();
        //matrix = new double[][];
    }
	public void addCity( double x, double y, String name ) {
		GP city = new GP( x, y, name);
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
        matrix = new double[size][size];
        if ( size >= 1) {
            for ( int index1 = 0; index1 < size; index1++ ) {
                for ( int index2 = 0; index2 < size; index2++ ) {
                    double dist = getDistance(index1, index2);
                    matrix[index1][index2] = dist;
                }
            }	
        } else {
            System.out.println("Matrix doesn't exist. No cities registered.");
        }
		
	}
	public double getDistance( int index1, int index2 ) {
		GP city1 = listOfCities.get(index1);
		GP city2 = listOfCities.get(index2);
		double dist1to2 = city1.distance(city2);
		return dist1to2;
	}
}*/