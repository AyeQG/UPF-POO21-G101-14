

public class HSVColor extends Color{
    private float h, s, v;
    /**
     * R [0,255] 8bits  Intensity of red    (black to white)
     * G [0,255] 8bits  Intensity of green  (black to white)
     * B [0,255] 8bits  Intensity of blue   (black to white)
     * --
     * H [0,360] degree Hue
     * S [0,1]          Saturation          (bright to dark)
     * V [0,1]          Value               (black to white)
    */
    
    public HSVColor( float hi, float si, float vi ) {
        super( getHSBColor( hi, si, vi ).getRed(), getHSBColor( hi, si, vi ).getGreen(), getHSBColor( hi, si, vi ).getBlue(), false );
        h = hi; s = si; v = vi;
    }

    public RGBColor toRGB() {
        /**
         * We will use the function getHSBColor() which given the values of
         * an HSB color model returns a Color with the equivalent RGB values.
         */
        java.awt.Color hsvtorgb = getHSBColor( h, s, v );
        int r = hsvtorgb.getRed();
        int g = hsvtorgb.getGreen();
        int b = hsvtorgb.getBlue();
        return new RGBColor(r, g, b);
    }
    
    public void print() {
        System.out.println( "HSV: (" + h + ", " + s + ", " + v + ")" );
    }
}