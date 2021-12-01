

public class Book {
    private String title;
    private String author;
    private Date publicationDate;
    private String publicationPlace;
    private int isbn;

    public Book( String ti, String ai, Date pdi, String ppi, int isbni ) {
        title = ti; author = ai; publicationDate = pdi; publicationPlace = ppi; isbn = isbni;
    }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public Date getPublicationDate() { return publicationDate; }
    public String getPublicationPlace() { return publicationPlace; }
    public int getISBN() { return isbn; }

}