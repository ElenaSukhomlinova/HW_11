import java.util.Objects;

public class Book {
    private String bookName;
    private Author author;
    int year;

    public Book(String bookName, Author author, int year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    public String getBookName() {
        return bookName;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return "Название " + this.bookName + ", Автор " + author.toString() + ", Год выпуска " + this.year;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) return true;
        if (other == null || other.getClass() != getClass()) return false;
        Book otherBook = (Book) other;
        return bookName.equals(otherBook.bookName) &&
                author.equals(otherBook.author) &&
                year == otherBook.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, year);
    }
}
