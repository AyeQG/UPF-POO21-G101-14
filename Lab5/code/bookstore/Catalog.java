//package bookstore;
import java.util.*;
import java.util.Currency;

public class Catalog extends BookCollection {
    //private LinkedList< Stock > cata;

    public Catalog( String filename ) {
        super();
        /**
         * read xml file with readcatalog of Bookcollection
         * create the stock instances
         * populate the attribute collection of Catalog ?????
         */
        LinkedList< String[] > books = readCatalog( filename );
        /* String[] tokens = { "title", "author", "date", "place",
		                    "isbn", "price", "currency", "copies" }; */
        for ( int i = 0; i < books.size(); i++ ) {
            String[] book = books.get(i);
            String title = book[0];
            int copies = Integer.parseInt( book[7] );
            boolean finished = false;
            while ( finished == false ) {
                //check if book is already in stock
                for (StockInterface stock : collection) {
                    if ( stock.getBooktitle() == title ) { 
                        //if yes, add copies
                        stock.addCopies( copies );
                        finished = true;
                    }
                }
                //if not, create a stock
                String author = book[1];
                String[] parts = book[2].split("/");
                int year = Integer.parseInt( parts[0] );
                int month = Integer.parseInt( parts[1] );
                int day = Integer.parseInt( parts[2] );
                Date date = new Date( year, month, day );
                String place = book[3];
                int isbn = Integer.parseInt( book[4] );
                double price = Double.parseDouble( book[5] );
                Currency currency = Currency.getInstance( book[6] );
    
                Book bookbook = new Book( title, author, date, place, isbn);
                Stock stock = new Stock( bookbook, copies, price, currency);
                collection.add( stock );
                finished = true;
            }
        }
    }
}