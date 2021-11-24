import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;

public abstract class Region {
    protected Color fillColor;

    public Region() {

    }
    public abstract double getArea() {

    }
    public void setFillColor( Color c ) {

    }
    public abstract boolean isPointInside( Point p ) {

    }

}