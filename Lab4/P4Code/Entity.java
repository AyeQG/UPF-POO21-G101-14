
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}
	
	abstract public void draw( Graphics g );
	
	public void setColor( Color c ) {
		lineColor = c;
	}
	public Color getColor() {
		return lineColor;
	}

	abstract public void move( int dx, int dy );
	
}
