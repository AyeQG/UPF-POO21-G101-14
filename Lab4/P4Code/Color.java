
abstract public class Color extends java.awt.Color {
    protected int x, y, z;
    protected boolean isRGB;

    /**
     * R [0,255] 8bits  Intensity of red    (black to white).
     * G [0,255] 8bits  Intensity of green  (black to white).
     * B [0,255] 8bits  Intensity of blue   (black to white).
     * --
     * H [0,360] degree Hue
     * S [0,1]          Saturation          (bright to dark).
     * V [0,1]          Value               (black to white).
     * 
     * @param xi int RGB red value or the HSV Hue value converted to RGB model.
     * @param yi int RGB green value or the HSV Saturation value converted to RGB model.
     * @param zi int RGB blue value or the HSV Brightness value converted to RGB model.
     * @param isrgb boolean if it is an rgb model.
     */
    public Color( int xi, int yi, int zi, boolean isrgb ) {
        super( xi , yi, zi);
        x = xi; y = yi; z = zi; isRGB = isrgb;
    }

    //the methods to convert from rgb to hsv and viceversa are
    //implemented in the classes RGBColor and HSVColor.
}
