
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
        
        /**
         * TestOptional
         * From this point on, we test other classes such as
         * Point, Vector, TriangularRegion, CircularRegion
         * to check if the selection tool works.
         */
        System.out.println("");
        
        Point p = new Point(10, 10);
        Point q = new Point(30, 10);
        Vector diff = p.difference(q);
        diff.print();

        TriangularRegion triReg = new TriangularRegion( red, red, new Point( 310, 370 ), new Point( 410, 370 ), new Point( 360, 270 ));
        System.out.println( triReg.isPointInside( new Point( 360, 320 )) );
        
        CircularRegion cirReg = new CircularRegion( red, red, new Point( 110, 300 ), 40);
        System.out.println( cirReg.isPointInside( new Point( 110, 300 )) );
        System.out.println( cirReg.isPointInside( new Point( 510, 700 )) );
    }
}