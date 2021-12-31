package LibraryManagementSystem.Service;

import LibraryManagementSystem.Entities.Book;
import LibraryManagementSystem.Entities.Library;
import LibraryManagementSystem.Entities.Member;

public class BookReservationService {
//    private Library library;

//    public BookReservationService(Library library) {
//        this.library = library;
//    }

    /*public void reserveBook(Book book, Member member) {
        library.issue(book, member);
    }*/

    // Open ended question (another possibility)
    public static void reserveBook(Book book, Library library, Member member) {
        library.issue(book, member);
    }
}
