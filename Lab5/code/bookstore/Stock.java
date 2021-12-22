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
    @Override
    public Book getBook() { return book; }
    @Override
    public String getBooktitle() { return book.getTitle(); }
    @Override
    public Currency getCurrency() { return currency; }
    @Override
    public int numberOfCopies() { return copies; }
    @Override
	public void addCopies( int numberOfCopies ) {
        copies += numberOfCopies;
    }
    @Override
	public void removeCopies( int numberOfCopies ) {
        if ( (copies - numberOfCopies) <0 ) { copies = 0; }
        else { copies -= numberOfCopies; }
    }
    @Override
	public double totalPrice() {
        return (double)copies*price;
    }
}