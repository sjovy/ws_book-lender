package se.lexicon;

import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Kärleksbibeln", "Daniel");
        System.out.println("\n" + book1.getBookInformation());
        Book book2 = new Book("Bilar och bussar", "Elnaz");
        System.out.println("\n" + book2.getBookInformation());

        Person P1 = new Person("Thomas", "Sjövy");
        System.out.println("\n" + P1.getPersonInformation());
        Person P2 = new Person("Lasse", "Karlsson");
        System.out.println("\n" + P2.getPersonInformation());

        P1.loanBook(book1);
        System.out.println("\n" + P1.getPersonInformation());
        System.out.println("\n" + book1.getBookInformation());

        P1.returnBook(book1);
        System.out.println("\n" + P1.getPersonInformation());
        System.out.println("\n" + book1.getBookInformation());


        //Book Book1 = new Book("Kärleksbibeln", "Daniel");
        //System.out.println("\n" + Book1.getBookInformation());

        //Book Book3 = new Book("Bilar och bussar", "Elnaz", P1);
        //System.out.println("\n" + Book3.getBookInformation());

        //Book1.setBorrower(P2);
        //System.out.println("\n" + Book1.getBookInformation());

        //Book1.setBorrower(null);
        //System.out.println("\n" + Book1.getBookInformation());



    }

}
