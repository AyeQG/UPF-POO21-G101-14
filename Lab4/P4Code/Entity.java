
import java.awt.*;

abstract public class Entity {
	protected Color lineColor;

	public Entity( Color lcinit ) {
		lineColor = lcinit;
	}

	abstract public void draw( Graphics g );

	abstract public void move( int dx, int dy );
	
}
