public class Book{
private String title;
private double price;
public Book(String bookTitle, double bookPrice)
{
    this.title = bookTitle;
    this.price = bookPrice;
}
public String getTitle()
{
    return title;
}
public String getBookInfo()
{
    return title + "-" + price;
}
public class Textbook extends Book{
    private int edition;
    public Textbook(String title, double price, int edition) {
        super(title, price);
        this.edition = edition;}
    
        public int getEdition()
    {
        return edition;
    }
}
}