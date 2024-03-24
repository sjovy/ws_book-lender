package se.lexicon.model;

import java.util.Objects;
import java.util.UUID;

public class Book {
    // Fields
    private String id;
    private String title;
    private String author;
    private boolean available;

    private Person borrower;

    // Constructors
    public Book(String title, String author) {
        this.title = Objects.requireNonNull(title, "Title cannot be null");
        this.author = Objects.requireNonNull(author, "Author cannot be null");
        this.id = generateId();
        this.available = true;
    }

    public Book(String title, String author, Person borrower) {
        this(title, author);
        // this.id = generateId();
        // this.title = Objects.requireNonNull(title, "Title cannot be null");
        // this.author = Objects.requireNonNull(author, "Author cannot be null");
        // this.available = true;
        setBorrower(borrower);
    }

    // Methods
    private String generateId() {
        return UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return available;
    }

    public Person getBorrower() {
        return borrower;
    }

    // Question 1 (good pracice?):
    public void setBorrower(Person borrower) {
        this.borrower = borrower;
        this.available = (borrower == null);
    }

    /*
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    */

    public String getBookInformation() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author + "\n" +
                "Available: " + available + ", Borrower: " +
                // Question 2A (some kind of if statement) and Question 3 (is this good practice?):
                (borrower != null ? " PersonId: " + borrower.getPersonId() : "none");
    }

    /*
    public String getBookInformation() {
        return "Book{ id=" + id + ", title=" + title + ", author=" + author + ", available=" + available +
                ", borrower=" + (borrower != null ? " PersonId: " + borrower.getPersonId() : "-") + " } ";
    }

    public String getBookInformation() {
        String borrowerInfo = borrower != null ? " PersonId: " + borrower.getPersonId() : "-";
        return String.format("Book{ id=%s, title=%s, author=%s, available=%b, borrower=%s }", id, title, author, available, borrowerInfo);
    }
    */

}