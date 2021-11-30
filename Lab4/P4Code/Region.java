import java.awt.Graphics;

abstract public class Region extends Entity {
    protected Color fillColor;

    public Region( Color lcinit, Color fcinit ) {
        super ( lcinit );
        fillColor = fcinit;
    }
    public void setFillColor( Color c ) {
        fillColor = c;
    }
    public Color getFillColor() {
		return fillColor;
	}
    abstract public double getArea();
    abstract public void translate( int movex, int movey );
    abstract public boolean isPointInside( Point p );
    abstract public void draw( Graphics g );

}