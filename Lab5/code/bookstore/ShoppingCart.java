

public class ShoppingCart extends BookCollection implements ShoppingCartInterface{
    private Catalog catalog;

    public ShoppingCart( Catalog cati ) {
        super();
        catalog = cati;
    }
    public void addCopies( int numberOfCopies, String booktitle ) {
        catalog.removeCopies(numberOfCopies, booktitle);
        super.addCopies(numberOfCopies, booktitle); //
    }

    public void removeCopies( int numberOfCopies, String booktitle ) {
        catalog.addCopies(numberOfCopies, booktitle);
        super.removeCopies(numberOfCopies, booktitle); //
    }

    public double totalPrice() {
        int totalPrice = 0;
        String[] booktitles = catalog.booktitles();
        catalog<get.Book()>
        for (String book : booktitles) {
            int copies = catalog.numberOfCopies( book );
            totalPrice += copies*book

        }
    }
	public String checkout() {

    }
}