import java.util.LinkedList;
import java.awt.*;

public class MyMap extends javax.swing.JPanel {
    private World myWorld;

    public MyMap() {
        initComponents();
        City c1 = new City( 150, 200, "Mia", 100 );
        City c2 = new City( 150, 100, "Ayesha", 50 );
        City c3 = new City( 290, 290, "Ascent", 230 );
        City c4 = new City( 350, 390, "Haven", 50 );
        City c5 = new City( 430, 200, "Split", 700 );
        City c6 = new City( 710, 340, "Fallen Land", 50 );
        City c7 = new City( 710, 290, "Snow Land", 613 );
        City c8 = new City( 859, 480, "Breeze", 70 );
        City c81 = new City( 850, 340, "Rainbow", 1000 );
        City c9 = new City( 830, 720, "Isle", 900 );
        City c10 = new City( 800, 810, "Doritos", 400 );
        City c11 = new City( 600, 670, "Boomerang", 800 );
        City c12 = new City( 570, 900, "The Poles", 600 );
        City c13 = new City( 570, 770, "Tail", 800 );
        City c14 = new City( 290, 770, "Stomach", 700 );
        City c15 = new City( 150, 670, "Eye", 500 );
        
        // REG 1
        LinkedList< Point > points1 = new LinkedList< Point >();    
        points1.add( new Point( 10, 100 , "p11" ) );
        points1.add( new Point( 150, 10 , "p12" ) );
        points1.add( new Point( 290, 100 , "p13" ) );
        points1.add( new Point( 290, 200 , "p14" ) );
        points1.add( new Point( 150, 290 , "p15" ) );
        points1.add( new Point( 10, 200 , "p16" ) );

        LinkedList<River> rivers1 = new LinkedList<River>();
        LinkedList<Lake> lakes1 = new LinkedList<Lake>();
        
        LinkedList<Point> riverpoints1 = new LinkedList<Point>();
        riverpoints1.add( new Point(200, 170, null) );
        riverpoints1.add( new Point(180, 200, null) );
        riverpoints1.add( new Point(200, 220, null) );
        rivers1.add( new River( riverpoints1, "Great River" ));
        
        Lake lake011 = new Lake(160, 240, "Great Lake", 40, 20);
        Lake lake012 = new Lake(120, 140, "Dot Lake", 10, 20);
        lakes1.add( lake011 );
        lakes1.add( lake012 );

        Country reg1 = new Country( "Coffee", points1, c1, rivers1, lakes1 );
        reg1.addCity(c1);
        reg1.addCity(c2);
        
        //REG 2
        LinkedList< Point > points2 = new LinkedList< Point >();    
        points2.add( new Point( 150, 290 , "p21" ) );
        points2.add( new Point( 290, 200 , "p22" ) );
        points2.add( new Point( 430, 290 , "p23" ) );
        points2.add( new Point( 290, 390 , "p24" ) );
        points2.add( new Point( 150, 390 , "p25" ) );

        LinkedList<River> rivers2 = new LinkedList<River>();
        LinkedList<Lake> lakes2 = new LinkedList<Lake>();
        
        Country reg2 = new Country( "Tomorrow", points2, c3, rivers2, lakes2 );
        reg2.addCity(c3);

        LinkedList< Point > points3 = new LinkedList< Point >();    //REG 3
        points3.add( new Point( 430, 580 , "p31" ) );
        points3.add( new Point( 430, 290 , "p32" ) );
        points3.add( new Point( 290, 390 , "p33" ) );
        points3.add( new Point( 150, 390 , "p34" ) );

        LinkedList<River> rivers3 = new LinkedList<River>();
        LinkedList<Lake> lakes3 = new LinkedList<Lake>();

        Country reg3 = new Country( "Yesterday", points3, c4, rivers3, lakes3 );
        reg3.addCity(c4);

        LinkedList< Point > points4 = new LinkedList< Point >();    //REG 4
        points4.add( new Point( 290, 100 , "p41" ) );
        points4.add( new Point( 290, 200 , "p42" ) );
        points4.add( new Point( 430, 290 , "p43" ) );
        points4.add( new Point( 430, 390 , "p44" ) );
        points4.add( new Point( 570, 290 , "p45" ) );
        points4.add( new Point( 570, 200 , "p46" ) );
        
        LinkedList<River> rivers4 = new LinkedList<River>();
        LinkedList<Lake> lakes4 = new LinkedList<Lake>();

        Country reg4 = new Country( "Mochi", points4, c5, rivers4, lakes4 );
        reg4.addCity(c5);

        //REG 5
        LinkedList< Point > points5 = new LinkedList< Point >();    
        points5.add( new Point( 570, 200 , "p51" ) );
        points5.add( new Point( 570, 290 , "p52" ) );
        points5.add( new Point( 710, 480 , "p53" ) );
        points5.add( new Point( 850, 290 , "p54" ) );
        points5.add( new Point( 710, 200 , "p55" ) );
        points5.add( new Point( 710, 100 , "p56" ) );
        
        LinkedList<River> rivers5 = new LinkedList<River>();
        LinkedList<Lake> lakes5 = new LinkedList<Lake>();

        LinkedList<Point> riverpoints5 = new LinkedList<Point>();
        riverpoints5.add( new Point(600, 290, null) );
        riverpoints5.add( new Point(680, 310, null) );
        riverpoints5.add( new Point(710, 350, null) );
        rivers5.add( new River( riverpoints5, "Pagee River" ));
        
        Lake lake021 = new Lake(600, 200, "Grand Leaf", 60, 80);
        lakes5.add( lake021 );

        Country reg5 = new Country( "Autumn", points5, c7, rivers5, lakes5 );
        reg5.addCity(c6);
        reg5.addCity(c7);
        
        LinkedList< Point > points6 = new LinkedList< Point >();    //REG 6
        points6.add( new Point( 850, 290 , "p61" ) );
        points6.add( new Point( 710, 480 , "p62" ) );
        points6.add( new Point( 850, 580 , "p63" ) );
        points6.add( new Point( 990, 480 , "p64" ) );

        LinkedList<River> rivers6 = new LinkedList<River>();
        LinkedList<Lake> lakes6 = new LinkedList<Lake>();
        
        Country reg6 = new Country( "Paradise", points6, c81, rivers6, lakes6 );
        reg6.addCity(c8);
        reg6.addCity(c81);

        LinkedList< Point > points7 = new LinkedList< Point >();    //REG 7
        points7.add( new Point( 570, 580 , "p71" ) );
        points7.add( new Point( 570, 670 , "p72" ) );
        points7.add( new Point( 430, 770 , "p73" ) );
        points7.add( new Point( 710, 670 , "p74" ) );

        LinkedList<River> rivers7 = new LinkedList<River>();
        LinkedList<Lake> lakes7 = new LinkedList<Lake>();

        Country reg7 = new Country( "Moon", points7, c11, rivers7, lakes7 );
        reg7.addCity(c11);
        
        LinkedList< Point > points8 = new LinkedList< Point >();    //REG 8
        points8.add( new Point( 710, 770 , "p81" ) );
        points8.add( new Point( 710, 860 , "p82" ) );
        points8.add( new Point( 850, 770 , "p83" ) );

        LinkedList<River> rivers8 = new LinkedList<River>();
        LinkedList<Lake> lakes8 = new LinkedList<Lake>();

        Country reg8 = new Country( "Island", points8, c10, rivers8, lakes8 );
        reg8.addCity(c10);

        LinkedList< Point > points9 = new LinkedList< Point >();    //REG 9
        points9.add( new Point( 710, 770 , "p91" ) );
        points9.add( new Point( 850, 670 , "p92" ) );
        points9.add( new Point( 990, 770 , "p93" ) );

        LinkedList<River> rivers9 = new LinkedList<River>();
        LinkedList<Lake> lakes9 = new LinkedList<Lake>();

        Country reg9 = new Country( "Bermuda", points9, c9, rivers9, lakes9 );
        reg9.addCity(c9);

        LinkedList< Point > points10 = new LinkedList< Point >();    //REG 10
        points10.add( new Point( 430, 860 , "p101" ) );
        points10.add( new Point( 570, 960 , "p102" ) );
        points10.add( new Point( 710, 960 , "p103" ) );
        points10.add( new Point( 570, 860 , "p104" ) );

        LinkedList<River> rivers10 = new LinkedList<River>();
        LinkedList<Lake> lakes10 = new LinkedList<Lake>();

        Country reg10 = new Country( "Wings", points10, c12, rivers10, lakes10 );
        reg10.addCity(c12);

        LinkedList< Point > points11 = new LinkedList< Point >();    //REG 11
        points11.add( new Point( 10, 580 , "p111" ) );
        points11.add( new Point( 10, 670 , "p112" ) );
        points11.add( new Point( 150, 770 , "p113" ) );
        points11.add( new Point( 430, 860 , "p114" ) );
        points11.add( new Point( 570, 860 , "p115" ) );
        points11.add( new Point( 710, 670 , "p116" ) );
        points11.add( new Point( 430, 770 , "p117" ) );
        points11.add( new Point( 150, 580 , "p118" ) );

        LinkedList<River> rivers11 = new LinkedList<River>();
        LinkedList<Lake> lakes11 = new LinkedList<Lake>();
        
        Country reg11 = new Country( "Whale", points11, c15, rivers11, lakes11 );
        reg11.addCity(c13);
        reg11.addCity(c14);
        reg11.addCity(c15);
        
        LinkedList< Country > listreg1 = new LinkedList< Country >();
        listreg1.add(reg1);
        listreg1.add(reg2);
        listreg1.add(reg3);
        listreg1.add(reg4);
        LinkedList< Country > listreg2 = new LinkedList< Country >();
        listreg2.add(reg5);
        listreg2.add(reg6);
        LinkedList< Country > listreg3 = new LinkedList< Country >();
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
        setBackground(Color.blue);
        super.paint( g );
        myWorld.drawWorld( g );

    }

}

