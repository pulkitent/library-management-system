package LibraryManagementSystem.Entities;

import LibraryManagementSystem.Service.BookReservationService;

public class Member {

    private Profile profile;
//    private BookReservationService bookReservationService;

    // Another Possibility
    /*public Member(Profile profile, BookReservationService bookReservationService) {
        this.profile = profile;
        // this.bookReservationService = bookReservationService;
    }*/

    public Member(Profile profile) {
        this.profile = profile;
    }

    // Open ended question (another possibility)
    /*public void checkout(Book book, Library library) {
        library.issue(book, this);
    }*/

    public void checkout(Book book, Library library) {
        // Another possibility (open ended question)
        // bookReservationService.reserveBook(book, this);

        // Another possibility (open ended question)
        // library.issue(book, this);

        BookReservationService.reserveBook(book, library, this);
    }
}
