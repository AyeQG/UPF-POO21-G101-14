import java.util.LinkedList;
import java.awt.*;

public class City extends Point {
    private int numhab;

    public City( int initX, int initY, String initName, int initHab ) {
        super( initX, initY, initName );
        numhab = initHab;

    }
    public int getNumHab() {
        return numhab;
    }
    public void drawCity( Graphics g, int x, int y ) {
        g.fillOval( x, y, 7, 7 );
        g.drawString( name , x, y );    /////name from where
    }
    
}
