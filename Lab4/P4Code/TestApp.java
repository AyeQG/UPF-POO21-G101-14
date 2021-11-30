import java.util.LinkedList;

public class TestApp {
    public static void main( String[] args ) {
        EntityDrawer ed = new EntityDrawer();
        RGBColor lineC = new RGBColor( 0,0,255 );   //blue
        RGBColor fillC = new RGBColor( 0,128,128 ); //teal
    
        LinkedList< Point > points1 = new LinkedList< Point >();    
        points1.add( new Point( 10, 80 ) );
        points1.add( new Point( 110, 10 ) );
        points1.add( new Point( 210, 80 ) );
        points1.add( new Point( 210, 140 ) );
        points1.add( new Point( 110, 210 ) );
        points1.add( new Point( 10, 140 ) );
        PolygonalRegion polReg = new PolygonalRegion( lineC, fillC, points1 );

        EllipsoidalRegion ellReg = new EllipsoidalRegion( lineC, fillC, new Point( 230, 230 ), 50, 60);
        
        CircularRegion cirReg = new CircularRegion( lineC, fillC, new Point( 110, 300 ), 40);
        
        TriangularRegion triReg = new TriangularRegion( lineC, fillC, new Point( 310, 370 ), new Point( 410, 370 ), new Point( 360, 270 ));

        RectangularRegion recReg = new RectangularRegion( lineC, fillC, new Point( 280, 450 ), new Point( 380, 550 ));

        ed.addDrawable( polReg );
        ed.addDrawable( ellReg );
        ed.addDrawable( cirReg );
        ed.addDrawable( triReg );
        ed.addDrawable( recReg );
    }
}