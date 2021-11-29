

public class RGBColor extends Color {
    private int r, g, b;
    /**
     * R [0,255] 8bits  Intensity of red    (black to white)
     * G [0,255] 8bits  Intensity of green  (black to white)
     * B [0,255] 8bits  Intensity of blue   (black to white)
     * --
     * H [0,360] degree Hue
     * S [0,1]          Saturation          (bright to dark)
     * V [0,1]          Value               (black to white)
    */
    
    public RGBColor( int ri, int gi, int bi ) {
        super( ri , gi, bi, true );
        r = ri; g = gi; b = bi;
    }
    
    public HSVColor toHSV() {
        /**
         * We will use the function RGBtoHSB() which has the parameters
         * int r,g,b and float[] hsvVals.
         * We create the array and change the float x,y,z to integers.
         * Then, call the function and store the hsv values to our x,y,z.
        */
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