package LibraryManagementSystem;

import LibraryManagementSystem.Entities.*;
import LibraryManagementSystem.Service.BookReservationService;
import LibraryManagementSystem.Service.SearchService;

import java.util.Date;

public class Startup {
    public static void main(String[] args) {
        BookDetails detail = new BookDetails("title", "author", "category", new Date());
        Book book1 = new Book(1, new Date(), false, 1, detail);
        Book book2 = new Book(2, new Date(), false, 2, detail);

        Library library = new Library();

//        BookReservationService bookReservationService = new BookReservationService(library);

        Profile profile1 = new Profile("Pulkit");
        Profile profile2 = new Profile("Deepika");

        // Another Possibilyt
        /*Member member1 = new Member(profile1, bookReservationService);
        Member member2 = new Member(profile2, bookReservationService);*/

        Member member1 = new Member(profile1);
        Member member2 = new Member(profile2);

//        BookReservationService.reserveBook(book1, library, member1);

        library.addBooks(book1);
        library.addBooks(book2);
        library.addMember(member1);
        library.addMember(member2);

        SearchService searchService = new SearchService(library);
        Book searchedBook = searchService.search("ML Sharma");

        member1.checkout(book1, library);
    }
}
