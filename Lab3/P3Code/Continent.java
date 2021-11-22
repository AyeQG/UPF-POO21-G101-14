import java.util.LinkedList;
import java.awt.*;


public class Continent {
    private LinkedList<Country> ListR = new LinkedList<Country>();

    public Continent( LinkedList<Country> initList ) {
        ListR = initList;
    }
    public double getContinentArea() {
        double totalArea = 0;
        for ( int i = 0; i < ListR.size(); i++) {
            totalArea += (ListR.get(i)).getArea();
        }
        return totalArea;
    }
    public void drawContinent( Graphics g ) {
        for ( int i = 0; i < ListR.size(); i++) {
            (ListR.get(i)).drawRegion( g, ListR.get(i).getName());
            (ListR.get(i)).drawCountry(g);
        }
    }
}