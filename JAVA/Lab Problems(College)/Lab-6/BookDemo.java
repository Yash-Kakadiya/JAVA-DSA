/* Declare a class called book having author_name as private data 
    member. Extend book class to have two sub classes called 
    book_publication & paper_publication. Each of these classes have 
    private member called title. Write a complete program to show 
    usage of dynamic method dispatch (dynamic polymorphism) to 
    display book or paper publications of given author. */

public class BookDemo {
    public static void main(String[] args) {
        book_publication b1 = new book_publication("Tony Stark", "Book 1");
        paper_publication p1 = new paper_publication("Peter Parkar", "Paper 1");

        Book book1 = b1;
        Book book2 = p1;

        System.out.println("Displaying book publication:");
        book1.display();
        System.out.println("----------------------------------");

        System.out.println("\nDisplaying paper publication:");
        book2.display();
        System.out.println("----------------------------------");
    }
}

class Book {
    private String author_name;

    public Book(String author_name) {
        this.author_name = author_name;
    }

    public void display() {
        System.out.println("Author: " + author_name);
    }
}

class book_publication extends Book {
    private String title;

    public book_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}

class paper_publication extends Book {
    private String title;

    public paper_publication(String author_name, String title) {
        super(author_name);
        this.title = title;
    }

    public void display() {
        super.display();
        System.out.println("Title: " + title);
    }
}
