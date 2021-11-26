import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;

abstract public class Region extends Entity {
    private Color fillColor;

    public Region( Color lineC, Color fillC ) {
        super ( lineC );
        fillColor = fillC;
    }

    abstract public double getArea();
    public void setFillColor( Color c ) {

    }
    abstract public void move( int movex, int movey );
    abstract public boolean isPointInside( Point p );
    abstract public void draw( Graphics g );

}