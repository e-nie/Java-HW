package homework.classesobjects;

public class Book {
    private String title;
    private String author;

    public Book(String newTitle, String newAuthor) {
        this.title = newTitle;
        this.author = newAuthor;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void  printInfo(){
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args){
        Book newBook = new Book("The Forsyte Saga", "John Galsworthy");
        newBook.setAuthor("H.Murakami");
        newBook.printInfo();
    }
}
