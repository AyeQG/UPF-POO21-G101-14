import java.util.LinkedList;
import java.awt.*;

public class Country extends PolygonalRegion {
    private String name;
    private LinkedList<City> ListCities = new LinkedList<City>();
    private LinkedList<Country> ListNeighbors = new LinkedList<Country>();
    private City capital;

    public Country( String initName, LinkedList<Point> initListPoints, City initCapital ) {
        super( initListPoints );
        name = initName;
        capital = initCapital;

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
    public void addNeighbor( Country country) {
        ListNeighbors.add( country );
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
    public void drawCountry( Graphics g ) {
        for ( int i = 0; i < ListCities.size(); i++) {
            (ListCities.get(i)).drawCity(g, (ListCities.get(i)).getx(), (ListCities.get(i)).gety());
        }
    }
}
