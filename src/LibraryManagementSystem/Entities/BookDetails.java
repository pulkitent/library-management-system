package LibraryManagementSystem.Entities;

import java.util.Date;

public class BookDetails {
    private String title;
    private String author;
    private String category;

    private Date publicationDate;

    public BookDetails(String title, String author, String category, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.publicationDate = publicationDate;
    }

    Boolean hasSameTitle(String title) {
        return this.title.equals(title);
    }
}
