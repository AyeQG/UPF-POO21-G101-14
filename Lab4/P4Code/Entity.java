
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}
	public void setColor( Color c ) { lineColor = c; }
	public Color getColor() { return lineColor; }
	
	abstract public void draw( Graphics g );
	abstract public void translate( int dx, int dy );
	
}
