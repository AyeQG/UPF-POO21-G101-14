//package bookstore;
import java.util.*;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;

    public ShoppingCart( Catalog cati ) {
        super();
        catalog = cati;
    }
    public void addCopies( int numberOfCopies, String booktitle ) {
        catalog.addCopies(numberOfCopies, booktitle);
        super.addCopies(numberOfCopies, booktitle); //
    }

    public void removeCopies( int numberOfCopies, String booktitle ) {
        catalog.addCopies(numberOfCopies, booktitle);
        super.removeCopies(numberOfCopies, booktitle); //
    }

    public double totalPrice() {
        int totalPrice = 0;
        //String[] booktitles = catalog.booktitles();
        LinkedList< Stock > stockList = catalog.getCatalog();
        //for ( String booktitle : booktitles ) { //String book : booktitles
            //int copies = catalog.numberOfCopies( booktitle );
            for ( Stock stock : stockList ) {
                //if ( stock.getBooktitle() == booktitle ) {
                    totalPrice += stock.totalPrice();
                //}
            }
        //}
        return totalPrice;
    }
	public String checkout() {
        
    }
}