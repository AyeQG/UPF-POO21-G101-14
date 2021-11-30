import java.util.LinkedList;
import java.awt.Graphics;

public class PolygonalRegion extends Region {
    private LinkedList<Point> ListP;

    public PolygonalRegion( Color lcinit, Color fcinit, LinkedList<Point> lp ) {
        super( lcinit, fcinit );
        ListP = lp;
    }

    public double getArea() {
        //FORMULA: (1/2) * [ (x1*y2 + x2*y3 ... + xN*y1) - (y1*x2 + y2*x3 ... + yN*x1) ]
        double first = 0;
        double second = 0;
        for ( int i = 0; i < ListP.size()-1; i++ ) {                            // Convex Polygon Area:
            first += (ListP.get(i)).getx() * (ListP.get(i+1)).gety();           // (x1*y2 + x2*y3 ...)
            second += (ListP.get(i)).gety() * (ListP.get(i+1)).getx();          // (y1*x2 + y2*x3 ...)
        }
        first += (ListP.get(ListP.size()-1)).getx() * (ListP.get(0)).gety();    // (... + xN*y1)
        second += (ListP.get(ListP.size()-1)).gety() * (ListP.get(0)).getx();   // (... + yN*x1)

        double area = 0.5 * (first - second);
        return area;
    }

    public void draw( Graphics g ) {
        int xList[];
        xList = new int[ ListP.size() ];
        int yList[];
        yList = new int[ ListP.size() ];
        int xmean = 0;
        int ymean = 0;
        for ( int i = 0; i < ListP.size(); i++ ) {
            xList[i] = (ListP.get(i)).getx();
            yList[i] = (ListP.get(i)).gety();
            xmean += (ListP.get(i)).getx();
            ymean += (ListP.get(i)).gety();
        }
        xmean = xmean / ListP.size();
        ymean = ymean / ListP.size();
        
        g.setColor( fillColor );
        g.fillPolygon( xList, yList, ListP.size() );
        g.setColor( lineColor );
        g.drawPolygon( xList, yList, ListP.size() );
    }

    public void translate( int dx, int dy ) {
        for ( Point point: ListP ) {
            point.translate(dx, dy);
        }
    }

    public boolean isSelected( Point p ) {
        if ( isPointInside(p) ) { return true; }
        else return false;
    }

    public boolean isPointInside( Point p ) {
        double cp = 0; //cross-product initialized as 0 (no sign)

        //check for each pair of vectors of the polygon
        for ( int i = 0; i < ListP.size()-1; i++ ) {
            Vector v1 = ListP.get(i+1).difference( ListP.get(i) ); //(q2-q1)
            Vector v2 = p.difference( ListP.get(i) );              //(p -q1)
            double newcp = v1.crossProduct(v2);             //(q2-q1)x(p -q1)
            
            // check the sign of the cross-product
            if ( cp < 0 & newcp > 0 ) { return false; }
            else if ( cp > 0 & newcp < 0 ) { return false; }
            else cp = newcp;
        }
        //check the last vector (qn-q1):
        Vector v1 = ListP.get(0).difference( ListP.get( ListP.size()-1 ) ); //(qn-q1)
        Vector v2 = p.difference( ListP.get(0) );                           //(p -q1)
        double newcp = v1.crossProduct(v2);                         //(qn-q1)x(p -q1)
        
        // check the sign of the cross-product
        if ( cp < 0 & newcp > 0 ) { return false; }
        else if ( cp > 0 & newcp < 0 ) { return false; }
        return true;
    }
}