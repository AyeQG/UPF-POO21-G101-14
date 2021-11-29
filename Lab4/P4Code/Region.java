import java.awt.Graphics;

abstract public class Region extends Entity {
    protected Color fillColor;

    public Region( Color lineC, Color fillC ) {
        super ( lineC );
        fillColor = fillC;
    }

    abstract public double getArea();
    public void setFillColor( Color c ) {
        fillColor = c;
    }
    public Color getFillColor() {
		return fillColor;
	}
    abstract public void move( int movex, int movey );
    abstract public boolean isPointInside( Point p );
    abstract public void draw( Graphics g );

}