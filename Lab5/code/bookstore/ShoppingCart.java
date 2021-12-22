//package bookstore;
import java.util.*;
import java.text.SimpleDateFormat;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    protected Catalog catalog;

    public ShoppingCart( Catalog cati ) {
        catalog = cati;

        LinkedList< String[] > blist = readCatalog( "books.xml" );
        //String[] tokens = { "title", "author", "date", "place", "isbn", "price", "currency", "copies" };
        
        for ( String[] barray : blist ) {
            
            String title = barray[0];                                   //title
            int copies = 0;              //copies are initialized as 0 for the collection of the ShoppingCart!!
            String author = barray[1];                                  //author
            Date date = new Date();
            try { date = new SimpleDateFormat().parse( barray[2] ); }   //date
            catch ( Exception e ) {}
            String place = barray[3];                                   //publication place
            long isbn = Long.parseLong( barray[4] );                    //isbn
            double price = Double.parseDouble( barray[5] );             //price
            Currency currency = Currency.getInstance( barray[6] );      //currency

            Book book = new Book( title, author, date, place, isbn );   //create Book
            Stock stock = new Stock( book, copies, price, currency );   //create Stock
            collection.add( stock );                                    //add stock to collection
        }
    }

    @Override
    public void addCopies( int numberOfCopies, String booktitle ) {
        catalog.removeCopies(numberOfCopies, booktitle);
        super.addCopies(numberOfCopies, booktitle);
    }

    @Override
    public void removeCopies( int numberOfCopies, String booktitle ) {
        super.removeCopies(numberOfCopies, booktitle);
        catalog.addCopies(numberOfCopies, booktitle);
    }

    @Override
    public double totalPrice() {
        double totalPrice = 0.00;
        for (StockInterface element : collection) {
            if ( element != null ) {
                totalPrice += element.totalPrice();
            }
        }
        return totalPrice;
    }

    @Override
	public String checkout() {
        Payment payment = new Payment();
        double total = totalPrice();
        Currency eur = Currency.getInstance( "EUR" );
        String dopay = payment.doPayment( (long)55554444, "Juan", total, eur );
        for (StockInterface stock : collection) {
            int copies = stock.numberOfCopies();
            stock.removeCopies( copies );
        }
        return dopay;
    }
}