package book;

public class BorrowerBook {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    public void borrowBook() {

        borrowedBook = BookSingleton.borrowBook();

        if (borrowedBook == null) {
            haveBook = false;
        } else
            haveBook = true;
    }

    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have a book";
    }

    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
