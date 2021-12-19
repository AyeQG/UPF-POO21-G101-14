//package bookstore;
import java.util.Currency;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;

    public ShoppingCart( Catalog cati ) {
        super();
        catalog = cati;
    }
    public void addCopies( int numberOfCopies, String booktitle ) {
        catalog.addCopies(numberOfCopies, booktitle);
        super.removeCopies(numberOfCopies, booktitle); //
    }

    public void removeCopies( int numberOfCopies, String booktitle ) {
        catalog.removeCopies(numberOfCopies, booktitle);
        super.addCopies(numberOfCopies, booktitle); //
    }

    public double totalPrice() {
        int totalPrice = 0;
        //String[] booktitles = catalog.booktitles();
        //LinkedList< Stock > stockList = catalog.getCatalog();
        //for ( String booktitle : booktitles ) { //String book : booktitles
            //int copies = catalog.numberOfCopies( booktitle );
            for ( StockInterface stock : collection ) {
                //if ( stock.getBooktitle() == booktitle ) {
                    totalPrice += stock.totalPrice();
                //}
            }
        //}
        return totalPrice;
    }
	public String checkout() {
        Payment payment = new Payment();
        double total = totalPrice();
        Currency eur = Currency.getInstance("EUR");
        String dopay = payment.doPayment( (long)55554444, "Juan", total, eur);
        return dopay;
    }
}