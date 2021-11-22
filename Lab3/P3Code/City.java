import java.awt.*;
import java.awt.Graphics;

public class City extends Point {
    private int numhab;

    public City( int initX, int initY, String initName, int initHab ) {
        super( initX, initY, initName );
        numhab = initHab;
    }
    public int getNumHab() {
        return numhab;
    }
    public void drawCity( Graphics g, int x, int y, boolean capital ) {
        if ( capital ) {
            g.setColor(Color.red);
            g.fillOval( x, y, 7, 7 );
            g.setColor(Color.blue);
            g.setFont(new Font("AvantGarde", Font.PLAIN | Font.BOLD, 10));
            g.drawString( name , x, y );
        } else {
            g.setColor(Color.green);
            g.fillOval( x, y, 7, 7 );
            g.setColor(Color.blue);
            g.setFont(new Font("AvantGarde", Font.PLAIN, 10));
            g.drawString( name , x, y );
        }
        g.setColor(Color.black);
        g.drawOval( x, y, 7, 7 );
        
        
    }
    
}
