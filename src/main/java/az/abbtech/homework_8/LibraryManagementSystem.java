package az.abbtech.homework_8;
import java.util.*;

public class LibraryManagementSystem {
    private List<Book> books;
    private Queue<BorrowRequest> borrowRequests;
    private Set<String> uniqueBorrowers;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
        borrowRequests = new LinkedList<>();
        uniqueBorrowers = new HashSet<>();
    }

    // Add a book to the library
    public void addBook(String title, String author, String isbn) {
        books.add(new Book(title, author, isbn));
        System.out.println("Book added: " + title);
    }

    // List all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Add a borrow request to the queue
    public void addBorrowRequest(String borrowerName, String isbn) {
        borrowRequests.add(new BorrowRequest(borrowerName, isbn));
        System.out.println("Borrow request added for: " + borrowerName);
    }

    // Process the next borrow request
    public void processRequest() {
        if (borrowRequests.isEmpty()) {
            System.out.println("No borrow requests to process.");
            return;
        }

        BorrowRequest request = borrowRequests.poll();
        String isbn = request.getIsbn();
        String borrowerName = request.getBorrowerName();

        Optional<Book> bookToBorrow = books.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst();

        if (bookToBorrow.isPresent()) {
            books.remove(bookToBorrow.get());
            uniqueBorrowers.add(borrowerName);
            System.out.println("Borrow request processed. Book borrowed: " + bookToBorrow.get().getTitle());
        } else {
            System.out.println("Book with ISBN " + isbn + " not found in the library.");
        }
    }

    // List all unique borrowers
    public void listBorrowers() {
        if (uniqueBorrowers.isEmpty()) {
            System.out.println("No borrowers yet.");
        } else {
            System.out.println("Unique borrowers:");
            for (String borrower : uniqueBorrowers) {
                System.out.println(borrower);
            }
        }
    }
}
