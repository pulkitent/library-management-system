package LibraryManagementSystem;

import LibraryManagementSystem.Entities.Book;
import LibraryManagementSystem.Entities.Library;
import LibraryManagementSystem.Entities.Member;
import LibraryManagementSystem.Service.SearchService;

public class Startup {
  public static void main(String[] args) {
    Book book1 = new Book("RD Sharma");
    Book book2 = new Book("ML Sharma");

    Member member1 = new Member("Pulkit");
    Member member2 = new Member("Deepika");

    Library library = new Library();
    library.addBooks(book1);
    library.addBooks(book2);
    library.addMember(member1);
    library.addMember(member2);

    SearchService searchService = new SearchService(library);
    Book searchedBook = searchService.search("ML Sharma");
  }
}
