package se.lexicon.model;

import java.util.UUID;

public class Book {
    // Fields
    private String id;
    private String title;
    private String author;
    private boolean available;

    private Person borrower;

    // Constructors
    public Book(String title, String author){
        this.id = generateId();
        this.available = true;
        setTitle(title);
        setAuthor(author);
        setBorrower(borrower);
    }

    public Book(String title, String author, Person borrower){
        this.id = generateId();
        this.available = true;
        setTitle(title);
        setAuthor(author);
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Person getBorrower() {
        return borrower;
    }

    public void setBorrower(Person borrower) {
        setAvailable(true);
        this.borrower = borrower;
        if(borrower != null) {
            setAvailable(false);
        }
    }

    public String getBookInformation(){
        return "ID: " + id + ", Title: " + title + ", Author: " + author + ", Available: " + available;
    }


    // todo: needs completion
}