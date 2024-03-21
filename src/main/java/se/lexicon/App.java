package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        // todo: needs completion

        // Create a book instance
        // Display book information

        // Create a person instance
        Person P1 = new Person("Thomas", "Sjövy");
        System.out.println("\n" + P1.getPersonInformation());
        Person P2 = new Person("Lasse", "Karlsson");
        System.out.println("\n" + P2.getPersonInformation());

        Book Book1 = new Book("Kärleksbibeln", "Daniel");
        System.out.println("\n" + Book1.getBookInformation());

        Book Book3 = new Book("Bilar och bussar", "Elnaz", P1);
        System.out.println("\n" + Book3.getBookInformation());

        Book1.setBorrower(P2);
        System.out.println("\n" + Book1.getBookInformation());

        Book1.setBorrower(null);
        System.out.println("\n" + Book1.getBookInformation());

        // Display person information

        // Loan a book to the person

        // Display person information after borrowing a book
        // Display book information after borrowing a book

        // Return the borrowed book

        // Display person information after returning the book
        // Display book information after borrowing a book

    }

}
