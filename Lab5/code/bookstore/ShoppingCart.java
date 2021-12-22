//package bookstore;
import java.util.*;

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    protected Catalog catalog;

    public ShoppingCart( Catalog cati ) {
        //super();
        catalog = cati;
    }
    @Override
    public void addCopies( int numberOfCopies, String booktitle ) {
        catalog.removeCopies(numberOfCopies, booktitle);
        System.out.println( "<SCart> copies added in cart, removed from catalog" );
    }
    @Override
    public void removeCopies( int numberOfCopies, String booktitle ) {
        catalog.addCopies(numberOfCopies, booktitle);
        System.out.println( "<SCart> copies removed from cart, added in catalog" );
    }
    @Override
    public double totalPrice() {
        int totalPrice = 0;
        System.out.println( "<SCart> totalPrice() ..." );
        for (StockInterface element : collection) {
            if ( element != null ) {
                totalPrice += element.totalPrice();
                System.out.print( "<SCart> summing price of: " + element.getBooktitle() + "..." );
            }
        }
        System.out.println( "<SCart> TOTAL PRICE: " + totalPrice );
        return totalPrice;
    }
    @Override
	public String checkout() {
        Payment payment = new Payment();
        double total = totalPrice();
        Currency eur = Currency.getInstance( "EUR" );
        String dopay = payment.doPayment( (long)55554444, "Juan", total, eur );
        return dopay;
    }
}

//totalPrice()
        /*String[] booktitles = catalog.booktitles();
        //LinkedList< Stock > stockList = catalog.getCatalog();
        for ( String booktitle : booktitles ) {
            int copies = catalog.numberOfCopies(booktitle);
            for ( StockInterface stock : collection ) {
                if ( stock.getBooktitle() == booktitle ) {
                    double price = stock.totalPrice();
                    totalPrice += (double)copies*price;
                }
            }
        }*/