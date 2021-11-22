import java.util.LinkedList;
import java.awt.*;
import java.awt.Graphics;

public class River {
    private LinkedList<Point> ListP = new LinkedList<Point>();
    private String name;

    public River( LinkedList<Point> initList, String initName) {
        ListP = initList;
        name = initName;
    }
    public String getName() {
        return name;
    }
    public void drawRiver( Graphics g ) {
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

        g.setColor(Color.blue);
        g.drawPolyline( xList, yList, ListP.size() );

        g.setColor(Color.magenta);
        g.setFont(new Font ("TimesRoman", Font.PLAIN, 10));
        g.drawString( name, xmean, ymean );
    }
    
}
