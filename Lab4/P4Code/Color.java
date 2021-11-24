import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;


public class Color {
    private double x; //r, h
    private double y; //g, s
    private double z; //b, v
    private boolean isRGB;
    
    public Color( double xi, double yi, double zi, boolean isrgb ) {
        x = xi; y = yi; z = zi; isRGB = isrgb;
    }
    public void toHSV() {
        double h, s, v;
        double min, max, delta;
        boolean converted = false;

        min = Math.min(Math.min(x, y), z);
        max = Math.max(Math.max(x, y), z);
        while (converted == false) {
            v = max; //V
            delta = max - min;
    
            if( max != 0 ) { s = delta / max; } //S
            else {
                s = 0;
                h = -1;
                x = h; y = s; z = v;
                converted = true;
            }

            if( x == max ) // H
                h = ( y - z ) / delta; // between yellow & magenta
            else if( y == max )
                h = 2 + ( z - x ) / delta; // between cyan & yellow
            else
                h = 4 + ( x - y ) / delta; // between magenta & cyan
            h *= 60;    // degrees
    
            if( h < 0 )
                h += 360;
            x = h; y = s; z = v;
            converted = true;
        }
       
    }
    public void toRGB() {
        
    }
}