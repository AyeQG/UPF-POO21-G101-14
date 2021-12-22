//package bookstore;
import java.util.Currency;

public class Stock implements StockInterface {
    private Book book;
    private int copies;
    private double price;
    private Currency currency;

    public Stock( Book booki, int copiesi, double pricei, Currency currencyi ) {
        book = booki; copies = copiesi; price = pricei; currency = currencyi;
    }

    public Book getBook() { return book; }
    @Override
    public String getBooktitle() { return book.getTitle(); }
    @Override
    public int numberOfCopies() { return copies; }
    @Override
	public void addCopies( int numberOfCopies ) {
        copies += numberOfCopies;
    }
    @Override
	public void removeCopies( int numberOfCopies ) {
        copies -= numberOfCopies;
    }
    @Override
	public double totalPrice() {
        System.out.println( "   <Stock> totalPrice() of a book: " + price );
        return price; //(double)copies*price
    }
}