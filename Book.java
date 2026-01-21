public class Book {
    private int bookId;
    private String title;
    private String author;
    private int quantity;

    public Book(int bookId, String title, String author, int quantity) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void issueBook() {
        if (quantity > 0) {
            quantity--;
            System.out.println("Book issued successfully.");
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook() {
        quantity++;
        System.out.println("Book returned successfully.");
    }

    public void displayBook() {
        System.out.println(bookId + " | " + title + " | " + author + " | Qty: " + quantity);
    }
}
