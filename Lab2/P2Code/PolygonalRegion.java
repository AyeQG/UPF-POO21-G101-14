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
        for ( int i = 0; i < ListP.size()-1; i++ ) {
            first += (ListP.get(i)).getx() * (ListP.get(i+1)).gety();
            second += (ListP.get(i)).gety() * (ListP.get(i+1)).getx();
        }
        first += (ListP.get(ListP.size()-1)).getx() * (ListP.get(0)).gety();
        second += (ListP.get(ListP.size()-1)).gety() * (ListP.get(0)).getx();

        double area = 0.5 * (first - second);
        return area;
    }
    public void drawRegion( Graphics g ) {
        int xList[];                         //declaring array for x-coordinates
        xList = new int[ ListP.size() ];     //allocating memory

        int yList[];                         //declaring array for x-coordinates
        yList = new int[ ListP.size() ];     //allocating memory

        for ( int i = 0; i < ListP.size(); i++ ) {
            xList[i] = (ListP.get(i)).getx();
            System.out.println(xList[i]);
            yList[i] = (ListP.get(i)).gety();
            System.out.println(yList[i]);
        }
        g.drawPolygon( xList, yList, ListP.size() );

    }
}