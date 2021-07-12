public class BookClass {
    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private int bookPrice;
    private boolean isInStock;

    public BookClass() {

    }

    public BookClass(String bookTitle, String bookAuthor, String bookDescription, int bookPrice, boolean isInStock) {
    }

    public void getDisplayText() {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookDescription = bookDescription;
        this.bookPrice = bookPrice;
        this.isInStock = isInStock;

    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookAuthor(){
        return this.bookAuthor;
    }
    public void setBookDescription(String bookDescription){
        this.bookDescription = bookDescription;
    }
    public String getBookDescription(String bookDescription){
        return this.bookDescription;
    }
    public void setBookPrice(int bookPrice){
        this.bookPrice = bookPrice;
    }
    public int getBookPrice(){
        return this.bookPrice;
    }
    public void setIsInStock(boolean isInStock){
        this.isInStock = isInStock;
    }
    public boolean isInStock(){
       return this.isInStock;
    }







}
