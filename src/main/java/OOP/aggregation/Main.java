package OOP.aggregation;
/*
 * Aggregation in Java (HAS-A Relationship)
 * ----------------------------------------
 * Aggregation is a form of association where one class "has-a" reference to another class.
 * It represents a weak relationship — the child class (e.g., Book) can exist independently
 * of the parent class (e.g., Library).
 *
 * In this example:
 * - A Library has many Books.
 * - But a Book can exist without being part of any Library.
 *
 * This is useful in real-world modeling where ownership is not strict and objects are loosely connected.
 */
public class Main {

    public static void main(String[] args) {

        // Create individual Book objects with title and number of pages
        Book book1 = new Book("Overgeared", 288);
        Book book2 = new Book("Wind Breaker", 306);

        // Print the book details using toString() method
        System.out.println(book1.toString());
        System.out.println(book2.toString());

        // Store both books in an array
        Book[] books = {book1, book2};

        // Create a Library object and associate it with the books array
        // This demonstrates Aggregation:
        // A Library "has-a" collection of Books, but the books can exist independently
        Library library = new Library("UUM", "Malaysia", books);

        // Display library details including books
        library.details();
    }
}
