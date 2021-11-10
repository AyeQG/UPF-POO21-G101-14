import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();

        LinkedList< Point > points1 = new LinkedList< Point >();    //REG 1
        points1.add( new Point( 10, 100 ) );
        points1.add( new Point( 150, 10 ) );
        points1.add( new Point( 290, 100 ) );
        points1.add( new Point( 290, 200 ) );
        points1.add( new Point( 150, 290 ) );
        points1.add( new Point( 10, 200 ) );
        PolygonalRegion reg1 = new PolygonalRegion( points1 );
        
        LinkedList< Point > points2 = new LinkedList< Point >();    //REG 2
        points2.add( new Point( 150, 290 ) );
        points2.add( new Point( 290, 200 ) );
        points2.add( new Point( 430, 290 ) );
        points2.add( new Point( 290, 390 ) );
        points2.add( new Point( 150, 390 ) );
        PolygonalRegion reg2 = new PolygonalRegion( points2 );

        LinkedList< Point > points3 = new LinkedList< Point >();    //REG 3
        points3.add( new Point( 430, 480 ) );
        points3.add( new Point( 430, 290 ) );
        points3.add( new Point( 290, 390 ) );
        points3.add( new Point( 150, 390 ) );
        PolygonalRegion reg3 = new PolygonalRegion( points3 );

        LinkedList< Point > points4 = new LinkedList< Point >();    //REG 4
        points4.add( new Point( 290, 100 ) );
        points4.add( new Point( 290, 200 ) );
        points4.add( new Point( 430, 290 ) );
        points4.add( new Point( 430, 390 ) );
        points4.add( new Point( 570, 290 ) );
        points4.add( new Point( 570, 200 ) );
        PolygonalRegion reg4 = new PolygonalRegion( points4 );

        LinkedList< Point > points5 = new LinkedList< Point >();    //REG 5
        points5.add( new Point( 570, 200 ) );
        points5.add( new Point( 570, 290 ) );
        points5.add( new Point( 710, 480 ) );
        points5.add( new Point( 850, 290 ) );
        points5.add( new Point( 710, 200 ) );
        points5.add( new Point( 710, 100 ) );
        PolygonalRegion reg5 = new PolygonalRegion( points5 );
        
        LinkedList< Point > points6 = new LinkedList< Point >();    //REG 6
        points6.add( new Point( 850, 290 ) );
        points6.add( new Point( 710, 480 ) );
        points6.add( new Point( 850, 580 ) );
        points6.add( new Point( 990, 480 ) );
        PolygonalRegion reg6 = new PolygonalRegion( points6 );

        LinkedList< Point > points7 = new LinkedList< Point >();    //REG 7
        points7.add( new Point( 570, 580 ) );
        points7.add( new Point( 570, 670 ) );
        points7.add( new Point( 430, 770 ) );
        points7.add( new Point( 710, 670 ) );
        PolygonalRegion reg7 = new PolygonalRegion( points7 );
        
        LinkedList< Point > points8 = new LinkedList< Point >();    //REG 8
        points8.add( new Point( 710, 770 ) );
        points8.add( new Point( 710, 860 ) );
        points8.add( new Point( 850, 770 ) );
        PolygonalRegion reg8 = new PolygonalRegion( points8 );

        LinkedList< Point > points9 = new LinkedList< Point >();    //REG 9
        points9.add( new Point( 710, 770 ) );
        points9.add( new Point( 850, 670 ) );
        points9.add( new Point( 990, 770 ) );
        PolygonalRegion reg9 = new PolygonalRegion( points9 );

        LinkedList< Point > points10 = new LinkedList< Point >();    //REG 10
        points10.add( new Point( 430, 860 ) );
        points10.add( new Point( 570, 960 ) );
        points10.add( new Point( 710, 960 ) );
        points10.add( new Point( 570, 860 ) );
        PolygonalRegion reg10 = new PolygonalRegion( points10 );

        LinkedList< Point > points11 = new LinkedList< Point >();    //REG 11
        points11.add( new Point( 10, 580 ) );
        points11.add( new Point( 10, 670 ) );
        points11.add( new Point( 150, 770 ) );
        points11.add( new Point( 430, 860 ) );
        points11.add( new Point( 570, 860 ) );
        points11.add( new Point( 710, 670 ) );
        points11.add( new Point( 430, 770 ) );
        points11.add( new Point( 150, 580 ) );
        PolygonalRegion reg11 = new PolygonalRegion( points11 );
        
        LinkedList< PolygonalRegion > listreg1 = new LinkedList< PolygonalRegion >();
        listreg1.add(reg1);
        listreg1.add(reg2);
        listreg1.add(reg3);
        listreg1.add(reg4);
        LinkedList< PolygonalRegion > listreg2 = new LinkedList< PolygonalRegion >();
        listreg2.add(reg5);
        listreg2.add(reg6);
        LinkedList< PolygonalRegion > listreg3 = new LinkedList< PolygonalRegion >();
        listreg3.add(reg7);
        listreg3.add(reg8);
        listreg3.add(reg9);
        listreg3.add(reg10);
        listreg3.add(reg11);
        
        Continent cont1 = new Continent( listreg1 );                //CONT 1
        Continent cont2 = new Continent( listreg2 );                //CONT 2
        Continent cont3 = new Continent( listreg3 );                //CONT 3
        LinkedList<Continent> listconts = new LinkedList<Continent>();
        listconts.add(cont1);
        listconts.add(cont2);
        listconts.add(cont3);
        
        myWorld = new World( listconts );                           //WORLD
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

