

public class HSVColor extends Color{
    private float h, s, v;

    /**
     * @param hi float [0,1] hue value of hsv model
     * @param si float [0,1] saturation value of hsv model
     * @param vi float [0,1] value or brightness value of hsv model
     */
    public HSVColor( float hi, float si, float vi ) {
        super( getHSBColor( hi, si, vi ).getRed(),
        getHSBColor( hi, si, vi ).getGreen(),
        getHSBColor( hi, si, vi ).getBlue(), false );
        h = hi; s = si; v = vi;
    }
    /**
     * We will use the function getHSBColor() which given the values of
     * an HSB color model returns a Color with the equivalent RGB values.
     */
    public RGBColor toRGB() {
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