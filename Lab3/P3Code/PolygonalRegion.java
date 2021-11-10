import java.util.LinkedList;
import java.awt.*;


public class PolygonalRegion {
    private LinkedList<Point> ListP = new LinkedList<Point>();

    public PolygonalRegion( LinkedList<Point> initList) {
        ListP = initList;
    }
    public double getArea() {
        double first = 0;
        double second = 0;
        for ( int i = 0; i < ListP.size()-1; i++ ) {                            // Convex Polygon Area:
            first += (ListP.get(i)).getx() * (ListP.get(i+1)).gety();           // (x1*y2 + x2*y3 ...)
            second += (ListP.get(i)).gety() * (ListP.get(i+1)).getx();          // (y1*x2 + y2*x3 ...)
        }
        first += (ListP.get(ListP.size()-1)).getx() * (ListP.get(0)).gety();    // (... + xN*y1)
        second += (ListP.get(ListP.size()-1)).gety() * (ListP.get(0)).getx();   // (... + yN*x1)

        double area = 0.5 * (first - second);   // (1/2) * [ (x1*y2 + x2*y3 ... + xN*y1) - (y1*x2 + y2*x3 ... + yN*x1) ]
        return area;
    }
    public void drawRegion( Graphics g ) {
        int xList[];
        xList = new int[ ListP.size() ];
        int yList[];
        yList = new int[ ListP.size() ];

        for ( int i = 0; i < ListP.size(); i++ ) {
            xList[i] = (ListP.get(i)).getx();
            yList[i] = (ListP.get(i)).gety();
        }
        g.drawPolygon( xList, yList, ListP.size() );
    }
}