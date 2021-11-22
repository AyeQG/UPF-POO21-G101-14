import java.util.LinkedList;
import java.awt.*;

public class Country extends PolygonalRegion {
    private String name;
    private LinkedList<City> ListCities = new LinkedList<City>();
    private LinkedList<Country> ListNeighbors = new LinkedList<Country>();
    private City capital;
    private LinkedList<River> ListRivers = new LinkedList<River>();
    private LinkedList<Lake> ListLakes = new LinkedList<Lake>();

    public Country( String initName, LinkedList<Point> initPoints, City initCapital, LinkedList<River> initRivers, LinkedList<Lake> initLakes ) {
        super( initPoints );
        name = initName;
        capital = initCapital;
        ListRivers = initRivers;
        ListLakes = initLakes;
    }
    public String getName() {
        return name;
    }
    public String getCapital() {
        return capital.getName();
    }
    public void addCity( City city ) {
        ListCities.add( city );
    }
    public void addNeighbor( Country country ) {
        ListNeighbors.add( country );
    }
    public void addRiver( River river ) {
        ListRivers.add( river );
    }
    public void addLake( Lake lake ) {
        ListLakes.add( lake );
    }
    public void printCities() {
        System.out.println("List of Cities: ");
        for ( int i = 0; i < ListCities.size(); i++) {
            System.out.print((ListCities.get(i)).getName() + ", ");
        }
        System.out.println("");
    }
    public void printNeighbors() {
        System.out.println("List of Neighbors: ");
        for ( int i = 0; i < ListNeighbors.size(); i++) {
            System.out.print((ListNeighbors.get(i)).getName() + ", ");
        }
        System.out.println("");
    }
    public void printRivers() {
        System.out.println("List of Rivers: ");
        for ( int i = 0; i < ListRivers.size(); i++) {
            System.out.print((ListRivers.get(i)).getName() + ", ");
        }
        System.out.println("");
    }
    public void printLakes() {
        System.out.println("List of Lakes: ");
        for ( int i = 0; i < ListLakes.size(); i++) {
            System.out.print((ListLakes.get(i)).getName() + ", ");
        }
        System.out.println("");
    }
    
    public void drawCountry( Graphics g ) {
        for ( int i = 0; i < ListCities.size(); i++) {
            boolean isCapital = false;
            if ( (ListCities.get(i)).getName() == capital.getName() ) {
                isCapital = true;
            }
            (ListCities.get(i)).drawCity( g, (ListCities.get(i)).getx(), (ListCities.get(i)).gety(), isCapital );
        }
        for ( int i = 0; i < ListRivers.size(); i++) {
            (ListRivers.get(i)).drawRiver(g);
        }
        for ( int i = 0; i < ListLakes.size(); i++) {
            (ListLakes.get(i)).drawLake( g, (ListLakes.get(i)).getx(), (ListLakes.get(i)).gety() );
        }
    }
}
