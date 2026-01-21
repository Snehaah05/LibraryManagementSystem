public class Transaction {

    public static void issueBook(Library library, int bookId) {
        Book book = library.findBook(bookId);
        if (book != null) {
            book.issueBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public static void returnBook(Library library, int bookId) {
        Book book = library.findBook(bookId);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
