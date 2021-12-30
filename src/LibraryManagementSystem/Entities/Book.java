package LibraryManagementSystem.Entities;

import java.util.Date;

public class Book {
  private Boolean isIssued;
  private Date issueDate;

  private String title;
  private String author;
  private String category;

  private Date publicationDate;

  public Book(Boolean isIssued, Date issueDate, String title, String author, String category, Date publicationDate) {
    this.isIssued = isIssued;
    this.issueDate = issueDate;
    this.title = title;
    this.author = author;
    this.category = category;
    this.publicationDate = publicationDate;
  }

  Boolean hasSameTitle(String title) {
    return this.title.equals(title);
  }

  public Book(String title) {
    this.title = title;
  }
}
