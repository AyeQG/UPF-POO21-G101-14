import java.util.LinkedList;
import java.awt.*;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();
        LinkedList< PolygonalRegion > listreg1 = new LinkedList< PolygonalRegion >();

        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 10, 100 ) );
        points1.add( new Point( 150, 10 ) );
        points1.add( new Point( 290, 100 ) );
        points1.add( new Point( 290, 200 ) );
        points1.add( new Point( 150, 290 ) );
        points1.add( new Point( 10, 200 ) );
        PolygonalRegion reg1 = new PolygonalRegion( points1 );
        listreg1.add(reg1);

        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 77, 500 ) );
        points2.add( new Point( 170, 70 ) );
        points2.add( new Point( 29, 1 ) );
        points2.add( new Point( 232, 280 ) );
        points2.add( new Point( 157, 298 ) );
        points2.add( new Point( 909, 800 ) );
        PolygonalRegion reg2 = new PolygonalRegion( points2 );
        listreg1.add(reg2);

        LinkedList< PolygonalRegion > listreg2 = new LinkedList< PolygonalRegion >();

        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 650, 740 ) );
        points3.add( new Point( 550, 610 ) );
        points3.add( new Point( 790, 700 ) );
        points3.add( new Point( 690, 700 ) );
        points3.add( new Point( 560, 590 ) );
        points3.add( new Point( 710, 650 ) );
        PolygonalRegion reg3 = new PolygonalRegion( points3 );
        listreg2.add(reg3);

        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 807, 810 ) );
        points4.add( new Point( 850, 890 ) );
        points4.add( new Point( 780, 800 ) );
        points4.add( new Point( 790, 740 ) );
        points4.add( new Point( 750, 790 ) );
        points4.add( new Point( 710, 730 ) );
        PolygonalRegion reg4 = new PolygonalRegion( points4 );
        listreg2.add(reg4);
        
        Continent cont1 = new Continent( listreg1 );
        Continent cont2 = new Continent( listreg1 );
        LinkedList<Continent> listconts = new LinkedList<Continent>();
        listconts.add(cont1);
        listconts.add(cont2);
        
        myWorld = new World( listconts );
        //myworld = newWorld;
    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        myWorld.drawWorld( g );

    }

}

