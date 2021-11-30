

public class RGBColor extends Color {
    private int r, g, b;

    /**
     * @param ri int [0,255] red value of rgb model
     * @param gi int [0,255] green value of rgb model
     * @param bi int [0,255] blue value of rgb model
     */
    public RGBColor( int ri, int gi, int bi ) {
        super( ri , gi, bi, true );
        r = ri; g = gi; b = bi;
    }

    /**
     * We will use the function RGBtoHSB() which has the parameters
     * int r,g,b and float[] hsvVals.
     * We create the array and change the float x,y,z to integers.
     * Then, call the function and store the hsv values to our x,y,z.
    */
    public HSVColor toHSV() {
        float[] hsvVals = new float[3];
        java.awt.Color.RGBtoHSB( r, g, b, hsvVals );
        float h = hsvVals[0];
        float s = hsvVals[1];
        float v = hsvVals[2];
        return new HSVColor(h, s, v);
    }

    public void print() {
        System.out.println( "RGB: (" + r + ", " + g + ", " + b + ")" );
    }
}