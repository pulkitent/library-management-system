package LibraryManagementSystem.Service;

import LibraryManagementSystem.Entities.Book;
import LibraryManagementSystem.Entities.Library;

public class SearchService {
  private Library library;

  public SearchService(Library library) {
    this.library = library;
  }

  public Book search(String Title) {
    return library.search(Title);
  }
}
