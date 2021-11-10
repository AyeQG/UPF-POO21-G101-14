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

        Country count1 = new Country( "Friend", listCities1, c1 );
        count1.addCity(c1);
        count1.addCity(c2);
        Country count2 = new Country( "Whale", listCities2, c3 );
        count2.addCity(c3);
        count2.addCity(c4);

        count1.addNeighbor(count2);
        count2.addNeighbor(count1);

        System.out.println( "Country name: " + count1.getName() + "   Capital: " + count1.getCapital());
        count1.printCities();
        count1.printNeighbors();
        System.out.println( "Country name: " + count2.getName() + "   Capital: " + count2.getCapital());
        count2.printCities();
        count1.printNeighbors();
    }
}