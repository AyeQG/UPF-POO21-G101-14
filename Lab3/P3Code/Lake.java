import java.awt.*;
import java.awt.Graphics;

public class Lake extends Point {
    private int width;
    private int height;

    public Lake( int initX, int initY, String initName, int initWidth, int initHeight ) {
        super( initX, initY, initName );
        width = initWidth;
        height = initHeight;
    }
    public void drawLake( Graphics g, int x, int y ) {
        g.setColor(Color.blue);
        g.fillOval( x, y, width, height );
        
        g.setColor(Color.magenta);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
        g.drawString( name , x, y );
    }
    
}
