
import java.awt.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
import java.util.*;

public class DrawPanel extends JPanel implements MouseListener {
	protected LinkedList< Entity > drawables;
	protected LinkedList< Entity > selection;

	public DrawPanel() {
		drawables = new LinkedList< Entity >();
		selection = new LinkedList< Entity >();
		addMouseListener( this );
	}

	public void addDrawable( Entity entity ) {
		drawables.add( entity );
	}

	protected void paintComponent( Graphics g ) {
		super.paintComponent(g);
		for ( int i = 0; i < drawables.size(); ++i )
			drawables.get( i ).draw( g );
	}

	public void translate( int dx, int dy ) {
		for ( int i = 0; i < selection.size(); ++i )
			selection.get( i ).translate( dx, dy );
	}

	public void mousePressed(MouseEvent e) {
		//for each entity we have created,
		for ( Entity entity: drawables ) {
			//for only the regions
			if ( entity instanceof Region ) {
				Region region = (Region) entity;
				//check if the point is inside the region
				if ( region.isPointInside( new Point( e.getX(), e.getY() ) ) ) {
					//if yes, add the entity to list selection
					selection.add( entity );
				}
			}
		}
	}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}

}
