import java.util.LinkedList;
import java.awt.*;


public class Continent {
    private LinkedList<PolygonalRegion> ListR = new LinkedList<PolygonalRegion>();

    public Continent( LinkedList<PolygonalRegion> initList ) {
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
            (ListR.get(i)).drawRegion(g);
        }
    }
}