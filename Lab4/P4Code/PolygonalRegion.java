import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;

public class PolygonalRegion extends Region {
    private LinkedList<Point> ListP;

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
    public void drawRegion( Graphics g, String name ) {
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

        g.setColor(Color );
        g.fillPolygon( xList, yList, ListP.size() );
        g.setColor(Color );
        g.drawPolygon( xList, yList, ListP.size() );

        g.setColor(Color );
        g.setFont(new Font ("TimesRoman", Font.BOLD | Font.ITALIC, 15));
        g.drawString( name, xmean, ymean );
    }
    public void move( Vector v ) {

    }
    public boolean isSelected( Point p ) {

    }
    public boolean isPointInside( Point p ) {

    }
}