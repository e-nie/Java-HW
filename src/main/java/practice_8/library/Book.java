package practice_8.library;

public class Book {
    private String name;
    private String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author);
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
