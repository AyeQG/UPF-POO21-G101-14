import java.util.LinkedList;

public class TestCountry {
    public static void main( String[] args ) {
        City c1 = new City( 150, 200, "Mia", 100 );
        City c2 = new City( 150, 100, "Ayesha", 50 );
        City c3 = new City( 150, 670, "Eye", 500 );
        Point p1 = c1;
        Point p2 = c2;
        Point p3 = c3;
        
        System.out.println( "City name: " + c1.getname() + "hab: " + c1.getNumHab());
        System.out.println( "City name: " + c2.getname() + "hab: " + c2.getNumHab());
        System.out.println( "City name: " + c3.getname() + "hab: " + c3.getNumHab());
        c1.printPoint();
        c2.printPoint();
        c3.printPoint();

        LinkedList<Point> listCities1 = new LinkedList<Point>();
        LinkedList<Point> listCities2 = new LinkedList<Point>();

        Country count1 = new Country( "Friend", listCities1, c1 );
        count1.addCity(c1);
        count1.addCity(c2);
        Country count2 = new Country( "Whale", listCities2, c3 );
        count2.addCity(c3);


    }
}