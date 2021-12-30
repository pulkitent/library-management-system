package LibraryManagementSystem.Entities;

import java.util.List;

public class Library {
  private List<Book> books;
  private List<Member> members;

  public Book search(String title) {
    for (Book book : books) {
      if (book.hasSameTitle(title))
        return book;
    }
    return null;
  }

  public void addBooks(Book book) {
    books.add(book);
  }

  public void addMember(Member member) {
    members.add(member);
  }
}
