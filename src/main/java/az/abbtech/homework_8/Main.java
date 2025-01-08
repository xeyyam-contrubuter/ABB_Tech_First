package az.abbtech.homework_8;

public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Example usage
        library.addBook("1984", "George Orwell", "12345");
        library.addBook("To Kill a Mockingbird", "Harper Lee", "67890");

        library.listBooks();

        library.addBorrowRequest("Alice", "12345");
        library.addBorrowRequest("Bob", "11111");

        library.processRequest();
        library.processRequest();
        library.processRequest();

        library.listBorrowers();
    }
}
