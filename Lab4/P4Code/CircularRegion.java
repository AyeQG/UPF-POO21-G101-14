
public class CircularRegion extends EllipsoidalRegion {
    
    public CircularRegion( Color lcinit, Color fcinit, Point initC, int initR ) {
        super( lcinit, fcinit, initC, initR, initR );
    }

    //the area of this circular region will be computed in its parent class
    //EllipsoidalRegion.getArea()

}