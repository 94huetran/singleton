package book;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedBook;

    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title  = "Design Patterns";
        book = null;
        isLoanedBook = false;
    }

    static BookSingleton borrowBook() {
        if (!isLoanedBook) {

            if (book == null) {
                book = new BookSingleton();
            }
                isLoanedBook = true;
            return book;
        }
        return null;
    }

    public void returnBook(BookSingleton book) {
        isLoanedBook = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
