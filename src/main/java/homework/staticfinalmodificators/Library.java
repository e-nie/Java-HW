package homework.staticfinalmodificators;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public Library(String newBookTitle, String newAuthor, int newYear, String newCategory) {
        this.bookTitle = newBookTitle;
        this.author = newAuthor;
        this.year = newYear;
        this.category = newCategory;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
