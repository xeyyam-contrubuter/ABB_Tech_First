package az.abbtech.homework_8;

public class BorrowRequest {
    private String borrowerName;
    private String isbn;

    public BorrowRequest(String borrowerName, String isbn) {
        this.borrowerName = borrowerName;
        this.isbn = isbn;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public String getIsbn() {
        return isbn;
    }
}
