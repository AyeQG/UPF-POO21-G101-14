
//package bookstore;
import java.util.*;

public interface StockInterface {
	public Book getBook();
	public String getBooktitle();
	public Currency getCurrency();
	public int numberOfCopies();
	public void addCopies( int numberOfCopies );
	public void removeCopies( int numberOfCopies );
	public double totalPrice();
}
