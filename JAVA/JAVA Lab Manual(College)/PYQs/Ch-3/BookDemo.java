/*Declare a class called Book having book title & author name as members. Create a sub-class of it, called BookDetails having price & current stock of book as members. Create an array for storing details of n books. Define methods to achieve following: 
        - Initialization of members 
        - To query availability of a book by author name / book title 
        - To update stock of a book on purchase and sell 
        - Define method main to show usage of above methods. 
 */

class Book {
    String title;
    String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
}

class BookDetails extends Book {
    double price;
    int stock;

    // Constructor
    BookDetails(String title, String author, double price, int stock) {
        super(title, author);
        this.price = price;
        this.stock = stock;
    }

    // Method to check availability of a book by author name
    boolean checkAvailabilityByAuthor(String authorName) {
        return authorName.equals(author);
    }

    // Method to check availability of a book by book title
    boolean checkAvailabilityByTitle(String bookTitle) {
        return bookTitle.equals(title);
    }

    // Method to update stock of a book on purchase
    void updateStockOnPurchase(int quantity) {
        stock += quantity;
    }

    // Method to update stock of a book on sell
    void updateStockOnSell(int quantity) {
        stock -= quantity;
    }
}

public class BookDemo {
    public static void main(String[] args) {
        // Creating an array for storing details of n books
        BookDetails[] books = new BookDetails[3];

        // Initializing members
        books[0] = new BookDetails("Book1", "Author1", 20.0, 10);
        books[1] = new BookDetails("Book2", "Author2", 25.0, 15);
        books[2] = new BookDetails("Book3", "Author3", 30.0, 20);

        // Query availability of a book by author name
        String authorName = "Author1";
        System.out.println("Querying availability of books by author name: " + authorName);
        for (BookDetails book : books) {
            if (book.checkAvailabilityByAuthor(authorName)) {
                System.out.println("Book available: " + book.title);
            }
        }

        // Query availability of a book by book title
        String bookTitle = "Book2";
        System.out.println("\nQuerying availability of books by book title: " + bookTitle);
        for (BookDetails book : books) {
            if (book.checkAvailabilityByTitle(bookTitle)) {
                System.out.println("Book available: " + book.title);
            }
        }

        // Update stock of a book on purchase
        int purchaseQuantity = 3;
        String purchaseBookTitle = "Book1";
        for (BookDetails book : books) {
            if (book.checkAvailabilityByTitle(purchaseBookTitle)) {
                book.updateStockOnPurchase(purchaseQuantity);
                System.out.println("\nUpdated stock of book '" + book.title + "' after purchase: " + book.stock);
            }
        }

        // Update stock of a book on sell
        int sellQuantity = 2;
        String sellBookTitle = "Book3";
        for (BookDetails book : books) {
            if (book.checkAvailabilityByTitle(sellBookTitle)) {
                book.updateStockOnSell(sellQuantity);
                System.out.println("\nUpdated stock of book '" + book.title + "' after sell: " + book.stock);
            }
        }
    }
}
