import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;
import java.lang.Math.*;


public class EllipsoidalRegion extends Region{
    private Point c;
    private int r1, r2;

    public EllipsoidalRegion( Point initC, int initr1, int initr2) {
        c = initC;
        r1 = initr1;
        r2 = initr2;
    }
    public double getArea() {
        return Math.PI*r1*r2;
    }
    public void drawRegion( Graphics g, String name ) {
        g.setColor(Color );
        g.fillOval( c.getx(), c.gety(), r1, r2 );
        g.setColor(Color );
        g.drawOval( c.getx(), c.gety(), r1, r2 );
        
        g.setColor(Color );
        g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
        g.drawString( name , x, y );
    }
    public void move( Vector v ) {

    }
    public boolean isSelected( Point p ) {

    }
    public boolean isPointInside( Point p ) {

    }
}