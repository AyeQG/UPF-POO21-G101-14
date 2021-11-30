import java.util.LinkedList;
import java.util.Arrays;

public class TestColor {
    public static void main( String[] args ) {
        System.out.println( "///RED.    rgb///" );
        RGBColor red = new RGBColor(255,0,0);   // RED in rgb
        red.print();
        
        HSVColor redhsv = red.toHSV();          // rgb to hsv
        redhsv.print();

        RGBColor redrgb = redhsv.toRGB();       // hsv to rgb
        redrgb.print();

        System.out.println( "///GREEN.  rgb///" );
        RGBColor green = new RGBColor(0,255,0); // GREEN in rgb
        green.print();
        
        HSVColor greenhsv = green.toHSV();      // rgb to hsv
        greenhsv.print();
        
        RGBColor greenrgb = greenhsv.toRGB();   // hsv to rgb
        greenrgb.print();

        System.out.println( "///RED.    hsv///" );
        HSVColor red2 = new HSVColor(0,1,1);    // red in hsv
        red2.print();
        
        RGBColor red2rgb = red2.toRGB();        // hsv to rgb
        red2rgb.print();

        HSVColor red2hsv = red2rgb.toHSV();     // rgb to hsv
        red2hsv.print();
        Point p1 = new Point( 20,20 );
        Point p2 = new Point( 30,20 );
        Point p3 = new Point( 25,20 );
        LinkedList<Point> lp = new LinkedList<Point>( Arrays.asList(p1, p2, p3) );
        for (Point point : lp) {
            System.out.println( "( "+ point.getx() +", "+ point.gety() +" )" );
        }
    }
}