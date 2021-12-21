//package bookstore;
import java.util.*;
import java.text.SimpleDateFormat;

public class TestStore {
    public static void main( String[] args ) {
        Catalog catalog = new Catalog(  );
        ShoppingCart cart = new ShoppingCart( catalog );
        BookStore bookstore = new BookStore(catalog, cart);

    }
}