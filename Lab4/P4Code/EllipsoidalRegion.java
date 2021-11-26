import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;

public class EllipsoidalRegion extends Region{
    private Point c;
    private int r1, r2;

    public EllipsoidalRegion( Color lineC, Color fillC, Point initC, int initr1, int initr2 ) {
        super ( lineC, fillC );
        c = initC;
        r1 = initr1;
        r2 = initr2;
    }
    public double getArea() {
        return Math.PI*r1*r2;
    }
    public void draw( Graphics g /*, String name*/ ) {
        g.setColor(Color fillC );
        g.fillOval( c.getx(), c.gety(), r1, r2 );
        g.setColor(Color lineC );
        g.drawOval( c.getx(), c.gety(), r1, r2 );
        
        /*g.setColor(Color );
        g.setFont(new Font("TimesRoman", Font.PLAIN, 10));
        g.drawString( name , c.getx(), c.gety() );*/
    }
    public void move( int movex, int movey ) {

    }
    public boolean isSelected( Point p ) {

    }
    public boolean isPointInside( Point p ) {
        /**FORMULA is as follows:
         * ( (px-cx)^2 / a^2 ) + ( (py-cy)^2 / b^2 ) <= 1 */

        double xa = (p.getx() - c.getx())^2 / r1^2; // (px-cx)^2 / a^2
        double yb = (p.gety() - c.gety())^2 / r2^2; // (py-cy)^2 / b^2
        if ( xa + yb <= 1 ) { return true; }
        else return false;
    }
}