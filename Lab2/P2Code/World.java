import java.util.LinkedList;
import java.awt.*;


public class World {
    private LinkedList<Continent> ListC = new LinkedList<Continent>();

    public World( LinkedList<Continent> initList ) {
        ListC = initList;
    }
    public double getWorldArea() {
        double worldArea = 0;
        for ( int i = 0; i < ListC.size(); i++) {
            worldArea += (ListC.get(i)).getContinentArea();
        }
        return worldArea;
    }
    public void drawWorld( Graphics g ) {
        for ( int i = 0; i < ListC.size(); i++) {
            (ListC.get(i)).drawContinent(g);
        }
    }
}