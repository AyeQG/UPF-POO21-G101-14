import java.lang.Math;
 
abstract public class Color extends java.awt.Color {
    protected int x, y, z;
    protected boolean isRGB;
    /**
     * R [0,255] 8bits  Intensity of red    (black to white)
     * G [0,255] 8bits  Intensity of green  (black to white)
     * B [0,255] 8bits  Intensity of blue   (black to white)
     * --
     * H [0,360] degree Hue
     * S [0,1]          Saturation          (bright to dark)
     * V [0,1]          Value               (black to white)
    */
   
    public Color( int xi, int yi, int zi, boolean isrgb ) {
        super( xi , yi, zi);
        x = xi; y = yi; z = zi; isRGB = isrgb;
    }
    public void print() {
        if ( isRGB ) {
            System.out.println( "RGB: (" + x + ", " + y + ", " + z + ")" );
        } else {
            System.out.println( "HSV: (" + x + ", " + y + ", " + z + ")" );
        }
    }
}
