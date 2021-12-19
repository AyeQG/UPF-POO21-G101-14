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
    public String getBooktitle() { return book.getTitle(); }
    public int numberOfCopies() { return copies; }

	public void addCopies( int numberOfCopies ) {
        copies += numberOfCopies;
    }
	public void removeCopies( int numberOfCopies ) {
        copies -= numberOfCopies;
    }
	public double totalPrice() {
        return (int)copies*price; //
    }
}