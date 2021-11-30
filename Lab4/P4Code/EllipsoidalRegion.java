import java.awt.Graphics;

public class EllipsoidalRegion extends Region{
    private Point c;
    private int r1, r2;

    public EllipsoidalRegion( Color lcinit, Color fcinit, Point initC, int initr1, int initr2 ) {
        super ( lcinit, fcinit );
        c = initC;
        r1 = initr1;
        r2 = initr2;
    }

    public double getArea() {
        return Math.PI*r1*r2;
    }

    public void draw( Graphics g ) {
        //Graphics draw ovals starting from the upper left corner
        //therefore we substract the radius.
        //The 3rd and 4th parameters are the width and height diameters
        //so we multiply by 2 the radius.
        g.setColor( fillColor );
        g.fillOval( c.getx()-r1/2, c.gety()-r2/2, r1*2, r2*2 );
        g.setColor( lineColor );
        g.drawOval( c.getx()-r1/2, c.gety()-r2/2, r1*2, r2*2 );
    }

    public void translate( int dx, int dy ) {
        c.translate(dx, dy);
    }

    /*public boolean isSelected( Point p ) {

    }*/

    public boolean isPointInside( Point p ) {
        /**FORMULA is as follows:
         * ( (px-cx)^2 / a^2 ) + ( (py-cy)^2 / b^2 ) <= 1
         */
        double xa = (p.getx() - c.getx())^2 / r1^2; // (px-cx)^2 / a^2
        double yb = (p.gety() - c.gety())^2 / r2^2; // (py-cy)^2 / b^2
        if ( xa + yb <= 1 ) { return true; }
        else return false;
    }
}