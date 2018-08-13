package book;

public class Test {
    public static void main(String[] args) {
        BorrowerBook borrowerBook = new BorrowerBook();
        BorrowerBook borrowerBook2 = new BorrowerBook();

        borrowerBook.borrowBook();
        System.out.println("Nguoi dau tien muon sach!");
        System.out.println("Ten cuon sach va tac gia: ");
        System.out.println(borrowerBook.getAuthorAndTitle());

        borrowerBook2.borrowBook();
        System.out.println("Nguoi thu 2 muon sach!");
        System.out.println("Ten cuon sach va tac gia:");
        System.out.println(borrowerBook2.getAuthorAndTitle());

        borrowerBook.returnBook();

        borrowerBook2.borrowBook();
        System.out.println("Nguoi thu 2 muon sach!");
        System.out.println(borrowerBook2.getAuthorAndTitle());
    }

}
