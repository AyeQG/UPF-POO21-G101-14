import java.util.LinkedList;

public class TestCountry {
    public static void main( String[] args ) {
        City c1 = new City( 150, 200, "Mia", 100 );
        City c2 = new City( 150, 100, "Ayesha", 50 );
        City c3 = new City( 150, 670, "Eye", 500 );
        City c4 = new City( 570, 770, "Nothing", 500 );
        
        System.out.println( "City name: " + c1.getName() + "   hab: " + c1.getNumHab());
        System.out.println( "City name: " + c2.getName() + "   hab: " + c2.getNumHab());
        System.out.println( "City name: " + c3.getName() + "   hab: " + c3.getNumHab());
        System.out.println( "City name: " + c4.getName() + "   hab: " + c4.getNumHab());
        c1.printPoint();
        c2.printPoint();
        c3.printPoint();
        c4.printPoint();

        LinkedList<Point> listCities1 = new LinkedList<Point>();
        LinkedList<Point> listCities2 = new LinkedList<Point>();
        LinkedList<River> listRivers = new LinkedList<River>();
        LinkedList<Lake> listLakes = new LinkedList<Lake>();
        
        LinkedList<Point> riverpoints1 = new LinkedList<Point>();
        riverpoints1.add( new Point(200, 170, null) );
        riverpoints1.add( new Point(180, 200, null) );
        riverpoints1.add( new Point(200, 220, null) );
        listRivers.add( new River( riverpoints1, "Great River" ));
        
        Lake lake1 = new Lake(160, 240, "Great Lake", 40, 20);
        Lake lake2 = new Lake(120, 140, "Dot Lake", 10, 20);
        listLakes.add( lake1 );
        listLakes.add( lake2 );

        Country count1 = new Country( "Friend", listCities1, c1,  null, null );
        count1.addCity(c1);
        count1.addCity(c2);
        Country count2 = new Country( "Whale", listCities2, c3, listRivers, listLakes );
        count2.addCity(c3);
        count2.addCity(c4);

        count1.addNeighbor(count2);
        count2.addNeighbor(count1);

        System.out.println( "Country name: " + count1.getName() + "   Capital: " + count1.getCapital());
        count1.printCities();
        count1.printNeighbors();
        count1.printRivers();
        count1.printLakes();
        System.out.println( "Country name: " + count2.getName() + "   Capital: " + count2.getCapital());
        count2.printCities();
        count2.printNeighbors();
        count2.printRivers();
        count2.printLakes();
    }
}