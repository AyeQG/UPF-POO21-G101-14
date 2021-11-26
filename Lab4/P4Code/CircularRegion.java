import java.util.LinkedList;
import java.awt.*;

public class CircularRegion extends EllipsoidalRegion {

    public CircularRegion( Color lineC, Color fillC, Point initC, int initr ) {
        super( lineC, fillC, initC, initr, initr );
    }
}