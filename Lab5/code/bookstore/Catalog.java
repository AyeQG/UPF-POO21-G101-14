//package blisttore;
import java.util.*;
import java.text.SimpleDateFormat;

public class Catalog extends BookCollection {
    /**
     * Reads xml file with readcatalog() of Bookcollection,
     * then creates the Stock instances and
     * populates the attribute collection of Catalog.
     */
    public Catalog() {
        super();    //collection = new HashSet< StockInterface >();
        LinkedList< String[] > blist = readCatalog( "books.xml" );
        //String[] tokens = { "title", "author", "date", "place", "isbn", "price", "currency", "copies" };
        
        for ( String[] barray : blist ) {
            
            String title = barray[0];                                       //title
            int copies = Integer.parseInt( barray[7] );                     //copies
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
}

//inside for
            /*String title = barray[0];                                       //title
            int copies = Integer.parseInt( barray[7] );                     //copies
            boolean finished = false;
            while ( finished == false ) {   //until we are not finished adding all stocks in collection
                check if book is already in stock
                for (StockInterface stock : collection) {
                    if ( stock.getBooktitle() == title ) { 
                        //if YES, add copies
                        stock.addCopies( copies );
                        finished = true;
                    }
                }
                if NOT, create a stock
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
                finished = true;
            }*/