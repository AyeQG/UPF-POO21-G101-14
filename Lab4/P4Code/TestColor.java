
public class TestColor {
    public static void main( String[] args ) {
        System.out.println( "///RED.    rgb///" );
        Color red = new Color(255,0,0,true);
        red.print();
        
        red.toHSV();
        red.print();

        red.toRGB();
        red.print();

        System.out.println( "///GREEN.  rgb///" );
        Color green = new Color(0,255,0,true); // green
        green.print();
        
        green.toHSV();
        green.print();
        
        green.toRGB();
        green.print();

        System.out.println( "///RED.    hsv///" );
        Color redhsv = new Color(0,1,1,false); // red
        redhsv.print();
        
        redhsv.toHSV();
        redhsv.print();
        
        redhsv.toRGB();
        redhsv.print();

        red.toHSV();
        red.print();
    }
}